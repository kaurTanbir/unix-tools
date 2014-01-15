Unix Tools
====================
This repository has the simulated implementation of different unix-tools `wc, cut, head,
tail, sort, uniq` and also one extra functionality that is `reduceSpaces`.

#### Tool Usage
Include jar file to your Project


To run from command line :-
```java
java -cp <path>unix-tools.jar  toolName   arguments
```

## wc :
##### Stands for word count, wc displays a count of lines, words, and characters in a file.
    * tk_wc.sh filename

## cut :
#### Filters and gives the asked columns in given file.
    * tk_cut.sh filename FieldNumber [OPTIONS .. delimeter]

## head:
#### Head gives the first `n` lines from the given files.
    * tk_head.sh filename -[Number of lines]

## tail:
#### Tail gives the first `n` lines from the given files.
    * tk_tail.sh filename -[Number of lines]


## sort:
#### Sorts the lines in a file according to given options: -r for reverse; -n for numeric sort. without options sort default by alphabet.
    * tk_sort.sh Filename [OPTIONS..]

## uniq:
#### Filters out the adjacent  repeated lines in a file.
    * tk_uniq.sh Filename

## reduceSpaces:
#### Reduces more than one occurrences of blank spaces into one. Takes a input file and writes into another file.
    * tk_reduceSpaces.sh InputFile outputFile

    ####SHELL FILES
    You Can Also Use These Commands same as Your Shell Commands


    Just Download unix-tools.jar file and shell files in the same folder


    ####HOW TO RUN?

    just run setPath shell file once and you are done


    `$sh setPath.sh`

    That's it, Now you are ready to run these commands
    ####RUN COMMANDS


    `$sh ta_runWC.sh filename.txt`