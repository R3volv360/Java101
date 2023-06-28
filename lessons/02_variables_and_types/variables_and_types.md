# Variables

## Discuss

### Declaration and Assignment

Data can be stored in variables to be used around your program. Consider the following `HelloVariables` class:

```java
public class HelloVariables {

    public static void main(String[] args) {
        String hello = "Hello";
        String divider = ", ";
        String world = "world";
        String exclamation = "!";

        System.out.println(hello + divider + world + exclamation);
    }
}
```

The first four lines of the `main` method are initialising variables of a String type. A variable must be declared with
an name (known as its identifier). It must also be initialised before it is used. `String hello;` defines a String with
the identifier `hello`. We can then *assign* a value to the variable with the `=` operator, like so: `hello = "Hello";`.
We can do both declaration and assignment in one line, as in the program above: `String hello = "Hello";`.

The `println` method uses *String concatenation* to combine these four together and output our familiar "Hello, world!".
To *concatanate* means to join things together. String concatenation joins Strings together to make a new one using the
`+` operator. You can also concatenate non-Strings with Strings which we'll see later. Strings have a bunch of useful
operations that we'll dedicate some time to later.

#### You keep saying "String" as if I'm meant to know what that means.

This is the first data type we've been working with! A string is a collection of *characters*. A character is a single
letter, number, symbol etc. Anything you can basically type on your keyboard! Characters are their own special data
type: `char`.

### Primitive types

A `char` is also a primitive type. Primitive types contain a value that matches their type. That's it. Nice and simple!
There are eight types in total:

- `char`: Our single character type from not too long ago.
- `byte`: A whole number (integer) between -128 and 127
- `short`: A whole number between -32,768 and 32,767
- `int`: A whole number between -2,147,483,648 (-2^31) and a maximum value of 2,147,483,647 (2^31 - 1). Probably what
will work for you in most situations.
- `long`: A whole number between -9,223,372,036,854,775,808 (-2^63) and a maximum value of 9,223,372,036,854,775,807 
(2^63 - 1). That's a lot of numbers!
- `float`: A single-precision 32 bit floating point. What this means is you can store a big range of decimal
values, such as `0.0`, `1.234`, `10000000.1` and `-333.333`.
- `double`: This is a number which can store a bigger range of decimal values. Technically a double-precision 64 bit
floating point. You can pretty much be safe using this for most cases.
- `boolean`: A value of either `true` or `false`. Very small set of values, but very useful.

`String` is not a primitive type. Why? Because it is an *Object*. We'll learn more about objects soon, but one thing
that is special to a string compared to other objects is that you can initialise it like we have above by just assigning
a value in double quotes. We'll see how all other objects are initialised later on.

You assign the primitives like so:

- `char aChar = 'x';` - note the single quotes!
- `byte bChomp = 100;`
- `short notTall = 30000;`
- `int myInt = 123;` - you don't have to use the smaller types if the value is small
- `long lengthyVariable = 1000L;` - a long literal must end with an `l` or `L`. Capital `L` is preferred since a small
`l` could be mistaken for a `1`.
- `float bubbles = 42.99f` - a float must end in an `f` or `F`
- `double morePrecise = 42.99999;` - a double can optionally end with a `d` or `D`, but doesn't have to
- `boolean flag = true;` or `boolean flag = false;` - `true` and `false` are keywords in Java, representing the
respective boolean value.

#### Operations on the primitives

The number types (`byte`, `short`, `int`, `long`, `float`, `double`) can all be used with arithmetic operators. The
math operators we have are:
- `+` addition
- `-` subtraction (can also be a unary minus to create a negative number, e.g. `-42`)
- `*` multiplication
- `/` division
- `%` modulus (the remainder when doing division, e.g. `10 % 3` is `1` because `10 / 3 = 3 remainder 1`)
- `++` increment by one (this is a unary operator, for example: `myInt++` will increment `myInt` by `1`)
- `--` decremnet by one (also a unary operator)

Division can either be *integer division* or *floating point division*. The difference being the integer division will
throw away the remainder and leave you with a whole number type. Floating point division will return a floating point
type.

Let's code up the following example (or just compile from this directory):

```java
public class MathsOperations {

    public static void main(String[] args) {
        byte x = 12;
        short y = 1000;
        int sum = x + y;
        System.out.println("x + y is: " + sum);

        long a = 5000L;
        float b = 2.5f;
        double multiplication = a * b;
        System.out.println("a * b is: " + multiplication);

        int wholeThree = 3;
        int wholeTen = 10;
        double doubleThree = 3.0;
        double doubleTen = 10.0;

        int integerDivision = wholeTen / wholeThree;
        System.out.print("wholeThree / wholeThree is:" + integerDivision);

        double floatingPointDivisionDenominator = wholeTen / doubleThree;
        System.out.print("wholeThree / doubleThree is:" + floatingPointDivisionDenominator);

        double floatingPointDivisionNumerator = doubleTen / wholeThree;
        System.out.print("doubleTen / wholeThree is:" + floatingPointDivisionNumerator);

        double floatingPointDivision = doubleTen / doubleThree;
        System.out.print("doubleTen / doubleThree is:" + floatingPointDivision);

        double multipliedOut = floatingPointDivision * wholeThree;
        System.out.println("floatingPointDivision * wholeThree is: " + multipliedOut);
    }
}
```

First thing, notice how we can use String concatenation with non-String types! When the `+` operator is used and one of
things on the side of the operator (one of the operands) is a String, then it become String concatenation.

Do all the mathematical operators shown here behave like you expect? What about division? There are a couple of things
to note here.

1. Floating point division is not precise. `10/3`, in the "real world" is `3 and 1/3`, or `3.33 recurring`. However, a
computer cannot easily represent infinite 3's using float or double types. There are some technical limitations why that
I'm not going to go into right now, but just bear in mind that for precise mathematics, it is possible to get rounding
errors.
2. Integer division happens when both operands (the things on each side of the operator) are integers. Floating point
division happens when either or both operands are floating points. This is similarly true for multiplication. An easy
way to convert an integer type to a floating point type is to do `myInt * 1.0`.
3. We're staying in bounds with the above example. That means, none of the results of the operations go beyond the range
of the types we try store them in. I'd recommend, for the rest of this course at least, just sticking with `int` and
`double` and you shouldn't really have to worry about flowing over the range (but see the optional discussion on how
you could and what happens!)

## Sum it all up

So, to wrap it all up:

1. Variables must have a name, be declared and assigned before use.
2. There are 8 primitive types
    1. But stick to using `int`, `double` and `boolean`. You won't have a good reason to use the other types yet.
3. `String` is not a primitive type, but can be assigned like one with just the `=` operator.
4. You can do mathematical operations on the on the number types
    1. Integer and floating point division is something to watch out for though!
5. String concatenation is a neat String operation that is used a lot. When either operand is a String with the `+`
operator, the String representation of each operand is concatenated.

#### Overflowing a type

What happens if we go out of the given range for a type? This is a common cause of some surprising bugs and security
hacks! If you have a `byte` (which is between -128 and 127) with the value 118 and add 10. What do you think the
resulting value is?

First, try to compile this code:

```java
public class LossyBytes {
    public static void main(String[] args) {
        byte camelsBack = 118;
        byte theStraw = 10;

        byte broken = camelsBack + theStraw;

        System.out.println("The result of byte 118 + byte 10 in a byte is: " + broken);
    }
}
```

You should get an error like:
```
LossyBytes.java:6: error: incompatible types: possible lossy conversion from int to byte
        byte broken = camelsBack + theStraw;
```

The Java compiler is smart and will try limit the amount of damage you can do to yourself. It can see that the resulting
value, 128, is bigger than what a byte can store and you might lose some information ("lossy conversion").

We can work around the compiler and force it to do the operation and store a byte though with *casting*. To cast is to
put one type into another. Make the following change to `LossyBytes` and recompile:

```java
byte broken = (byte) (camelsBack + theStraw);
```

You should now get the output:

```
The result of byte 118 + byte 10 in a byte is: -128
```

What's happened? This is called *overflow*. We've broken through the upper part of the range and wrapped back around to
the bottom. This happens due the number of *bytes* in memory we use to store a `byte` type. This is beyond the scope of
this course as we're really just scratching the surface here, but it can be very important to know if you go on to write
code for constrained systems. For example not computers and laptops, but rather smaller devices that don't have as
much memory to go around. You can overflow any numerical type by going beyond the range.

How did we get around it? We cast the result of adding the bytes together back to a byte. What the java
compiler is doing is noticing that the result is greater than what a byte can store and automatically tries to put it
into an `int`. When you assign this `int` result back to a `byte` type, it will complain that you could lose
information. By adding `(byte)` before `(camelsBack + theStraw)` we *cast* the result of the addition back to a `byte`,
which in this case is not 128, but overflows to -128!