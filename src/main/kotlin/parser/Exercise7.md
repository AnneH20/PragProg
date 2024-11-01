# Exercise #7

Implement a parser for the BNF grammar in the previous exercise using a PEG parser generator in the language of 
your choice. The output should be an integer containing the number of minutes past midnight.

BNF grammar from the previous exercise:

```
<time> ::= <hour> ":" <minute-t> <digit> | <hour> <ampm> | <hour> ":" <minute-t> <digit> <ampm>

<hour> ::= "0" <digit> | "1" <digit> | "2" <digit>

<minute-t> ::= "0" | "1" | "2" | "3" | "4" | "5"

<digit> ::= "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"

<ampm> ::= "am" | "pm"
```

## Solution

%[https://github.com/AnneH20/Notes/blob/main/src/main/kotlin/parser/Exercise7.kt]