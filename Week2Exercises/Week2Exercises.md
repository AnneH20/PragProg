Exercise #15
------------
5 10 15 20 25 30 35 40 45 50 

55 60 65 70 75 80 85 90 95 100

21 numbers

Exercise #16
------------
* A month with fewer than 28 days - probably depending on the calendar you look at
* Error code from a system call: can't access the current directory - defintely can happen
* In C++: a=2; b=3; but (a+b) doesn't equal 5 - in some weird world probably because computers are dumb
* A triangle with an interior angle sum that doesn't equal 180 degress - if it's a messed up triangle, anything is possible
* A minute that doesn't have 60 seconds - no idea. maybe not? but if the calendar is wrong, then time itself could be wrong.
* (a+1) <= a - can't think of a scenario where this would be true but everything else has had a true aspect to it.

Exercise #17
------------
To make sure the pointer actually has something there even if it's null. There can be errors when memory has been deallocated but is still referenced.

Exercise #18
------------
So it doesn't break everything if it's referenced again after being deallocated?


Exercise #20
------------
??

Exercise #21
------------
* Shipping and sales tax are added to an order = initial order -> final order (w/ tax + shipping)
* Your application loads configuration information from a named file = name of file -> configuration stuff
* Someone logs in to a web application = user/user creds -> app session

Exercise #22
------------
```
field contents as string
    -> [validate & convert]
        -> {:ok, value} | {:error, reason}
```

using an int between 18 and 150...

```
field contents as string
	-> [string to int] (convert)
	-> [is value >= 18] (validate)
	-> [is value <= 150] (validate continued)
		-> {:ok, value} | {:error, reason}
```