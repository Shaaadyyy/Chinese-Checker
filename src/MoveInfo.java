public class MoveInfo
{
    
    public int srow;
    public int scol;
    public int drow;
    public int dcol;
    public int evaluated_value;
    MoveInfo()
    {
    }
    MoveInfo(int sr, int sc, int dr, int dc, int evaluated_val)
    {
        srow = sr;
        scol = sc;
        drow = dr;
        dcol = dc;
        evaluated_value = evaluated_val;
    }
}
