# Setup

## Do

1. Install the latest long-term support (LTS) JDK from [Oracle's website]
(https://www.oracle.com/za/java/technologies/downloads).
2. Make sure you can run `java` and `javac` from your terminal.
3. Find a text editor you like. You could opt to use an IDE, but we're going to keep things very basic so won't get into
or require any specific IDE in this course.

## [Optional] Discuss
The following goes into some detail about what is being done above and is optional, but may be of interest if anything
above was unfamiliar to you.

### 1) The JDK

Download and install the latest long-term support (LTS) Java Developement Kit (JDK). At time of writing, that is JDK17.
You can get JDK17 from [Oracle's website](https://www.oracle.com/za/java/technologies/downloads/#java17). Download the 
right one for your system (e.g. Windows or Mac, x86 or ARM) and install. If you come across this in the future (i.e.
after September 2024), then you should rather get the next LTS.

On which version to download:
- For Windows I'd recommend just downloading the "x64 Installer" option. 
- If you have an M1 (or newer M model) Mac, then you'll download the "ARM DMG". If you have an Intel Mac, you'll need
the "x64 DMG". You can find out what kind of Mac you have by clicking on the Apple  icon on the top menu, clicking
"About This Mac" and checking what Processor you have, Intel or M.
- If you have a Linux machine I assume you don't need any more instruction on your architecture!

"Hang on, what is a JDK?" you ask. The Java Development Kit includes all the bits and bobs you need to create Java
applications. It includes a command to compile machine-code from Java source code (`javac`, I'll explain machine-code
etc in the next lesson) and a command to run Java applications (`java`). You may already have `java` installed from a
Java Runtime Environment (JRE) present on your machine, as there are lots of applications out there that require Java to
run.

"What about OpenJDK?" you, informed reader, ask. [OpenJDK](https://openjdk.org/) is a free (as in free speech) and
open-source (aka [FOSS](https://en.wikipedia.org/wiki/Free_and_open-source_software)) implementation of the Java
Platform. There are differences between Oracle's implementation and OpenJDK, but for the purposes of this course it
won't matter. If you start writing commercial Java software or want to get more into the licensing differences, then do
xcheck it out.

### 2) The Command Line

If you aren't familiar with the command line/terminal, now's a great time to learn! All the lessons will require some
interaction with the terminal, however all commands will be listed out. If you're unsure of what is being run, look it
up! You can do that locally with `man $thecommand` where `$thecommand` is the first word on the line you are being asked
to run (e.g. `man java`). This will display a (usually) pretty in-depth guide (called a *man page*, short for "manual
page") on what the command executes, the arguments it takes and some other bits and pieces.

The operations you run in the terminal execute in your *present working directory*

Some commands you'll want to be familiar with are:
- `cd $ARGUMENT` to change your current working directory to `$ARGUMENT`. We talk about directories (not folders!) which
store files (directories are also files).
    + The given argument (in this case, the path) can be relative or absolute. 
    + An absolute path will look like `/home/users/me/java101/lessons/00_setup` and will work from any current working
    directory in the system. Basically, absolute paths start with a `/`.
    + A relative path would be `lessons/00_setup`. This will try take you to the `00_setup` directory located in the
    `lessons` directory which in turn is assumed to be in the current directory.
    + Two special path arguments are `.` which is the current directory (so `cd .` will essentially keep you where you
    are).
    + The second special argument is `..` which is one directory back. So if you are in `/a/b/c`, then `cd ..` will take
    you to `/a/b`. You can also chain these together, so from `/a/b/c`, `cd ../..` would take you to `/a`,
- `pwd` will print out your current working directory
- `ls` will print out the files in the current directory
    + `ls -l` prints them out in a list which I personally find easier to read. It also includes other information
    + `ls -a` prints out all files, including files hidden by default (e.g. files that start with a `.`)
    + `ls -la` does both of the above! Command line options (`-l` and `-a`, in this case) extend the functionality of a
    command and can be combined. Check the man page for more!

The above commands can't modify your system, but if you want to go to the next level here are some useful commands that
will! Since you will only need to run `java` and `javac` you don't need the below, but it might make your learning
faster to be able to do more things in the terminal than out of it.
- `mkdir $ARGUMENT` will make a directory named `$ARGUMENT` in the current working directory
- `rm $ARGUMENT` will remove a file that matches the name `$ARGUMENT`. Be very careful here with what you are deleting!
A quick way to ruin your system is to delete an item you didn't intend to. There's no Recycle Bin with `rm`, the files
you delete this way are instantly gone.
    - `rm -r $ARGUMENT` will recursively delete. That means it will descend down a directory if passed as an argument
    and remove that directory entirely.

### 3) Text Editor, not IDE

Pick any editor you'd like which can save your typing to a file on disk.

If I have to make a suggestion: I'm a big fan of [Sublime Text](https://www.sublimetext.com/) (all of these files were
edited in it at some point!)

I'm not going to even suggest either `vim` or `emacs` as editors. I have a personal preference but it's a [hotly
contended topic](https://en.wikipedia.org/wiki/Editor_war), but if you want to keep more in the command line then either
would be a good choice.

I'm also not going to put forward the idea of using an IDE for now. I think it's more valuable to write the code
yourself without code completion to understand the language from hard-grafted first principles. You may scoff at this
and say that AI are already going to take our jobs so the least you can do is use an IDE to help you try outrun them.
While I'm not sure that logic is sound, you are welcome to use an IDE, but I'm not going to advocate for any one in
particular and the lessons won't rely on any features other than running `java` from the command-line.