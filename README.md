# Assignment1b-ArrayofPokemon - Due Monday 9/19

Create an interactive program that manages an array of Pokemon objects
---

Write a driver (main method) program for your Pokemon class called PokeArray.java 

### Menu ###
---
Please see the sample code included in this repo: `MenuExample.java`
 * So many students get stuck on the menu, I decided to make you one to work from. The important part of this assignment is working with the array of objects and static methods.

The program should display the following interactive menu to the user:
```
1. Add a Pokemon
2. Print all Pokemon
0. Exit the program

What would you like to do? _
```
* The menu should keep on looping until the user enters 0. 
* **If the user enters a 1:** 
  * There should be a call to a static method named `makePokemon` that handles making a new Pokemon object (see makePokemon section). 
  * The Pokemon returned from the `makePokemon` method should be stored in the next available array index (see Array Management section). 
* **If the user enters a 2:**
 * There should be a call to a static method named `printArray` (see printArray section). 
* **Menu input must be validated.** If an invalid entry is given, **the program should not crash!** A suitable error message should be displayed followed by the menu again. The provided sample code does this already!

### makePokemon static method
 * A set of questions should be asked in order to gather the data needed construct a new Pokemon Object such as:
    * What is the Pokemon's name?
    * Does the Pokemon have a nickname Y/N?
      * (if Y) What is the Pokemon's nickname?
    * What is the Pokemon's Pokedex number?
    * What is the Pokemon's Type?
    * What is the Pokemon's Second Type? (if it has one)
  * **I strongly suggest using the `Scanner.nextLine()` method to read in everything**, then parse the number into an int. The Scanner class `nextInt()`, `next()`, and `nextDouble()` methods cause problems if the user enters any spaces on accident. 
 * Assume the String input entered will be correct Pokemon data for now. You must parse the number into an int and handle re-asking for it if a non-number is entered (the constructor will not accept a string).  We're going to work on PokemonExceptions in a later assignment for the rest.
 * When all the required parameters are collected, a Pokemon object should be constructed
 * Finally, that new Pokemon object should be returned to the main method

### Array Management ###

 * The array of Pokemon objects should be maintained in the main method.
 * This array must be of size 6. 
   * Declare this size as a static constant at the top of the code. 
 * The array should only keep the last 6 Pokemon entered. 
   * If the user enters a 7th Pokemon, the first Pokemon that was stored (array[0]) should be deleted to give way to the new one. 
   * If a 8th Pokemon is added, the second one that was entered (array[1]) should be deleted to give way to the new Pokemon, and so on. 
   * *Hint:* use the mod operator to calculate the next index to be used.
 * The user should be able to keep entering new Pokemon forever, but the array should only store the 6 newest.


### printArray static method
* This should take the array of Pokemon in as a parameter (see ArraysAndMethods.java on Laulima Resources under Week 3)
* It should loop through the array
  * At each filled index it should print:
    ```
    Pokemon <array index>:\n
    ```
  *  Then print the String returned from a call that Pokemon's toString() method
 * Unfilled indices should not print anything
 
### Grading
---
Assignment 1b is worth 100 points.

Rubric:

| Must pass all JUnit tests for full credit       |  pts  |
| :-----------------------------------------------: | ----:|
| Construct Array of Pokemon                      |  10   |
| Continuous menu looping and validation          |  10   |
| makePokemon static method                        |  20   |
| Array full/replace old Pokemon entries with new: |  20   |
| printArray static method                        |  20   |
| Commenting and style                            |  20   |
| **Total** | **100** |
