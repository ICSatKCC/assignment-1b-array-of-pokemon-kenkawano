# Assignment1b-ArrayofPokemon

Create an interactive program that manages an array of Pokemon objects
---

Write a driver (main method) program called PokeArray.java 

### Menu ###
The program should display the following interactive menu to the user:
```
1. Add Pokemon
2. print all Pokemon
0. exit

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
* **Input must be validated.** If an invalid entry is given, **the program should not crash!** A suitable error message should be displayed followed by the menu again. 

### Array Management ###

The array of Pokemon will be of size 5. Please declare this size as a constant at the top of the code. This array of Pokemon will only keep the last 5 Pokemon entered. What this means is that if the user enters 6 Pokemon then the first one that was stored should be deleted to give way to Pokemon 6. When Pokemon 7 is added then the second one that was entered should be deleted to give way to Pokemon 7 and so on. 
The PokeArrat.java class should allow users to print all the Pokemon stored at any given time.


