Exercise #23
------------
The second code links all the objects to depend on one another. You need the result from `content_of` before you can do
`find_matching_lines` and so forth.

If these were the only dependent code, I would prefer the second code implementation because it is cleaner and easier to
read. But, if there were more objects added to the get the result, it would be too coupled and thus easier to break.

Exercise #24
------------
_Image processing._

It wouldn't be the best since you are working in parallel. A blackboard would be helpful if there was feedback from someone
about the processes.

_Group calendaring._

Yes. You can post the meetings' information and others' availability to the blackboard. You can set it up so the different
formats/languages don't matter except for those that are actually in the meeting. If they aren't in the meeting, they don't
need to know about the meeting.

_Network monitoring tool._

Yes. You can use the blackboard to post all the statistics and trouble reports. The agents can then look at the blackboard
and gather the information they need to fix the problem. 

Exercise #25
------------
In key-value pairs, the keys are typically unique. If they are duplicated, then there are errors thrown in the system. 
These key-value pairs are being stored in an array. Arrays don't have constraints on the uniqueness of the keys, so
duplicates may be allowed. 

Exercise #26
------------
America is weird and therefore proclaims that we will not do anything like the rest of the world. In America, we can have
just numeric phone numbers. In other parts of the world, they can over other symbols like `+` or `#`. If you are storing
phone numbers from all over the world, not just America, you should store the phone numbers as strings not numeric values.

Exercise #27
------------
Again, the US is weird. Our conversion systems says that `1 US liquid gallon = 16 US cups`. Whatever an Imperial cup is,
it takes `13.3` of them to make 1` US liquid gallon`. The cruise ship should be using whatever system the most people are
comfortable with. Typically, not the US system.

Exercise #28
------------
(Run the code)

Exercise #29
------------


Exercise #30
------------
According to math, to convert from log n to log<sub>10</sub>n, you must do:

log<sub>b</sub>x = log<sub>c</sub>x / log<sub>c</sub>b

Since log<sub>c</sub>b is a constant, we ignore it in Big O notation.

Exercise #31
------------
If the warehouse has enough inventory, then the order will succeed. You can test this by placing orders of various quantities
and returning an "OK" message if the order is successful. Otherwise, throw "Insufficient Inventory" error.

Exercise #32
------------
1. Is it possible that the crates will exceed the dimensions of the truck?
2. Will/can the crates overlap/interlock?
3. How dense can you pack the truck?
4. Is there a weight limit for the truck?

Exercise #33
------------
1. Genuine requirement
2. Not really a requirement from the statement alone. Just a suggestion since there is a possibility that it will be 
changed down the line. It could potentially be a genuine requirement if there are company-wide standards for background
colors, what certain branding the team is using, etc. 
3. Not a genuine requirement. It is a software architecture design. You need to ask the users directly what they want rather
than a solution that would give them something.
4. It's a requirement, but more specific wording would be helpful. Saying something like "Errors will be thrown for invalid
fields inputted by the user" would be more helpful.
5. This is definitely a requirement. It is a specific action that the software must do. 
