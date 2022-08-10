import java.util.ArrayList;

public class MinMax
{
        public static MoveInfo utilityFun(Board board)
    {
        MoveInfo info = new MoveInfo();
        int row = 17;
        int column = 25;
        int G = 13;
        int R = 3;
        int DistanceG = 0;
        int DistanceR = 0;
        for(int r = 0; r < row; r++)
        {
            for (int c = 0; c < column; c++)
            {
                if (board.board[r][c].getvalue() == 1)
                {
                    DistanceG += Math.abs(r - G);

                }
                else if(board.board[r][c].getvalue() == 2)
                {
                        DistanceR += Math.abs(r - R);
                }
            }
        }
        info.evaluated_value = DistanceR - DistanceG;
        return info;
    }


    public static MoveInfo minMax(Common.Player player, int levelNum, Board CCBoard, boolean maximizing){
        if(levelNum == 0){
            return utilityFun(CCBoard);
        }

        levelNum--;

        ArrayList<Integer> marblesrows = new ArrayList<>();
        ArrayList<Integer> marblescol = new ArrayList<>();

        if(player == Common.Player.HUMAN)
        {
            for(int i = 0; i < CCBoard.greenMarbles.size(); i++)
            {
                marblesrows.add(CCBoard.greenMarbles.get(i).row);
                marblescol.add(CCBoard.greenMarbles.get(i).column);
            }

        }
        else{
            for(int i = 0; i < CCBoard.redMarbles.size(); i++)
            {
                marblesrows.add(CCBoard.redMarbles.get(i).row);
                marblescol.add(CCBoard.redMarbles.get(i).column);
            }
        }

        MoveInfo bestMove = new MoveInfo();
        bestMove.evaluated_value = maximizing? Integer.MIN_VALUE : Integer.MAX_VALUE;

        try {
            for (int i = 0; i < marblesrows.size(); i++) {

                ArrayList<Index> possibleMoves;
                // getting all possible moves for the current cell
                possibleMoves = Move.getAllPossibleMoves(
                        CCBoard,
                        marblesrows.get(i),
                        marblescol.get(i)
                );

                for (int j = 0; j < possibleMoves.size(); j++) {
                    Board childBoard = new Board();
                    CCBoard.copy(CCBoard, childBoard);
                    Move.basicmove(player, childBoard, marblesrows.get(j), marblescol.get(j), possibleMoves.get(j).row, possibleMoves.get(j).column);
                    Common.Player nextPlayer = player == Common.Player.HUMAN ? Common.Player.CPU : Common.Player.HUMAN;

                    MoveInfo moveInfo = minMax(nextPlayer, levelNum - 1, childBoard, !maximizing);
                    moveInfo.srow = marblesrows.get(j);
                    moveInfo.scol = marblescol.get(j);
                    moveInfo.drow = possibleMoves.get(j).row;
                    moveInfo.dcol = possibleMoves.get(j).column;

                    if ((maximizing && moveInfo.evaluated_value > bestMove.evaluated_value) || (!maximizing && moveInfo.evaluated_value < bestMove.evaluated_value)) {
                        bestMove = moveInfo;
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
            {

            }


        return bestMove;
    }
}
