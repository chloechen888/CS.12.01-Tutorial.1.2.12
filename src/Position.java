public class Position {
    public int getC() {
        return collum;
    }

    public void setCollum(int collum) {
        this.collum = collum;
    }

    public int getR() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    int collum;
    int row;

    public Position(int row,int collum)
    {
        this.collum =collum;
        this.row=row;
    }


}
