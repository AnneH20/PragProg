# Week 2 Non-Coding Exercises

## Exercise #15

How many numbers are in the series 0, 5, 10, 15, ..., 100?

## Exercise #16

A quick reality check. Which of these “impossible” things can happen?
* A month with fewer than 28 days
* Error code from a system call: can’t access the current directory 
* In C++: **a = 2; b = 3;** but **(a + b)** does not equal **5**
* A triangle with an interior angle sum ≠ 180°
* A minute that doesn’t have 60 seconds
* **(a + 1) <= a**

## Exercise #17

Some C and C++ developers make a point of setting a pointer to **NULL** after they deallocate the memory it references. 
Why is this a good idea?

## Exercise #18

Some Java developers make a point of setting an object variable to **NULL** after they have finished using the object. 
Why is this a good idea?

## Exercise #20

Which of these technologies (perhaps in combination) would be a good fit for the following situations:
* If you receive three _network interface down_ events within five minutes, notify the operations staff.
* If it is after sunset, and there is motion detected at the bottom of the stairs followed by motion detected at the 
top of the stairs, turn on the upstairs lights.
* You want to notify various reporting systems that an order was completed.
* In order to determine whether a customer qualifies for a car loan, the application needs to send requests to three 
backend services and wait for the responses.

## Exercise #21

Can you express the following requirements as a top-level transformation? That is, for each, identify the input and the output.
1. Shipping and sales tax are added to an order
2. Your application loads configuration information from a named file
3. Someone logs in to a web application

## Exercise #22


You’ve identified the need to validate and convert an input field from a string into an integer between 18 and 150. 
The overall transformation is described by

```
field contents as string
    -> [validate & convert]
        -> {:ok, value} | {:error, reason}
```

Write the individual transformations that make up _validate_ & _convert_.
