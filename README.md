Unix Tools
====================
This repository has the simulated implementation of different unix-tools
`wc, cut, head,tail, sort, uniq` and also one extra functionality that is `reduceSpaces`.

#### Tool Usage


To run from command line :-
```java
java -cp <path>unix-tools.jar  toolName   arguments
```

####SHELL FILES
You Can Also Use These Commands same as Your Shell Commands

just run the build file and download zip folder

    * `ant`

unzip the zip folder and set the path as

    *`UNIXTO0LS_SH`


####HOW TO RUN?
in the PATH set path as given below to run shell scripts
    *%UNIXTOOLS_SH%/bin

That's it, Now you are ready to run these commands
####RUN COMMANDS

`$sh tk_wc.sh filename.txt`


## wc :
Stands for word count, wc displays a count of lines, words, and characters in a file.
    * tk_wc.sh filename

## cut :
Filters and gives the asked columns in given file.
    * tk_cut.sh filename FieldNumber [OPTIONS .. delimeter]

    Flags:  -f for fieldNumber
            -d for delimeter

## head:
Head gives the first `n` lines from the given files.
    * tk_head.sh filename -[Number of lines]

    Flags:  -[number] for Number Of Lines

    Default: gives starting 10 lines

## tail:
Tail gives the first `n` lines from the given files.
    * tk_tail.sh filename -[Number of lines]

    Flags:  -[number] for Number Of Lines

    Default: gives last 10 lines

## sort:
Sorts the lines in a file according to given options: -r for reverse; -n for numeric sort.
    * tk_sort.sh Filename [OPTIONS..]

    Flags: -r for reverse sorting

    Default: sort by first character of line.


## uniq:
Filters out the adjacent  repeated lines in a file.
    * tk_uniq.sh Filename



## reduceSpaces:
Reduces more than one occurrences of blank spaces into one. Takes a input file and writes into another file.
    * tk_reduceSpaces.sh InputFile outputFile
