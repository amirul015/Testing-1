#! /bin/bash

read filename

if [ -f $filename ]; then
	while read line
	do
		# get the first character from the line
		first_character=$(echo $line | cut -c 1)
		if [ $first_character == "M" -o $first_character == "A" ]; then
			echo $line | cut -d '/' -f 3 >> added.txt
		elif [ $first_character == "R" -o $first_character == "D" ]; then
			echo $line | cut -d '/' -f 3 >> removed.txt
		fi
	done < $filename
fi
