public class Index
{
    public int row;
    public int column;

    Index()
    {}
    Index(int r, int c)
    {
        row = r;
        column = c;
    }

    public void setRow(int r)
    {
        row = r;
    }
    public void setColumn(int c)
    {
        column = c;
    }

    public int getRow()
    {
        return row;
    }

    public int getColumn()
    {
        return column;
    }

}
