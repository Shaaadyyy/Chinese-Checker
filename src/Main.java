import java.util.Scanner;

public class Main
{
    static public boolean checkWin(Board board)
    {
        if (board.board[0][12].getvalue() == 2 && board.board[1][11].getvalue() == 2 && board.board[1][13].getvalue() == 2 && board.board[2][10].getvalue() == 2
                && board.board[2][12].getvalue() == 2 && board.board[2][14].getvalue() == 2 && board.board[3][9].getvalue() == 2 && board.board[3][11].getvalue() == 2
                && board.board[3][13].getvalue() == 2 && board.board[3][15].getvalue() == 2)
        {
            System.out.println("Computer wins.");
            return true;
        }
        else if (board.board[16][12].getvalue() == 1 && board.board[15][11].getvalue() == 1 && board.board[15][13].getvalue() == 1 && board.board[14][10].getvalue() == 1
                && board.board[14][12].getvalue() == 1 && board.board[14][14].getvalue() == 1 && board.board[13][9].getvalue() == 1
                && board.board[13][11].getvalue() == 1 && board.board[13][13].getvalue() == 1 && board.board[13][15].getvalue() == 1)
        {
            System.out.println("Player wins.");
            return true;
        }
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int srow;
        int scol;
        int drow;
        int dcol;
        int level = 0;
        System.out.println("Choose difficulty level:");
        System.out.println("1- Easy \n2- Medium \n3- Hard");
        level = sc.nextInt();
        if(level == 1)
        {
            Board board = new Board();
            System.out.println("Building Board...");
            System.out.println("Board built successfully!!");
            board.buildboard();
            board.printboard();
            while(!checkWin(board))
            {
                Common.Player p = Common.Player.HUMAN;
                System.out.println("<Human Turn>");
                System.out.println("Choose your marble! (r/c)\n");
                srow = sc.nextInt();
                scol = sc.nextInt();
                System.out.println("Choose your destination (r/c)\n");
                drow = sc.nextInt();
                dcol = sc.nextInt();
                Move.basicmove(p,board,srow,scol,drow,dcol);
                board.printboard();
                System.out.println("\n");
                System.out.println("<AI Turn>");
                MoveInfo mi = MinMax.minMax(Common.Player.CPU, level,board,true);
                Move.basicmove(Common.Player.CPU, board, mi.srow, mi.scol, mi.drow,mi.dcol );
                board.printboard();
                System.out.println("\n");

            }
        }
        else if(level == 2)
        {
            Board board = new Board();
            System.out.println("Building Board...");
            System.out.println("Board built successfully!!");
            board.buildboard();
            board.printboard();
            while(!checkWin(board))
            {
                Common.Player p = Common.Player.HUMAN;
                System.out.println("<Human Turn>");
                System.out.println("Choose your marble! (r/c)\n");
                srow = sc.nextInt();
                scol = sc.nextInt();
                System.out.println("Choose your destination (r/c)\n");
                drow = sc.nextInt();
                dcol = sc.nextInt();
                Move.basicmove(p,board,srow,scol,drow,dcol);
                board.printboard();
                System.out.println("\n");
                System.out.println("<AI Turn>");
                MoveInfo mi = MinMax.minMax(Common.Player.CPU, level,board,true);
                Move.basicmove(Common.Player.CPU, board, mi.srow, mi.scol, mi.drow,mi.dcol );
                board.printboard();
                System.out.println("\n");

            }
        }
        else if(level == 3)
        {
            Board board = new Board();
            System.out.println("");
            System.out.println("Building Board...");
            System.out.println("Board built successfully!!\n");
            board.buildboard();
            board.printboard();
            while(!checkWin(board))
            {
                Common.Player p = Common.Player.HUMAN;
                System.out.println("<Human Turn>");
                System.out.println("Choose your marble! (r/c)");
                srow = sc.nextInt();
                scol = sc.nextInt();
                System.out.println("Choose your destination (r/c)\n");
                drow = sc.nextInt();
                dcol = sc.nextInt();
                Move.basicmove(p,board,srow,scol,drow,dcol);
                board.printboard();
                System.out.println("\n");
                System.out.println("<AI Turn>");
                MoveInfo mi = MinMax.minMax(Common.Player.CPU, level,board,true);
                Move.basicmove(Common.Player.CPU, board, mi.srow, mi.scol, mi.drow,mi.dcol );
                board.printboard();
                System.out.println("\n");

            }
        }
    }
}
