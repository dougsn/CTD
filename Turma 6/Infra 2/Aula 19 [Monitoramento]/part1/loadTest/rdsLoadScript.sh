#!/bin/bash

tables=$(($5+1))
iterations=$(($4+1))

tables_count=1
iteration=1

while [ "$iteration" -lt "$iterations" ]; do
  tables_count=1
  dbname="t_$7$6${iteration}_db"
  echo "CREATE DATABASE $dbname;" | mysql -h$1 -u$2 -p$3 
  
  while [ "$tables_count" -lt "$tables" ]; do
    
    echo -e "import User:$6\tGroupDBName$dbname\tDb:[${iteration}/$4]\tTable:[${tables_count}/$5]"
    
    cat Sample-SQL-File-500000rows.sql        | \
      sed "s;%ITERATION%;;g"                  | \
      sed "s;%TABLEN%;${tables_count};g"        \
      > ./dump-$dbname-$tables_count.sql.temp

    while [ ! -f ./dump-$dbname-$tables_count.sql.temp ]; do 
      sleep 1s;
    done

    mysql -h$1 -u$2 -p$3 $dbname < ./dump-$dbname-$tables_count.sql.temp
    rm ./dump-$dbname-$tables_count.sql.temp
  
    ((tables_count=tables_count+1))
  done

  ((iteration=iteration+1))
done