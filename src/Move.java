import java.util.ArrayList;
import java.util.Scanner;

public class Move {
    public static ArrayList<Index> getAllPossibleMoves(Board ccBoard, int srcrow, int srccol)
    {
        ArrayList<Index> possiblemo = new ArrayList<>();
        int diffrow = Math.abs(srcrow - (srcrow-1));
        int diffcolumn = Math.abs(srccol - (srccol+1));
        int ddiffrow = srcrow - (srcrow-1);
        int ddiffcolumn = srccol - (srccol+1);
        if(diffrow == 1 && diffcolumn == 1 && ddiffrow > 0 && ddiffcolumn < 0 && ccBoard.board[srcrow-1][srccol+1].getvalue() == 0) // top right
        {
            if(ccBoard.board[srcrow-1][srccol-1].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow-1,srccol+1));
            }
        }
        /*diffrow = 0;
        diffcolumn = 0;
        ddiffrow = 0;
        ddiffcolumn = 0;*/

        diffrow = Math.abs(srcrow - (srcrow-1));
        diffcolumn = Math.abs(srccol - (srccol-1));
        ddiffrow = srcrow - (srcrow -1);
        ddiffcolumn = srccol - (srccol -1);
        if(diffrow == 1 && diffcolumn == 1 && ddiffrow > 0 && ddiffcolumn > 0 && ccBoard.board[srcrow-1][srccol-1].getvalue() == 0) // top left
        {
            if(ccBoard.board[srcrow-1][srccol-1].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow-1,srccol-1));
            }

        }

        /*diffrow = 0;
        diffcolumn = 0;
        ddiffrow = 0;
        ddiffcolumn = 0;*/

        diffrow = Math.abs(srcrow - (srcrow + 1));
        diffcolumn = Math.abs(srccol - (srccol + 1));
        ddiffrow = srcrow - (srcrow + 1);
        ddiffcolumn = srccol - (srccol + 1);
        if(diffrow == 1 && diffcolumn == 1 && ddiffrow < 0 && ddiffcolumn < 0 && ccBoard.board[srcrow+1][srccol+1].getvalue() == 0) // down right
        {
            if(ccBoard.board[srcrow+1][srccol+1].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow+1,srccol+1));
            }
        }

        /*diffrow = 0;
        diffcolumn = 0;
        ddiffrow = 0;
        ddiffcolumn = 0;*/

        diffrow = Math.abs(srcrow - (srcrow + 1));
        diffcolumn = Math.abs(srccol - (srccol - 1));
        ddiffrow = srcrow - (srcrow + 1);
        ddiffcolumn = srccol - (srccol - 1);
        if(diffrow == 1 && diffcolumn == 1 && ddiffrow < 0 && ddiffcolumn > 0 && ccBoard.board[srcrow+1][srccol-1].getvalue() == 0) // down left
        {
            if(ccBoard.board[srcrow+1][srccol-1].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow+1,srccol-1));
            }
        }

        /*diffcolumn = 0;
        ddiffcolumn = 0;*/

        diffrow = 0;
        diffcolumn = Math.abs(srccol - (srccol +2));
        ddiffrow = 0;
        ddiffcolumn = srccol - (srccol + 2);

        if(diffrow == 0 && diffcolumn == 2 && ddiffcolumn < 0 && ccBoard.board[srcrow][srccol+2].getvalue() == 0) // right
        {
            if(ccBoard.board[srcrow-2][srccol-2].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow,srccol+2));
            }
        }


        diffcolumn = 0;

        ddiffcolumn = 0;

        diffrow = 0;
        diffcolumn = Math.abs(srccol - (srccol - 2));
        ddiffrow = 0;
        ddiffcolumn = srccol - (srccol - 2);
        if(diffrow == 0 && diffcolumn == 2 && ddiffcolumn > 0 && ccBoard.board[srcrow][srccol-2].getvalue() == 0) // left
        {
            if(ccBoard.board[srcrow][srccol-2].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow,srccol-2));
            }
        }

        diffcolumn = 0;
        ddiffcolumn = 0;
        diffrow = Math.abs(srcrow - (srcrow+2));
        diffcolumn = Math.abs(srccol - (srccol+2));
        ddiffrow = srcrow - (srcrow+2);
        ddiffcolumn = srccol - (srccol+2);
        if(diffrow == 2 && diffcolumn == 2 && ddiffrow < 0 && ddiffcolumn < 0
                && ccBoard.board[srcrow+2][srccol+2].getvalue() == 0
                && (ccBoard.board[srcrow+1][srccol+1].getvalue() == 1 || ccBoard.board[srcrow+1][srccol+1].getvalue() == 2) && (srcrow+2) < 17 && (srccol+2) < 25) // jump down right
        {

            if(ccBoard.board[srcrow+2][srccol+2].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow+2,srccol+2));
            }
        }

        /*diffrow = 0;
        diffcolumn = 0;
        ddiffrow = 0;
        ddiffcolumn = 0;*/

        diffrow = Math.abs(srcrow - (srcrow + 2));
        diffcolumn = Math.abs(srccol - (srccol - 2));
        ddiffrow = srcrow - (srcrow + 2);
        ddiffcolumn = srccol - (srccol - 2);

        if(diffrow == 2 && diffcolumn == 2 && ddiffrow < 0 && ddiffcolumn > 0
                && ccBoard.board[srcrow+2][srccol-2].getvalue() == 0
                && (ccBoard.board[srcrow+1][srccol-1].getvalue() == 1 || ccBoard.board[srcrow+1][srccol-1].getvalue() == 2)) // jump down left
        {
            if(ccBoard.board[srcrow+2][srccol-2].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow+2,srccol-2));
            }
        }

        /*diffrow = 0;
        diffcolumn = 0;
        ddiffrow = 0;
        ddiffcolumn = 0;*/

        diffrow = Math.abs(srcrow - (srcrow - 2));
        diffcolumn = Math.abs(srccol - (srccol + 2));
        ddiffrow = srcrow - (srcrow - 2);
        ddiffcolumn = srccol - (srccol + 2);

        if(diffrow == 2 && diffcolumn == 2 && ddiffrow > 0 && ddiffcolumn < 0 && ccBoard.board[srcrow-2][srccol+2].getvalue() == 0
                && (ccBoard.board[srcrow-1][srccol+1].getvalue() == 1 || ccBoard.board[srcrow-1][srccol+1].getvalue() == 2)) // up right
        {
            if(ccBoard.board[srcrow-2][srccol+2].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow-2,srccol+2));
            }
        }
        /*diffrow = 0;
        diffcolumn = 0;
        ddiffrow = 0;
        ddiffcolumn = 0;*/

        diffrow = Math.abs(srcrow - (srcrow - 2));
        diffcolumn = Math.abs(srccol - (srccol - 2));
        ddiffrow = srcrow - (srcrow - 2);
        ddiffcolumn = srccol - (srccol - 2);
        if( diffrow == 2 && diffcolumn == 2 && ddiffrow > 0 && ddiffcolumn > 0 && ccBoard.board[srcrow-2][srccol-2].getvalue() == 0
                && (ccBoard.board[srcrow-1][srccol-1].getvalue() == 1 || ccBoard.board[srcrow-1][srccol-1].getvalue() == 2)) // up left
        {
            if(ccBoard.board[srcrow-2][srccol-2].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow-2,srccol-2));
            }
        }

        /*diffrow = 0;
        diffcolumn = 0;
        ddiffrow = 0;
        ddiffcolumn = 0;*/

        diffrow = Math.abs(srcrow - (srcrow));
        diffcolumn = Math.abs(srccol - (srccol + 4));
        //ddiffrow = srcrow - (srcrow);
        ddiffcolumn = srccol - (srccol + 4);
        if(diffrow == 0 && diffcolumn == 4 && ddiffcolumn < 0 && ccBoard.board[srcrow][srccol+4].getvalue() == 0
                && (ccBoard.board[srcrow][srccol+2].getvalue() == 1 || ccBoard.board[srcrow][srccol+2].getvalue() == 2)) // jump in the same row to the right
        {
            if(ccBoard.board[srcrow][srccol+4].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow,srccol+4));
            }
        }

        /*diffrow = 0;
        diffcolumn = 0;
        ddiffrow = 0;
        ddiffcolumn = 0;*/

        diffrow = Math.abs(srcrow - (srcrow));
        diffcolumn = Math.abs(srccol - (srccol - 4));
        //ddiffrow = srcrow - (srcrow);
        ddiffcolumn = srccol - (srccol - 4);

        if(diffrow == 0 && diffcolumn == 4 && ddiffcolumn > 0 && ccBoard.board[srcrow][srccol-4].getvalue() == 0
                && (ccBoard.board[srcrow][srccol-2].getvalue() == 1 || ccBoard.board[srcrow][srccol-2].getvalue() == 2)) // jump in the same row to the left
        {
            if(ccBoard.board[srcrow][srccol-4].getvalue() != -1)
            {
                possiblemo.add(new Index(srcrow,srccol-4));
            }
        }



        return possiblemo;

    }

    public static void basicmove(Common.Player player,Board board,int arrrow, int arrcolumn, int arr2row, int arr2column)
    {
        int posrow, poscolumn;
        int destrow, destcolumn;
        int diffrow = Math.abs(arrrow - arr2row); // used for restricting the movement of the marble according to row
        int diffcolumn = Math.abs(arrcolumn - arr2column); // used for restricting the movement of the marble according to column
        int ddiffrow = arr2row - arrrow; // used to know the direction of movement according to row
        int ddiffcolumn = arr2column - arrcolumn; // used to know the direction of movement according to column
        Scanner sc = new Scanner(System.in);

        if(board.board[arrrow][arrcolumn].getvalue() == 0)
        {
            if(player == Common.Player.CPU)
            {
                MoveInfo mi = MinMax.minMax(Common.Player.CPU, 1,board,true);
                Move.basicmove(Common.Player.CPU, board, mi.srow, mi.scol, mi.drow,mi.dcol );
            }
            else if(player == Common.Player.HUMAN)
            {
                System.out.println("Invalid Source cell!");
                System.out.println("Enter new row");
                posrow = sc.nextInt();
                arrrow = posrow;
                System.out.println("Enter new column");
                poscolumn = sc.nextInt();
                arrcolumn = poscolumn;
                basicmove(player,board,arrrow,arrcolumn,arr2row,arr2column);
            }
        }
        if(diffrow == 1 && diffcolumn == 1 && board.board[arr2row][arr2column].getvalue() == 1 || board.board[arr2row][arr2column].getvalue() == 2)
        {
            if(player == Common.Player.HUMAN)
            {
                System.out.println("you can't choose from this area");
                System.out.println("Enter new row");
                posrow = sc.nextInt();
                arrrow = posrow;
                System.out.println("Enter new column");
                poscolumn = sc.nextInt();
                arrcolumn = poscolumn;
                System.out.println("Enter new destination row");
                destrow = sc.nextInt();
                System.out.println("Enter new destination column");
                destcolumn = sc.nextInt();
                basicmove(player,board,arrrow,arrcolumn,destrow,destcolumn);
            }
        }
        if(board.board[arrrow][arrcolumn].getvalue() == -1 )
        {
                System.out.println("you can't choose from this area");
                System.out.println("Enter new row");
                posrow = sc.nextInt();
                arrrow = posrow;
                System.out.println("Enter new column");
                poscolumn = sc.nextInt();
                arrcolumn = poscolumn;
                basicmove(player,board,arrrow,arrcolumn,arr2row,arr2column);
        }
        if(board.board[arr2row][arr2column].getvalue() == -1)
        {
            if(player == Common.Player.CPU)
            {
                MoveInfo mi = MinMax.minMax(Common.Player.CPU, 1,board,true);
                Move.basicmove(Common.Player.CPU, board, mi.srow, mi.scol, mi.drow,mi.dcol );
            }
            else
            {
                System.out.println("Invalid move!");
                System.out.println("Enter new row");
                destrow = sc.nextInt();
                System.out.println("Enter new column");
                destcolumn = sc.nextInt();
                basicmove(player,board,arrrow,arrcolumn,destrow,destcolumn);
            }


        }
        else if(board.board[arr2row][arr2column].getvalue() == 0 && diffrow == 1 && diffcolumn == 1) // for normal moves only 1 adjacent move without jump not in the same row
        {
            if(player == Common.Player.HUMAN)
            {
                for(int i = 0; i < board.greenMarbles.size(); i++)
                {
                    if(board.greenMarbles.get(i).row == arrrow)
                    {
                        if(board.greenMarbles.get(i).column == arrcolumn)
                        {
                            board.greenMarbles.remove(i);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.greenMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            else if(player == Common.Player.CPU)
            {
                for(int j = 0; j < board.redMarbles.size(); j++)
                {
                    if(board.redMarbles.get(j).row == arrrow)
                    {
                        if(board.redMarbles.get(j).column == arrcolumn)
                        {
                            board.redMarbles.remove(j);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());;
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.redMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }

        }
        else if(board.board[arr2row][arr2column].getvalue() == 0 && diffrow == 0 && diffcolumn == 2) // for normal moves only 1 adjacent move without jump in the same row
        {
            if(player == Common.Player.HUMAN)
            {
                for(int i = 0; i < board.greenMarbles.size(); i++)
                {
                    if(board.greenMarbles.get(i).row == arrrow)
                    {
                        if(board.greenMarbles.get(i).column == arrcolumn)
                        {
                            board.greenMarbles.remove(i);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());;
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.greenMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            else if(player == Common.Player.CPU)
            {
                for(int j = 0; j < board.redMarbles.size(); j++)
                {
                    if(board.redMarbles.get(j).row == arrrow)
                    {
                        if(board.redMarbles.get(j).column == arrcolumn)
                        {
                            board.redMarbles.remove(j);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.redMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            //board.board[arr2row][arr2column] = board.board[arrrow][arrcolumn];
            //board.board[arrrow][arrcolumn].setvalue(0);
        }
        else if(board.board[arr2row][arr2column].getvalue() == 0 && diffrow == 2 && diffcolumn == 2 && ddiffrow > 0 && ddiffcolumn > 0
                && (board.board[arrrow+1][arrcolumn+1].getvalue() == 1 || board.board[arrrow+1][arrcolumn+1].getvalue() == 2)) // for moves with jump down right
        {
            if(player == Common.Player.HUMAN)
            {
                for(int i = 0; i < board.greenMarbles.size(); i++)
                {
                    if(board.greenMarbles.get(i).row == arrrow)
                    {
                        if(board.greenMarbles.get(i).column == arrcolumn)
                        {
                            board.greenMarbles.remove(i);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.greenMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            else if(player == Common.Player.CPU)
            {
                for(int j = 0; j < board.redMarbles.size(); j++)
                {
                    if(board.redMarbles.get(j).row == arrrow)
                    {
                        if(board.redMarbles.get(j).column == arrcolumn)
                        {
                            board.redMarbles.remove(j);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.redMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            //board.board[arr2row][arr2column] = board.board[arrrow][arrcolumn];
            //board.board[arrrow][arrcolumn].setvalue(0);
        }
        else if(board.board[arr2row][arr2column].getvalue() == 0 && diffrow == 2 && diffcolumn == 2 && ddiffrow < 0 && ddiffcolumn < 0
                && (board.board[arrrow-1][arrcolumn-1].getvalue() == 1 || board.board[arrrow-1][arrcolumn-1].getvalue() == 2)) // for moves with jump top left
        {
            if(player == Common.Player.HUMAN)
            {
                for(int i = 0; i < board.greenMarbles.size(); i++)
                {
                    if(board.greenMarbles.get(i).row == arrrow)
                    {
                        if(board.greenMarbles.get(i).column == arrcolumn)
                        {
                            board.greenMarbles.remove(i);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.greenMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            else if(player == Common.Player.CPU)
            {
                for(int j = 0; j < board.redMarbles.size(); j++)
                {
                    if(board.redMarbles.get(j).row == arrrow)
                    {
                        if(board.redMarbles.get(j).column == arrcolumn)
                        {
                            board.redMarbles.remove(j);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.redMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            //board.board[arr2row][arr2column] = board.board[arrrow][arrcolumn];
            //board.board[arrrow][arrcolumn].setvalue(0);
        }
        else if(board.board[arr2row][arr2column].getvalue() == 0 && diffrow == 2 && diffcolumn == 2 && ddiffrow > 0 && ddiffcolumn < 0
                && (board.board[arrrow+1][arrcolumn-1].getvalue() == 1 || board.board[arrrow+1][arrcolumn-1].getvalue() == 2)) // for moves with jump down left
        {
            if(player == Common.Player.HUMAN)
            {
                for(int i = 0; i < board.greenMarbles.size(); i++)
                {
                    if(board.greenMarbles.get(i).row == arrrow)
                    {
                        if(board.greenMarbles.get(i).column == arrcolumn)
                        {

                            board.greenMarbles.remove(i);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.greenMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            else if(player == Common.Player.CPU)
            {
                for(int j = 0; j < board.redMarbles.size(); j++)
                {
                    if(board.redMarbles.get(j).row == arrrow)
                    {
                        if(board.redMarbles.get(j).column == arrcolumn)
                        {
                            board.redMarbles.remove(j);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.redMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            //board.board[arr2row][arr2column] = board.board[arrrow][arrcolumn];
            //board.board[arrrow][arrcolumn].setvalue(0);
        }
        else if( board.board[arr2row][arr2column].getvalue() == 0 && diffrow == 2 && diffcolumn == 2 && ddiffrow < 0 && ddiffcolumn > 0
                && (board.board[arrrow-1][arrcolumn+1].getvalue() == 1 || board.board[arrrow-1][arrcolumn+1].getvalue() == 2)) // for moves with jump top right
        {
            if(player == Common.Player.HUMAN)
            {
                for(int i = 0; i < board.greenMarbles.size(); i++)
                {
                    if(board.greenMarbles.get(i).row == arrrow)
                    {
                        if(board.greenMarbles.get(i).column == arrcolumn)
                        {
                            board.greenMarbles.remove(i);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.greenMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            else if(player == Common.Player.CPU)
            {
                for(int j = 0; j < board.redMarbles.size(); j++)
                {
                    if(board.redMarbles.get(j).row == arrrow)
                    {
                        if(board.redMarbles.get(j).column == arrcolumn)
                        {
                            board.redMarbles.remove(j);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.redMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            //board.board[arr2row][arr2column] = board.board[arrrow][arrcolumn];
            //board.board[arrrow][arrcolumn].setvalue(0);
        }
        else if(board.board[arr2row][arr2column].getvalue() == 0 && ddiffrow == 0 && ddiffcolumn == 4
                && (board.board[arrrow][arrcolumn+2].getvalue() == 1 || board.board[arrrow][arrcolumn+2].getvalue() == 2)) // for moves with jump in the same row to the right side
        {
            if(player == Common.Player.HUMAN)
            {
                for(int i = 0; i < board.greenMarbles.size(); i++)
                {
                    if(board.greenMarbles.get(i).row == arrrow)
                    {
                        if(board.greenMarbles.get(i).column == arrcolumn)
                        {
                            board.greenMarbles.remove(i);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.greenMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            else if(player == Common.Player.CPU)
            {
                for(int j = 0; j < board.redMarbles.size(); j++)
                {
                    if(board.redMarbles.get(j).row == arrrow)
                    {
                        if(board.redMarbles.get(j).column == arrcolumn)
                        {
                            board.redMarbles.remove(j);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.redMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            //board.board[arr2row][arr2column] = board.board[arrrow][arrcolumn];
            //board.board[arrrow][arrcolumn].setvalue(0);
        }
        else if(board.board[arr2row][arr2column].getvalue() == 0 && ddiffrow == 0 && ddiffcolumn == -4
                && (board.board[arrrow][arrcolumn-2].getvalue() == 1 || board.board[arrrow][arrcolumn-2].getvalue() == 2)) // for moves with jump in the same row to the left side
        {
            if(player == Common.Player.HUMAN)
            {
                for(int i = 0; i < board.greenMarbles.size(); i++)
                {
                    if(board.greenMarbles.get(i).row == arrrow)
                    {
                        if(board.greenMarbles.get(i).column == arrcolumn)
                        {
                            board.greenMarbles.remove(i);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.greenMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            else if(player == Common.Player.CPU)
            {
                for(int j = 0; j < board.redMarbles.size(); j++)
                {
                    if(board.redMarbles.get(j).row == arrrow)
                    {
                        if(board.redMarbles.get(j).column == arrcolumn)
                        {
                            board.redMarbles.remove(j);
                            board.board[arr2row][arr2column].setvalue(board.board[arrrow][arrcolumn].getvalue());
                            board.board[arrrow][arrcolumn].setvalue(0);
                            board.redMarbles.add(new Index(arr2row, arr2column));
                        }
                    }
                }
            }
            //board.board[arr2row][arr2column] = board.board[arrrow][arrcolumn];
            //board.board[arrrow][arrcolumn].setvalue(0);
        }
    }

}