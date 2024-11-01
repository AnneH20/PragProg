# Exercise #7

Implement a parser for the BNF grammar in the previous exercise using a PEG parser generator in the language of 
your choice. The output should be an integer containing the number of minutes past midnight.

BNF grammar from the previous exercise:

```
<time> ::= <hour> ":" <minute> <digit> | <hour> <ampm> | <hour> ":" <minute> <digit> <ampm>

<hour> ::= 0 <digit> | 1 <digit> | 2 <digit> | <digit>

<minute> ::= 0 <digit> | 1 <digit> | 2 <digit> | 3 <digit>| 4 <digit> | 5 <digit>

<digit> ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9

<ampm> ::= "am" | "pm"
```

# Exercise #8

Implement the time parser using a scripting language and regular expressions.

## Solution

To run Exercise7.pegjs, go to this [website](https://peggyjs.org/online.html) and paste the code to run the PEGjs
parser online.

[Solutions to Exercises #7 and #8](https://github.com/AnneH20/Notes/blob/main/src/main/code/parser)