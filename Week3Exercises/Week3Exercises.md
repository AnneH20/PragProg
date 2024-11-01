# Week 3 Non-Coding Exercises

## Exercise #23

In _Language X Doesn't Have Pipelines_ we wrote:

```
const content = File.read(file_name);
const lines = find_matching_lines(content, pattern)
const result = truncate_lines(lines)
```

Many people write OO code by chaining together method calls, and might be tempted to write this as something like:

```
const result = File.read(file_name)
    .find_matching_lines(pattern)
    .truncate_lines()
```

What’s the difference between these two pieces of code? Which do you think we prefer?

## Exercise #24

Would a blackboard-style system be appropriate for the following applications? Why, or why not?

_Image processing_. You’d like to have a number of parallel processes grab chunks of an image, process them, and put the 
completed chunk back.

_Group calendaring_. You’ve got people scattered across the globe, in different time zones, and speaking different 
languages, trying to schedule a meeting.

_Network monitoring tool_. The system gathers performance statistics and collects trouble reports, which agents use to 
look for trouble in the system.

## Exercise #25

A data feed from a vendor gives you an array of tuples representing key-value pairs. The key of **DepositAccount** will hold 
a string of the account number in the corresponding value:

```
[
    ...
    {:DepositAccount, "564-904-143-00"}
    ...
]
```

It worked perfectly in test on the 4-core developer laptops and on the 12-core build machine, but on the production 
servers running in containers, you keep getting the wrong account numbers. What’s going on?

## Exercise #26


You’re coding an autodialer for voice alerts, and have to manage a database of contact information. The ITU specifies 
that phone numbers should be no longer than 15 digits, so you store the contact’s phone number in a numeric field 
guaranteed to hold at least 15 digits. You’ve tested in thoroughly throughout North America and everything seems fine, 
but suddenly you’re getting a rash of complaints from other parts of the world. Why?

## Exercise #27

You have written an app that scales up common recipes for a cruise ship dining room that seats 5,000. But you’re getting 
complaints that the conversions aren’t precise. You check, and the code uses the conversion formula of 16 cups to a gallon.
That's right, isn't it?

## Exercise #28

We coded a set of simple sort routines in [Rust](https://github.com/AnneH20/Notes/blob/main/src/main/ruby). Run them on various machines available to you. Do your figures 
follow the expected curves? What can you deduce about the relative speeds of your machines? What are the effects of 
various compiler optimization settings?

## Exercise #29

In _Common Sense Estimation_, on page 206, we claimed that a binary chop is O(lg n). Can you prove this?

## Exercise #30

In Figure 3, _Runtimes of various algorithms_, on page 205, we claimed that O(lg n) is the same as O(log<sub>10</sub>n) 
(or indeed logarithms to any base). Can you explain why?

## Exercise #31

Look back at the warehouse example. Are there any other properties that you can test?

## Exercise #32

Your company ships machinery. Each machine comes in a crate, and each crate is rectangular. The crates vary in size. 
Your job is to write some code to pack as many crates as possible in a single layer that fits in the delivery truck. 
The output of your code is a list of all the crates. For each crate, the list gives the location in the truck, along 
with the width and height. What properties of the output could be tested?

## Exercise #33

Think about the code you’re currently working on. What are the properties: the contracts and invariants? Can you use 
property-based testing framework to verify these automatically?

