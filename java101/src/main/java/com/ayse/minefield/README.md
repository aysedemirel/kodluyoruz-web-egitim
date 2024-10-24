# Game - Minefield

## Game Rules

- The game is text-based.
- It should be played using two-dimensional arrays and designed within the `MineSweeper` class.
- The user should determine the matrix size, i.e., the number of rows and columns.
- Random mines should be placed in the array, amounting to a quarter of the total number of elements (elementCount / 4).
  For example, if the array is 4x3 in size, the number of elements should be calculated using the formula (rowCount *
  columnCount),
  resulting in a size of 12. In this case, the number of mines should be 12 / 4 = 3. (Hint: you can create a second
  array to store the positions of these mines.)
- The user should select a point on the matrix by entering the row and column values.
- It should be checked whether the selected point is within the bounds of the array, and if the condition is not met,
  the point should be requested again.
- If there is a mine at the point entered by the user, the game should be lost.
- If there is no mine, all positions adjacent to the relevant point should be checked (right, left, top, bottom,
  top-left diagonal, top-right diagonal, bottom-right diagonal, bottom-left diagonal), and the total number of mines
  around should be written to the relevant point. If there are no mines adjacent to the point, the value "0" should be
  assigned.
- If the user selects all points without hitting any mines, they should win the game.

### Losing Scenario

Mine Locations

*
    -
        -

-
    -
        *

- - -
===========================
Welcome to the minefield game!
- - - 
- - - 
- - - 
Enter Row : 0
Enter Column : 1
===========================

- 2 -

- - - 
- - - 
Enter Row : 2
Enter Column : 0
===========================

- 2 -

- - - 
0 - -
Enter Row : 0
Enter Column : 2
===========================

- 2 1

- - - 
0 - -
Enter Row : 1
Enter Column : 0
===========================

- 2 1
  1 - -
  0 - -
  Enter Row : 2
  Enter Column : 1
  ===========================
- 2 1
  1 - -
  0 1 -
  Enter Row : 2
  Enter Column : 2
  ===========================
- 2 1
  1 - -
  0 1 1
  Enter Row : 1
  Enter Column : 2
  Game Over!!
  ===========================

Winning Scenario
Mine Locations
- - - 

-
    *
        -
-
    *
        -

===========================
Welcome to the minefield game!
- - - 
- - - 
- - - 
Enter Row : 0
Enter Column : 0
===========================
1 - -
- - - 
- - - 
Enter Row : 0
Enter Column : 1
===========================
1 1 -
- - - 
- - - 
Enter Row : 0
Enter Column : 2
===========================
1 1 1
- - - 
- - - 
Enter Row : 1
Enter Column : 0
===========================
1 1 1
2 - -
- - - 
Enter Row : 2
Enter Column : 0
===========================
1 1 1
2 - -
2 - -
Enter Row : 1
Enter Column : 2
===========================
1 1 1
2 - 2
2 - -
Enter Row : 2
Enter Column : 2
You won the game!
1 1 1
2 - 2
2 - 2
===========================
