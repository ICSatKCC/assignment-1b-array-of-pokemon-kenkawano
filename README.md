# Assignment1b-ArrayofPokemon

Create an interactive program that manages an array of Pokemon objects
---

Write a driver (main method) program for your Pokemon class called PokeArray.java 

### Menu ###
The program should display the following interactive menu to the user:
```
1. Add a Pokemon
2. Print all Pokemon
0. Exit the program

What would you like to do? _
```
* The menu should keep on looping until the user enters 0. 
* **If the user enters a 1:** 
  * A set of questions should be asked in order to construct a new Pokemon Object:
    * What is the Pokemon's name?
    * Does the Pokemon have a nickname Y/N?
      * (if Y) What is the Pokemon's nickname?
    * What is the Pokemon's Pokedex number?
    * What is the Pokemon's Type?
    * What is the Pokemon's Second Type? (if it has one)
  * Then the Pokemon constructor should be called and the new Pokemon object stored in the next available array index (see Array Management section below). 
* **If the user enters a 2:**
 * The program should loop through the array
  * At each filled index it should print:
    ```
    Pokemon <array index>:
    ```
  *  And call that Pokemon's toString() method
* **Menu input must be validated.** If an invalid entry is given, **the program should not crash!** A suitable error message should be displayed followed by the menu again. Assume the input entered for the Pokemon constructor (after menu choice 1) will be correct for now. We're going to work on PokemonExceptions in a later assignment.

### Array Management ###

 * The array of Pokemon will be of size 5. 
   * Declare this size as a constant at the top of the code. 
 * This array will only keep the last 5 Pokemon entered. 
   * If the user enters a 6th Pokemon, the first Pokemon that was stored (array[0]) should be deleted to give way to the new one. 
   * If a 7th Pokemon is added, the second one that was entered (array[1]) should be deleted to give way to the new Pokemon, and so on. 
 * The user should be able to keep entering new Pokemon forever, but the array should only store the 5 newest.


