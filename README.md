Unix Tools
====================
This repository has the simulated implementation of different unix-tools `wc, cut, head,
tail, sort, uniq` and also one extra functionality that is `reduceSpaces`.

## wc :
##### Stands for word count, wc displays a count of lines, words, and characters in a file.
    * tk_wc.sh filename

## cut :
#### Filters and gives the asked columns in given file.
    * tk_cut.sh filename

## head:
#### Head gives the first `n` lines from the given files.
    * tk_head.sh filename

## tail:
#### Tail gives the first `n` lines from the given files.
    * tk_tail.sh filename


## sort:
#### Sorts the lines in a file.
    * tk_sort.sh Filename

## uniq:
#### Filters out the adjacent  repeated lines in a file.
    * tk_uniq.sh Filename

## reduceSpaces:
#### Reduces more than one occurrences of blank spaces into one. Takes a input file and writes into another file.
    * tk_reduceSpaces.sh InputFile outputFile