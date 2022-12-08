#!/bin/bash

f=0
n=0

./cleanDBs.sh $1 $2 $3 $7

while [ "$n" -lt "$6" ]; do
    ./rdsLoadScript.sh $1 $2 $3 $4 $5 $n $7 &
    ((n=n+1))
done

sleep 1s

while [ "$f" == "0" ]; do
 sleep 1s
 ls | grep "sql.temp" > /dev/null ;
 f=$?
done

echo "end."