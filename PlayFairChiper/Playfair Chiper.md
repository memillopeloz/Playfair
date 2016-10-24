

# Playfair Chiper
##### Tatiana Moreira Beita
*Nanjing University of Information Science and Techonology*

This project is an implementation of the playfair chiper algorithm, it is implemented in the programming language [scala](http://www.scala-lang.org/ "Optional Title")  and oriented to [functional programming paradigm](https://en.wikipedia.org/wiki/Functional_programming "Optional Title").

The algorithm follows the following steps:

###### Working with the keyword

1. The user input the keyword
```scala
// readLine lets you prompt the user and read their input as a String
	val key = readLine("What's the key? ")
```
2. With the "makeCompatible" function the key becomes compatible for future processes, this function is used to make compatible other strings too.
```scala
def makeCompatible(s: String) = s toUpperCase() replace('J', 'I') filter(_.isLetter)
```

	
