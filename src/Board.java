import java.util.ArrayList;

public class Board
{
    public  int row = 17;
    public  int column = 25;
    public static MarbleNode[][] board = new MarbleNode[17][25];
    public ArrayList<Index> greenMarbles = new ArrayList<>();
    public ArrayList<Index> redMarbles = new ArrayList<>();

    public void copy(Board board1, Board board2)
    {
        for(int i = 0; i < board1.board.length; i++)
            board2.board[i] =  board1.board[i].clone();
    }




    Board()
    {
    }

    public void buildboard()
    {
        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < column; c++)
            {
                board[r][c] = new MarbleNode();
            }

        }


        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < column; c++)
            {
                board[r][c].setvalue(-1);
            }

        }

        board[0][12].setvalue(1);
        greenMarbles.add(new Index(0,12));
        board[1][11].setvalue(1);
        greenMarbles.add(new Index(1,11));
        board[1][13].setvalue(1);
        greenMarbles.add(new Index(1,13));
        board[2][10].setvalue(1);
        greenMarbles.add(new Index(2,10));
        board[2][12].setvalue(1);
        greenMarbles.add(new Index(2,12));
        board[2][14].setvalue(1);
        greenMarbles.add(new Index(2,14));
        board[3][9].setvalue(1);
        greenMarbles.add(new Index(3,9));
        board[3][11].setvalue(1);
        greenMarbles.add(new Index(3,11));
        board[3][13].setvalue(1);
        greenMarbles.add(new Index(3,13));
        board[3][15].setvalue(1);
        greenMarbles.add(new Index(3,15));

        board[4][18].setvalue(0);
        board[4][20].setvalue(0);
        board[4][22].setvalue(0);
        board[4][24].setvalue(0);
        board[5][19].setvalue(0);
        board[5][21].setvalue(0);
        board[5][23].setvalue(0);
        board[6][20].setvalue(0);
        board[6][22].setvalue(0);
        board[7][21].setvalue(0);

        board[9][21].setvalue(0);
        board[10][20].setvalue(0);
        board[10][22].setvalue(0);
        board[11][19].setvalue(0);
        board[11][21].setvalue(0);
        board[11][23].setvalue(0);
        board[12][18].setvalue(0);
        board[12][20].setvalue(0);
        board[12][22].setvalue(0);
        board[12][24].setvalue(0);

        board[9][21 - 18].setvalue(0);
        board[10][20 - 18].setvalue(0);
        board[10][22 - 18].setvalue(0);
        board[11][19 - 18].setvalue(0);
        board[11][21 - 18].setvalue(0);
        board[11][23 - 18].setvalue(0);
        board[12][18 - 18].setvalue(0);
        board[12][20 - 18].setvalue(0);
        board[12][22 - 18].setvalue(0);
        board[12][24 - 18].setvalue(0);

        board[4][18 - 18].setvalue(0);
        board[4][20 - 18].setvalue(0);
        board[4][22 - 18].setvalue(0);
        board[4][24 - 18].setvalue(0);
        board[5][19 - 18].setvalue(0);
        board[5][21 - 18].setvalue(0);
        board[5][23 - 18].setvalue(0);
        board[6][20 - 18].setvalue(0);
        board[6][22 - 18].setvalue(0);
        board[7][21 - 18].setvalue(0);

        board[4][8].setvalue(0);
        board[4][10].setvalue(0);
        board[4][12].setvalue(0);
        board[4][14].setvalue(0);
        board[4][16].setvalue(0);

        board[5][7].setvalue(0);
        board[5][9].setvalue(0);
        board[5][11].setvalue(0);
        board[5][13].setvalue(0);
        board[5][15].setvalue(0);
        board[5][17].setvalue(0);

        board[6][6].setvalue(0);
        board[6][8].setvalue(0);
        board[6][10].setvalue(0);
        board[6][12].setvalue(0);
        board[6][14].setvalue(0);
        board[6][16].setvalue(0);
        board[6][18].setvalue(0);

        board[7][5].setvalue(0);
        board[7][7].setvalue(0);
        board[7][9].setvalue(0);
        board[7][11].setvalue(0);
        board[7][13].setvalue(0);
        board[7][15].setvalue(0);
        board[7][17].setvalue(0);
        board[7][19].setvalue(0);

        board[7][5].setvalue(0);
        board[7][7].setvalue(0);
        board[7][9].setvalue(0);
        board[7][11].setvalue(0);
        board[7][13].setvalue(0);
        board[7][15].setvalue(0);
        board[7][17].setvalue(0);
        board[7][19].setvalue(0);

        board[8][4].setvalue(0);
        board[8][6].setvalue(0);
        board[8][8].setvalue(0);
        board[8][10].setvalue(0);
        board[8][12].setvalue(0);
        board[8][14].setvalue(0);
        board[8][16].setvalue(0);
        board[8][18].setvalue(0);
        board[8][20].setvalue(0);

        board[9][5].setvalue(0);
        board[9][7].setvalue(0);
        board[9][9].setvalue(0);
        board[9][11].setvalue(0);
        board[9][13].setvalue(0);
        board[9][15].setvalue(0);
        board[9][17].setvalue(0);
        board[9][19].setvalue(0);
        board[10][6].setvalue(0);
        board[10][8].setvalue(0);
        board[10][10].setvalue(0);
        board[10][12].setvalue(0);
        board[10][14].setvalue(0);
        board[10][16].setvalue(0);
        board[10][18].setvalue(0);

        board[11][7].setvalue(0);
        board[11][9].setvalue(0);
        board[11][11].setvalue(0);
        board[11][13].setvalue(0);
        board[11][15].setvalue(0);
        board[11][17].setvalue(0);

        board[12][8].setvalue(0);
        board[12][10].setvalue(0);
        board[12][12].setvalue(0);
        board[12][14].setvalue(0);
        board[12][16].setvalue(0);


        board[13][9].setvalue(2);
        redMarbles.add(new Index(13,9));
        board[13][11].setvalue(2);
        redMarbles.add(new Index(13,11));
        board[13][13].setvalue(2);
        redMarbles.add(new Index(13,13));
        board[13][15].setvalue(2);
        redMarbles.add(new Index(13,15));
        board[14][10].setvalue(2);
        redMarbles.add(new Index(14,10));
        board[14][12].setvalue(2);
        redMarbles.add(new Index(14,12));
        board[14][14].setvalue(2);
        redMarbles.add(new Index(14,14));
        board[15][11].setvalue(2);
        redMarbles.add(new Index(15,11));
        board[15][13].setvalue(2);
        redMarbles.add(new Index(15,13));
        board[16][12].setvalue(2);
        redMarbles.add(new Index(16,12));
    }


    public void printboard()
    {
        for(int r = 0; r < row; r++)
        {
            for(int c = 0; c < column; c++)
            {
                if(board[r][c].getvalue() == 0 || board[r][c].getvalue() == 1 || board[r][c].getvalue() == 2)
                    System.out.print(board[r][c].getvalue());
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
