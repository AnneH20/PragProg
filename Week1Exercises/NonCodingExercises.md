# Week 1 Non-Coding Exercises

## Exercise #1

You’re asked to read a file a line at a time. For each line, you have to split it into fields. 
Which of the following sets of pseudo class definitions is likely to be more orthogonal?

```
class Split1 {
    constructor(fileName)   # opens the file for reading
    def readNextLine()      # moves to the next line
    def getField(n)         # returns nth field in current line
}
```

```
class Split2 {
    constructor(line)   # splits a line
    def getField(n)     # returns nth field in current line
}
```

## Exercise #2

What are the differences in orthogonality between object-oriented and functional languages? 
Are these differences inherent in the languages themselves, or just in the way people use them?

## Exercise #3

Marketing would like to sit down and brainstorm a few web page designs with you. They are thinking of clickable image 
maps to take you to other pages, and so on. But they can’t decide on a model for the image—maybe it’s a car, or a phone, 
or a house. You have a list of target pages and content; they’d like to see a few prototypes. 
Oh, by the way, you have 15 minutes. What tools might you use?

## Exercise #6

Design a BNF grammar to parse a time specification. All of the following examples should be accepted:

```
4pm, 7:38pm, 23:42, 3:16, 3:16am
```

## Exercise #9

You are asked "Which has a higher bandwidth: a 1Gbps net connection or a person walking between two computers with a 
full 1TB of storage device in their pocket?" What constraints will you put on your answer to ensure that the scope of 
your response is correct? (For example, you might say that the time taken to access the storage device is ignored.)

## Exercise #10

So, which has the higher bandwidth?