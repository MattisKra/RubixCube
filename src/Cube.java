import java.util.Arrays;
import java.util.Collections;

public class Cube {
    private Color[][][] colors = new Color[3][3][6];

    // 0= this, 1 = right, 2 = up, 3 = left, 4 = down, 5 = opposite,
    private int[][] adjacencyMatrix = new int[][] { {1, 2, 6, 4, 5, 3},
                                                    {2, 3, 6, 1, 5, 4},
                                                    {3, 4, 6, 2, 5, 1},
                                                    {4, 1, 6, 3, 5, 2},
                                                    {5, 2, 1, 4, 3, 6},
                                                    {6, 4, 1, 2, 3, 5} };

    public Cube() {

    }

    private boolean isSolved() {
        return false;
    }

    private Color[] getRow(int face, int row) {
        Color[] returnData = new Color[3];

        for(int i = 0; i < 3; i++)
            returnData[i] = colors[i][row][face];

        return returnData;
    }

    private void setRow(int face, int row, Color[] rowData) {
        for(int i = 0; i < 3; i++)
            colors[i][row][face] = rowData[i];
    }

    private Color[] getColumn(int face, int column) {
        Color[] returnData = new Color[3];

        for(int i = 0; i < 3; i++)
            returnData[i] = colors[column][i][face];

        return returnData;
    }

    private void setColumn(int face, int column, Color[] columnData) {
        for(int i = 0; i < 3; i++)
            colors[column][i][face] = columnData[i];
    }

    public makeMove(int face, int row, int column, Direction direction) {
        assert face >= 0 && face <= 5
            && row >= 0 && row <=3
            && column >= 0 && column <= 3
            && direction.compareTo(Direction.RIGHT) >= 0 && direction.compareTo(Direction.DOWN) <= 0;

        // Get all changing Faces
        int[] changingFaces = new int[4];

        if(direction == Direction.DOWN || direction == direction.UP)
        {
            changingFaces[0] = adjacencyMatrix[0][face];
            changingFaces[1] = adjacencyMatrix[2][face];
            changingFaces[2] = adjacencyMatrix[5][face];
            changingFaces[3] = adjacencyMatrix[4][face];
        }
        else {
            changingFaces[0] = adjacencyMatrix[0][face];
            changingFaces[1] = adjacencyMatrix[1][face];
            changingFaces[2] = adjacencyMatrix[5][face];
            changingFaces[3] = adjacencyMatrix[3][face];
        }

        // Reverse array
        if(direction == Direction.DOWN || direction == Direction.LEFT)
            Collections.reverse(Arrays.asList(changingFaces));


        // Change selected faces
        


    }



}
