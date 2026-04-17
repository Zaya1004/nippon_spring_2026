#!/bin/bash
read -p "sar oruulna uu (1-12): " month
 
case $month in
    1) echo "uvul" ;;
    2) echo "uvul" ;;
    3) echo "havar" ;;
    4) echo "havar" ;;
    5) echo "havar" ;;
    6) echo "zun" ;;
    7) echo "zun" ;;
    8) echo "zun" ;;
    9) echo "namar" ;;
    10) echo "namar" ;;
    11) echo "namar" ;;
    12) echo "uvul" ;;
    *) echo "buruu orolt. 1-12 oruulna uu." ;;
esac
