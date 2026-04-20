#!/bin/bash
MAX=0
for i in {1..5}; do
   read -p "Enter number" a
 if [ $a -gt $MAX ]; then
   MAX=$a
 fi
done
   echo "$MAX"

