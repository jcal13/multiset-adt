# Lab 2: Second Activity: Translating Python code to Java code

This second activity of the lab this week will ask you to write some code which you may
find initially quite challenging, but with the help of your peers, we hope you can make
some incremental progress on it as you practice the git skills introduced in this lab.

The goals of this activity are to:
- give you practice applying a branch and merge workflow
- using pull requests to provide a mechanism to ensure others review code contributed
  to the project
- give you a first experience of coding in a collaborative environment
- experiment with how to most effectively divide up coding tasks

# The Task

Now that we are familiar with the process of branching and making pull requests from the
previous activity, we will apply these new skills to a coding task.

Note: this may seem like a big task initially, but it won't be so daunting if you tackle it
in small pieces and help each other out as you go!

In this task, your goal is to translate the Python code from `python/multiset.py` into a
functionally equivalent set of Java classes. There will be a lot of things that directly
translate and others where you'll have to muddle through some unfamiliar syntax. We don't
expect you'll get it fully working during lab, but the goal is to make some progress and
get a sense of what it will be like to work in a team throughout the term. Try things out
today and don't be afraid to make mistakes.

## Setting expectations
- Aim to make at least one pull request during this activity.
- Aim to review at least one pull request during this activity.
- Actively discuss with those around you to develop strategies to develop a shared code base.

## The code

You will be developing code for a `MultiSet` ADT, as well as several classes which implement it and
a main method which makes use of it.

The provided Python code's main block runs a timing experiment to compare the various implementations.
It should feel quite similar to code you would have seen in your first-year CS course.

## Instructions

In a small group (around 4 students), choose one of you to make a fork of
https://github.com/CSC207-2023F-UofT/multiset-adt 

- [X] Each other team member should make a fork of that repo (or the repository owner can add the others
  as collaborators).

- [X] Take the time to skim the rest of the instructions to get a better sense of what you'll be doing
  in this activity. If you have any immediate questions, raise these with your group or ask your TA.

- [X] As a team, explore the python code base and identify specific pieces of code that will need to
  be completed. (See the general strategies and advice further below, ask other groups, or
  ask your TA for advice as needed.)
    - The next section highlights a few aspects of the code which your team should think about as you
      explore the code.

- [ ] Based on your group discussion, you should each create your own branch and write a piece of code.
  - Note: If your team identifies any code that needs to be written before others can start their parts,
  you might choose to work on that first, push that branch to the remote, make a pull request to merge it
  into main, and then everyone on your team will need to make sure their fork and local copies are
  up-to-date with the latest code.

- [ ] When someone on your team has made a pull request, a subset of your team should take the time
  to review it. You can pull their branch from the remote repository and try running the code locally
  and also review the code on GitHub. Practice giving both verbal feedback and written feedback
  during the lab today.

- [ ] Once everyone has made a successful pull request and had it merged in, your team should continue
  working to add more of the functionality.

- [ ] Towards the end of the lab, your team should take some time to reflect on what worked well
  and where you encountered difficulty as you worked on the code and divided up tasks between each
  of you. In particular, your group should think about how you kept track of who was working
  on what. We encourage you to share your experiences with those around you.

### Initial Advice
A few general strategies before we begin:

1. The goal is to get the whole program to function, but you'll want to get bits and pieces up and
   running, incrementally. Ideally, you can identify independent pieces which can be developed in isolation
   and won't cause any conflict when merged in later. For example, once you have defined an interface, you
   can work on both sides of that interface: (1) develop client code which makes use of the interface and
   (2) write any classes which then implement that interface.
2. Remember, each class should go in its own file in Java, so splitting up work by class should help
   avoid conflicts.
3. Within a class, there may be several methods to be written, so you can also divide up work that way.
4. Ideally, we would have some way to be confident that our code will work once implemented, so writing
   some tests might be worth considering.
5. Lastly, remember that we will want whatever code is in the `main` branch to not contain errors at any point,
   so try to plan the order of work and pull requests being merged in to ensure this as much as possible.

And, to reiterate, you shouldn't expect to complete the code in lab, but rather experience the process
of attempting to tackle a relatively large coding task in a collaborative, team setting.

### Java Concepts

While not exhaustive, the below are a few concepts which you may be seeing for the first time today
or in last week's lectures. You'll learn more about them this week, so don't worry if you find it
challenging to implement parts of the code. You should find that there are still parts of the code
you are able to write given your current knowledge of Java.

Importantly, you should be getting in the habit of looking up new concepts and actively searching
for information as you need it. The official Java documentation, as well as the online Java textbook
we are using this term will be useful resources as you work on this task. And, of course, your TA and
peers will also be invaluable sources of information.

Below just very briefly highlights some key concepts you'll need to explore as you implement the code
today. Again, we don't expect you to know all of these things coming in, so the exercise is largely
getting you to identify what you can implement and what you will need to look up or ask questions about
in order to make progress on the code.

#### Interfaces

In the Python code, we had represented an ADT as an abstract class (`MultiSet`). To represent an ADT in Java,
we can create an `Interface` instead. An interface specifies an API (set of public methods) which
other classes can then implement.

In last week's lecture slides about Java, we briefly highlighted the `List` interface in Java, which demonstrates this idea.

In Java, a class needs to indicate that it implements a given interface. The syntax for this is something
we'll expect you to quickly look up as you need to implement the code today.

#### Generics

In Python, this code uses the type annotation `Any` to convey that the ADT can store any kind of object.
In Java, we'll use the concept of Generics to specify what type of objects a given instance of our ADT
will store. The lecture slides last week briefly explain the syntax for this. If you have initial
issues with understanding how this syntax works, we encourage you to start by simplifying the code to
only work for a single data type, like integers, and then you can go back and generalize the code with
Generics later.

#### Constructors

These are like the special `__init__` methods in Python when we want to initialize (or construct) an
instance of a class. To actually create a new instance of a class, you'll need to use the `new` keyword
and call a constructor for the class. The slide from last week mentioned above also shows an example of this.

#### Delegation / Composition

You'll notice that the provided `Tree` class doesn't directly implement the `MultiSet` ADT, but rather
is an instance attribute of a different class which does. This kind of "wrapping" of classes is often
useful and demonstrates the general idea of delegating work to an instance attribute rather than
performing a task directly. Note that "wrapper" classes like the provided `TreeMultiSet` tend to be
quite quick and easy to write code for — once you know the set of public methods each of `Tree` and
`MultiSet` have.

#### Access Modifiers

In the Python code, you'll note the use of a leading underscore to mark an attribute as being private
(an implementation detail) of a class. Java uses access modifiers to specify who can access things like
classes, methods, and attributes. A couple general rules: (1) the methods specifying your API need to be
public and (2) default to making all instance attributes private unless you have a reason not to.

#### JavaDoc

We haven't talked about documentation much yet, but you can look at how existing Java code is
documented to get a sense of the standards used. For example, if you hover over any class name
in IntelliJ, what you see is the JavaDoc for that class (same idea as docstrings in Python)

## Extra

If your team does replicate the behaviour of the provided Python code, we encourage
you to think about possible extensions to the structure of the code used to run
the timing experiment. In particular, how could be make it more customizable and
able to time other things?