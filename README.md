# Manipulated-Priority-Queue
This is a second-year assignment for an Algorithms & Data Structures module. The objective is to manipulate a priority queue according to the following INSERT and REMOVE commands below, and then output the String at the front of the priority queue.

- "INSERT avocado
- INSERT lemon
- REMOVE
- INSERT orange"

Inserted strings are entered into the priority queue according to the length of the string, with shorter strings at the front and longer strings at the back.  When two strings have equal length, positioning is ordered alphabetically, with the words closer to the front of the dictionary (e.g. aardvark, apple) going towards the front of the priority queue, and the ones closer to the end of the dictionary going towards the back (e.g. zip, zoo).

I implemented the priority queue using an array.
