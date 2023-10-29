import java.util.Random;

public class C12_5x5MatrixWithDiagonalSum {
    public static void main(String[] args) {

/*
Create a 5*5 matrix with the random integers between 0 - 9.
Print the matrix and the diagonal (from top left to the right bottom) sum on the screen.
You can use Random Class to create random integers :)
*/

        //int [][] arr = new int[5][5];
        int diagonalSum =0;

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int matrixElement = random.nextInt(10);
                System.out.print(matrixElement +"   ");
                if (i==j){
                    diagonalSum+=matrixElement; //arr[i][j];
                }

            }System.out.println();
        }
        System.out.println("Diagonal Sum ==> " + diagonalSum);
    }
}
