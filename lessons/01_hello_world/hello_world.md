# Hello World

[As traditional a start as you can get](https://en.wikipedia.org/wiki/%22Hello,_World!%22_program).

## Do

Create the following file named `HelloWorld.java`:

```java
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

}
```

Then, in the terminal run the following:

```sh
javac HelloWorld.java
java HelloWorld
```

If all goes well, you should see `Hello, world!` printed on the command line.

## Discuss

- What is a class?
    + Every Java file is a *class* (kinda, see how this is not entirely true in future lessons!). One file has one top
    level class.
    + This class must have the same name as the file.
    + A class contains other Java constructs that we'll come across.
- What is the `main` method?
    + Java contains *methods*, which we'll learn about next!
    + This class has the special `main` method.
    + When you run `java HelloWorld`, you're running the `java` program which opens the `HelloWorld.class` file and looks for the `main` method.
    + Whatever is in the main method is executed, aka run.
- What is `public` or `static` or `void` or `String[] args`!?
    + Find out next lesson!
- `System.out.println("Hello, world!");` ?
    + This is our first and only instruction
    + `System.out.println` will print to the console the arguments given. In this case, the argument given is "Hello, world!"
- What does `javac` do?
    + This compiles the human readable `.java` file to a machine readable `.class` file.
    + Human readable means a human can read it (duh)
    + If you open the `.class` file, you'll just see what's called byte code, a bunch of 4 character strings.
    + It's not important to know about byte code now, but remember that your `.class` file is what is executed, not `.java`
    + So to make a `.class`, we need to run `javac TheJavaFile.java` which makes a `.class` file in the same location
    + If you make changes to the `.java` file, you must *recompile* the `.class` file (i.e. run `javac HelloWorld.java`)
    + **Try it now!** Change "world" to your name. Recompile the code and run `java HelloWorld`.