#!/bin/bash
read -p "garagiin ner (1-7): " day

case $day in
    1) echo "davaa" ;;
    2) echo "mygmar" ;;
    3) echo "lhagva" ;;
    4) echo "purev" ;;
    5) echo "baasan" ;;
    6) echo "byamba" ;;
    7) echo "nyam" ;;
    *) echo "buruu orolt. 1-7 oruulna uu." ;;
esac
