# Chinese Checker Game by JAVA  
  <ins>**Heuristic function:**</ins>  
-  generates all the possible moves with minimax and then calculates the some of their vertical distances.
The same is then done for the oponent.
The heuristic value will be the player's total - the oponent's total.

###  Chinese Checker explanation:

<ins>**in class Board:**</ins>  
-  Class has 2d array named as board as it is the board of the game.
-  green Marbles is ArrayList which contains marbles of the human aka player 1
-  Red Marbles is ArrayList which contains marbles of the computer aka player 2

<ins>**in Class Common:**</ins>  
-  enum which contains types of player {HUMAN || CPU}

<ins>**in Class Index:**</ins>  
-  row and column to make it easy to arraylists to save an object that contain row and column instead of making arraylist for row and column

<ins>**in Class MarbleNode:**</ins>  
-  has attribute "value" that represent the movements

<ins>**in Class MoveInfo:**</ins>  
-  info about the chosen marble to move and the destination place
-  contains evaluated value

<ins>**in Class MinMax:**</ins>  
-  Contains utility function aka "heuristic function"
-  minmax function that decide best move and make cpu choose best marble to move and best destination

<ins>**in Class Move:**</ins>  
-  get all possible functions which returns an arraylist contains all possible moves by chechking each case "each move  (basic moves, moves with jump) could be made"
and restricted by calculation of the difference between source row and column and destination row and column.
-  function basicmoves which have the moves (swaping empty place with the chosen marble )
