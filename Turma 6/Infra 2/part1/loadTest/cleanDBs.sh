#!/bin/bash

for db in `echo "SHOW DATABASES;" | mysql -h $1 -u$2 -p$3 | grep $4`; do
  echo delete $db
  echo "DROP DATABASE $db;" | mysql -h $1 -u$2 -p$3
done