Exercise #1
-----------
Orthogonal - things are independent of one another (not tightly coupled)

Split2 is more orthogonal because it's only focus is splitting the line. Split1 has multiple functionalities with in it. It is opening/reading files and splitting the line.


Exercise #2
-----------
OO languages - has a lot of coupling features (inheritance, overloading, etc.)
FP languages - has more of a focus on keeping things decoupled but can contain some coupling as well (like for data transformations)

FP is technically more orthogonal with is base features/design/usage
But, it depends on how people use them. The user can make things coupled despite the proposed usage of the different languages. If they aren't paying attention to the way they're coding, then both OO and FP can be incredibly coupled and not orthogonal.


Exercise #3
-----------
Whiteboards, scratch paper, sticky notes, Microsoft Paint, pretty much anything you can use to write/draw on


Exercise #6
-----------
```
<time> ::= <hour> ":" <minute-t> <digit> | <hour <ampm> | <hour> ":" <minute-t> <digit> <ampm>

<hour> ::= "0 <digit> | "1" <digit> | "2" <digit>

<minute-t> ::= "0" | "1" | "2" | "3" | "4" | "5"

<digit> ::= "0" | "1" | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"

<ampm> ::= "am" | "pm"
```

Exercise #9
-----------
We can assume that:
- the storage device has all the information needed to be transferred
- we know the speed of the human
- we know the distance between the computers
- we don't need to know how long it would take to transfer data to/from the storage device
- weather is not a factor
- data integrity is not an issue
- no latency in the computers or the


Exercise #10
------------
According to the internet, we can assume these stats:
- It takes ~2.5 hours to transfer 1TB of storage at 1GBps
- The average walking pace for a human is 3 mph

So, assuming no data loss or other external factors, we can say that the human will have a higher bandwidth until the distance between the computers goes above 7.5 miles.

`3 mph * 2.5 hours = 7.5 miles` that a human can be faster at transferring data


