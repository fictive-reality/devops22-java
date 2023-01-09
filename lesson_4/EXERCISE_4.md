# Exercise 4

## Instructions

The main goal of this exercise is to learn Java class syntax and object oriented design. 

### Group `Exercise` Object Oriented Java

- Pick a design problem, e.g.
-- A simulator to drive different vehicles
-- A simple bank app where you can have different types of accounts, e.g. savings (interest) and checkings
-- A game where you take care of a small zoo
-- A drawing app where you can place different shapes of different sizes
-- A simple HR system with managers and employees that can be hired or let go
-- A simple webshop system that sells hats
-- A presentation slide app where each slide can be either a text, an image or a table
-- Shared software for various models of smart home lights (e.g. basic, dimmable, motion-activated) 
-- Or come up with your own idea of a real world problem to design

For your design problem, do:
1. Write down at least 10 nouns (things) and verbs (actions or behaviours) that are important to represent the problem in software
2. Define at least 3 different classes and 1 interface from these words
3. Draw on paper ![a diagram like this](https://www.tutorialspoint.com/uml/images/uml_class_diagram.jpg) that shows how the classes interact (inheritance, methods and fields)
4. Take a photo of your final design (or digitalize it some other way) and share with all team members
5. If time allows: present to the class

### Individual `Exercise`

Take the design from the group and write it as a set of minimal Java code files. Ensure you have somewhere used the keywords `extends`, `implements`, `@Override` for inheritance, and `public`, `private` for encapsulation. The code should compile (no warnings in editor) but no logic is needed - the methods don't need to *do* anything, they can be *dummy* methods and you can just return default values where necessary.

## Note on dummy methods

When prototyping, when doing test-driven development or similar dummy methods can be very useful. A dummy method is simply a method with a correct "header", that is name and arguments, but with a (mostly) empty body, e.g. the code that goes between the braces. A dummy method will let the program compile and run even if the code and logic in the body isn't finished yet. This is useful when the method requires some complicated calculation that would take time to figure out, connecting to a database, parsing some file or similar type of code. It's of course less useful for methods that will be simple oneliners anyway, such as a getter method.

A dummy function can be even more complete if it has documentation for it's expected behaviour, some basic input validation code (e.g. throw exception if argument is nyll) and unit tests that checks this behaviour.

Usually it's quite easy and straightforward to write the dummy method as long as there is some design thinking done already.

```java
class SomeClass {

    /**
     * Calculates the area of two or more intersecting 2D shapes. Will throw an
     * error if a Shape is null or if just one shape is given in arguments.
     * @param  a  the first shape to compare
     * @param  b  additional shapes to compare with
     * @return    a float represeting the area in square meters
     */
    public static float findIntersectionAreaOfShapes(Shape a, Shape... b) {
        // TODO complicated calculation code later
        return 1f;
    }
}

```

## Hand in instructions

### General hand in instructions

- Create a branch with name `YOURUSERNAME_lesson_4`

Hand in your exercise in a `Pull Request` that contains diagram image[s] and file[s]. You can also use the feature `attach a file` for images in your `Pull Request`
