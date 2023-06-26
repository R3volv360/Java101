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

If all goes well, you should see `Hello, world!` printed on the command line. If you don't see that or get some other
kind of error, make sure you did the setup correctly in `00_setup`.

## Discuss

### Line by line
We'll go more in-depth into some of these keywords in later lessons, but here's a brief overview.

1. `public class HelloWorld {` - This is the opening line of the file. It defines a class named `HelloWorld`. It 
2. `public static void main(String[] args) {` - This is the *method signature* of the main method. It defines a
`static` method named `main` which returns no value and has a single parameter named `args` which is of a `String` array
type. All those terms will make sense in due course!
3. `System.out.println("Hello, world!");` - This is our first and only instruction. `System.out.println` will print to
the console the arguments given. In this case, the argument given is "Hello, world!". All instructions in Java must end
in a semi-colon (`;`). If you miss out a semi-colon then you'll get an error when running `javac` saying "error: ';'
expected".
4. `}` (x2) - Notice how the class and method signature end in an opening parenthesis (`{`). These must be matched up
with closing parentheses. If you leave one of these out, you'll get an error running `javac` that says "error: reached end of file while parsing".

### Explain the funny words above, magic man

#### What is a class?
Every Java file is a *class* (kinda, see how this is not entirely true in future lessons!). One file has one top level
class. This class must have the same name as the file. A class contains other Java constructs that we'll come across.

#### What is the `main` method?
Java contains *methods*. These are the functions and operations that are run in your program to make stuff happen. This
class has the special `main` method. When you run `java HelloWorld`, you're running the `java` program which opens the
`HelloWorld.class` file and looks for the `main` method. Whatever is in the main method is executed, aka run.

#### What is `public` or `static` or `void` or `String[] args`!?
Find out soon! For the curious (and to have something to latch on to later):

- `public` is the visiblity modifier. This method being `public` means it can be called from any other class
- `static` means the method belongs to the class and is shared, rather than belonging to a single an instantiation of
the class
- `void` is the return type. A `void` method returns nothing.
- `String[] args` sets a `String` array parameter  named `args` that is require to call this method.

All of the above will make sense in time!

#### What does `javac` actually do?
This compiles the human readable `.java` file to a machine readable `.class` file. Human readable means a human can read
it (should've seen that one coming) If you open the `.class` file, you'll just see what's called byte code, a bunch of
gibberish looking 4 character strings.

It's not important to know about byte code now, but remember that your `.class`
file is what is executed, not the `.java` file. So to make a `.class`, we need to run `javac TheJavaFile.java` which
makes a `.class` file in the same location. If you make changes to the `.java` file, you must *recompile* the `.class`
file (i.e. run `javac HelloWorld.java`)

**Try it now!** Change "world" to your name. Recompile the code and run `java HelloWorld`. What happens?