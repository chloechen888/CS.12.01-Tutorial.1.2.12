public class Successors {

    public static Position findPosition(int c, int[][] array) {
        int collum = 0;
        int row = 0;
        for (int i = 0; i <array.length; i++) {
            for (int f = 0; f < array[i].length; f++) {
                if (c == array[i][f]) {
                    collum = f;
                    row = i;
                    Position p = new Position(row, collum);
                    return p;
//
                }
            }
        }
        return null;


    }

    public static Position[][] getSuccessorArray(int [][] array)
    {
        Position[][] p = new Position[array.length][array[1].length];
        for(int i=0; i<array.length;i++) {
            for (int j = 0; j < array[0].length; j++) {
                int f = array[i][j] +1;
                Position pos = findPosition(f,array);
                p[i][j] = pos;
            }
        }

        return p;



    }

}
