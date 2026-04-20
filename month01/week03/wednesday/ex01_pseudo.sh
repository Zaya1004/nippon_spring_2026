#!/bin/bash

pl=+
mi=-
tu=*
wa=/
read -p "Enter 1st number:" num1
read -p "Enter 2nd number:" num2
read -p "choose +, -, *, /" op
 
if  ["$pl" ]; then
  echo "$((num1 + num2))
 elseif ["$mi" ]; then
  echo "$((num1 - num2))"
 elseif ["$tu" ]; then
  echo "$((num1 * num2))"
 elseif [ "&wa" ]; then
  echo "num1 / num2"
endif
