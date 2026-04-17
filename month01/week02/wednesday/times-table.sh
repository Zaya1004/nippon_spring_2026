#!/bin/bash

B=$1

for ((i=1; i<=10; i++)); do
       echo "$B x $i = $((i*B))";
done

for ((i=2; i<=20; i=i+2)); do
  echo "$i"
done

