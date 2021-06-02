# Clojure core functions

> Notes on Chapter 4 of Clojure for the brave and true by Daniel Higginbotham

## Intro

Strange lead-in with a story about vampires, that continues with a mention of how Clojure "programs to abstractions". I don't know if this is gramatically sound, perhaps Clojure "programming uses abstractions" fits better? But I haven't read the chapter yet...

Introduces the two main abstractions, sequences and collections, and that lazy sequences are core to Clojure. Also indicates that manipulating lists, vectors, maps, and sets, with a bunch of functions will be a focus for the middle part of the chapter. The final part of the chapter (before examples and exercises) will be on creating new functions.

### Programming to abstractions

The grammar of this idea seems to make a bit more sense - _"I am programming to this abstraction"_ - note the change from plural in there. The first example of an abstraction is the **sequence**, which is not a data type, nor a functions, nor a collection of either. The sequence is the abstraction, and the data structures list, vector, etc, all fit that abstraction.

Thus, it makes sense to say a Clojurian programs to abstractions. What Daniel says about "Named collections of operations" is appropriate. However, a critique of this chapter is that terms are introduced before their respective sections. He talked about programming to abstractions in the intro, and is now talking about sequences, which is supposed to come up next. 

A comment on abstractions: I am concerned that by thinking of an abstraction as a concrete idea (remember, named collection of operations) that it implies all implementations of the abstraction are equivalent, further implying... redundant? 

This programming to abstractions concept seems like a layer of guff which acts as a smokescreen to _the point_, which may be appropriate in a philosophy book but not an introduction to the language. Though, I have managed to tease out the meaning of Daniels writing eventually.

### The **sequence** abstraction

I cannot stand this writing. The equivocation from the sequence abstraction to a mathematical sequence is painful. I do not wish to continue with this book.

### `first`, `rest`, `cons`

### Indirection

## Seq functions

### `map`

### `reduce`

### `take` `drop` `take-while` `drop-while`

### `filter` `some`

### `sort` `sort-by`

### `concat`

## Lazy seqs

### Efficiency

### Infinity

## Collection abstraction

### `into` `conj`

## Function functions

### `apply`

### `partial`

### `complement`

## Example program

## Summary

## Exercises


