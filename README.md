# Workshop – Linear Structures in Java

**Student:** Liney Tatiana Anacona  
**Course:** Data Structures  
**Professor:** Manuel Arturo Melo Legarda  

This workshop implements exercises with **one-dimensional arrays, matrices, and dynamic lists (ArrayList)** in Java.  
It was developed applying principles of **Object-Oriented Programming (OOP)**, **Clean Code**, and best practices (DRY, YAGNI, KISS, SOLID).  
All filler data is generated randomly, and the programs are executed from the console.  

----------------------------------------

## Workshop Exercises

### 🔹 Arrays
1. Initialize directly an array with the first 10 prime numbers and print it.  
2. Initialize an array with the first 100 even numbers and print:  
   - In a single line.  
   - In 10 lines indicating the line number.  
3. Read *n* random integers, store them in an array, and calculate the factorial of each number in another array.  
4. Read 25 random integers between -50 and 50 and find:  
   - The smallest number.  
   - The largest number.  
5. Initialize an array with 20 random integers, reverse each number, and store the reversed numbers in another array. Print both arrays.  

### 🔹 ArrayList
6. Read random integers between -10 and 10 and store them in an ArrayList until the number 10 appears. Show the numbers, their sum, and their average.  
7. Initialize an ArrayList with the first 20 even numbers and perform:  
   - Insert a number in the correct position according to the order.  
   - Remove a number requested by the user.  
8. Generate an ArrayList with 100 random integers between 1 and 20. Show the frequency of each number and the one that repeats the most.  
9. Generate an ArrayList with 20 random integers between 1 and 100.  
   - Sort ascending and then descending.  
   - Separate into two lists: even and odd numbers.  

10. **Football Matches**:  
   - Show matches where the away team won.  
   - Count Barcelona’s victories.  
   - Remove matches that are not draws.  
   - Count home team victories.  

### 🔹 Matrices
11. Initialize a matrix of *m* rows by *n* columns with random numbers. Read an integer and determine if it is in the matrix (show the first occurrence).  
12. Initialize an *n x n* matrix with random numbers between -50 and 50 and calculate the sum of the opposite diagonal.  
13. Initialize an *n x n* matrix and determine if it is symmetric. Print the corner elements.  
14. Initialize an *m x n* matrix and find its transpose. Print both.  
15. Initialize an *m x n* matrix (with random values) and swap the first row with the second. Print the resulting matrix.  

-------------------------------------------------

## Project Structure
Taller-Estructuras-Lineales/
│
├── src/
│   │
│   ├── arreglos/
│   │   ├── Exercise1.java
│   │   ├── Exercise2.java
│   │   ├── Exercise3.java
│   │   ├── Exercise4.java
│   │   └── Exercise5.java
│   │
│   ├── arraylist/
│   │   ├── Exercise6.java
│   │   ├── Exercise7.java
│   │   ├── Exercise8.java
│   │   └── Exercise9.java
│   │
│   ├── matrices/
│   │   ├── Exercise11.java
│   │   ├── Exercise12.java
│   │   ├── Exercise13.java
│   │   ├── Exercise14.java
│   │   └── Exercise15.java
│   │
│   ├── partidos/
│   │   ├── ArraylistObjetos.java
│   │   ├── PartidoFutbol.java
│   │   └── ProcessorPartidos.java
│   │
│   ├── utils/
│   │   ├── Printer.java
│   │   └── Processor.java
│   │
│   └── main/
│       └── Main.java
│
├── PartidoLiga.txt
├── LICENSE
└── README.md

-----------------------------------------------

## Execution Instructions

## Exercises 1 to 9 and 11 to 15
All these exercises are executed from the **`Main`** class located in `src/main/Main.java`.  
The `Main` class sequentially invokes each exercise through their `run()` methods.  
Random data is generated automatically, except in exercises where direct initialization or dimension input is required.  
Running `Main` will automatically execute exercises 1 to 9 and 11 to 15 in order, displaying their results in the console.  

## Exercise 10 – Football Matches
Exercise 10 is executed separately from the **`ArraylistObjetos`** class located in `src/partidos/`.  
The file `PartidoLiga.txt` must be placed inside the same folder (`src/partidos/`).  

-----------------------------------------------

## Notes
- Package names remain in Spanish following the workshop statement.  
- However, the implementation (classes, methods, and variables) was written in **English**, following programming best practices.  