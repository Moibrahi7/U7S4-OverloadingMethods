# U6S4 - Overloading Methods

* Part A - Foundations 7.4
* Part B - Foundations Practice
* Part C Algorithm Challenge

## Part A

### Exercise 01

#### Step 01

In the package `partA.ex01` look at the file `PlayerTest`

#### Step 02
* Overload the existing constructor
  * Create your own zero-argument constructor
  * Calling this constructor should initialize fields with the
  following values
  * Instantiate an object with this constructor
```
Variable: p02
Name: null
Height: 0.0
yearsInLeague: 0

```

#### Step 03
* Write a method that prints every Player field
  * This should be a zero-argument method
* Overload this method to accept a boolean argument
  * If the boolean is true, this method should call the think()
  method
*  Call both versions of this method on an object

#### Step 04
* Continue editing with the `PlayerTest` class
* Identify and minimize any repeated code in the
  constructor and display() methods

Your program is working correctly, if when run, the following is the output:

```
Name: Kyrie
Height: 1.88
yearsInLeague: 11
Name: Kyrie
Height: 1.88
yearsInLeague: 11
I'll have my win.

```

## Part B

### Exercise 01

#### Step 01

In the package `partB.ex01` look at the file `EmptyMethodExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex01` complete the `Method` per the following:

* Create a program with a method (outside of the main method) that asks two questions, saves each user response, and eventually prints it back out to the user.
* Call the question method inside of the main method.

Your program is working correctly, if when run, the following is the output:

```
What's your first name?
Stephanie
And how old are you Stephanie?
28
Stephanie I see that you're 28 years old.

```

> Use EmptyMethodExample for reference.

### Exercise 02

#### Step 01

In the package `partB.ex02` look at the file `MethodWithParametersExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex02` complete the `MethodWithParameters` per the following:

* Create a program that has two different parameterized methods - outside of the main method
* One method should perform multiplication on two numbers and the other method should perform division on two numbers
    * Both should return the correct mathematical result
* Call each method inside of the main method and print out the results

Your program is working correctly, if when run, the following is the output:

```
multiplication result: 10
division result: 2.5
```

> Use MethodWithParametersExample for reference.


### Exercise 03

#### Step 01

In the package `partB.ex03` look at the file `OverloadingMethodExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex03` complete the `MethodOverload` per the following:

* Create a program that has two methods outside of the main method
* The first method should take in a character and a number and then print out a sentence containing each
* Overload that method so that it takes in a number and then a character - print out that sentence containing each
* Call both methods inside of the main method to see the result

Your program is working correctly, if when run, the following is the output:

```
First I print the character a and then the number 2
First I print the number y and then the character 1
```

> Use OverloadingMethodExample for reference.

## Part C
### Problem 1
Again, we are looking for numbers that are within the range 10...20 inclusive.
But this time we are looking for the max value within that range out of the 2 positive int values.

Return the larger value that is in the range 10...20,
or return 0 if neither number is in that range.

Example:
```java
larger1020(11, 19) --> 19
larger1020(19, 11) --> 19
larger1020(11, 9) --> 11
```
### Problem 2
Create the string to look like it's going up; like a hill. To do this we need to take the last 3 characters
and make them uppercase. Even if there's less than 3 characters, just make whatever is there uppercase.
Doing this allows the string to look like it's going up and down depending on if begins with uppercase or not.

Tip: str.toUpperCase() returns the uppercase version of a string

Return a new string where the last 3 characters are now in upper case.

Example:
```java
goingUp("Hello") --> "HeLLO"
goingUp("hi there") --> "hi thERE"
goingUp("hi") --> "HI"
```
