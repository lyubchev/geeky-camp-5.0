#!/bin/bash
param1="==EEE=="
param2="==DDD=="
param3="==TTT=="
param4="==CHCHCH--"
pesho="mnogoqkoneshto"

cat $1 |
while read LINE
do
    eval echo $(echo $LINE | sed -r 's/@(\w+)@/\$\1/g')
done
