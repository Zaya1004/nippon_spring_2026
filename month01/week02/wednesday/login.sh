#!/bin/bash

CODE="icode2024"
i=3


while [ $i -gt 0 ];
do
 read -p "enter password:" password
  

  if ["$CODE" = "$CODE" ]; then
      echo "enter!"
      exit 0
  else
     i=$((i - 1))
     if [ $i  -gt 0]; then
         echo "wrong! you have $i chance"
       else
         echo "blocked"
     fi
  fi
done

