# Exercise #4

We want to implement a mini-language to control a simple turtle-graphics system. The language consists of single-letter 
commands, some followed by a single number. For example, the following input would draw a rectangle:

```
P 2 # select pen 2
D # pen down
W 2 # draw west 2cm
N 1 # then north 1
E 2 # then east 2
S 1 # then back south 1
U # pen up
```

Implement the code that parses this language. it should be designed so that it is simple to add new commands.

# Exercise #5

In the previous exercise we implemented a parser for the drawing language—it was an external domain language.
Now implement it again as an internal language. Don’t do anything clever: just write a function for each of the commands.
You may have to change the names of the commands to lower case, and maybe to wrap them inside something to provide some context.

## Solution

[Solutions to Exercises #4 and #5](https://github.com/AnneH20/Notes/blob/main/src/main/kotlin/turtle)