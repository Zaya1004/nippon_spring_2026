#!/bin/bash
read -p " 1st number=$1 " number1
read -p " operator (+, -, *, /) " operator 
read -p " 2nd number=$2 " number2 day

case $operator in
  "+") echo " $((number1 + number2)) " ;;
  "-") echo " $((number1 - number2)) " ;;
  "*") echo " $((number1 * number2)) " ;;
  "/") echo " $((number1 / number2)) " ;;
esac
  
