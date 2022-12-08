#!/bin/bash

. .env

cd loadTest 
time bash runInParallel.sh $DNS_DB $USER $PASSWORD $NUM_DBS $NUM_TABLES $NUM_USERS $TEST_NAME