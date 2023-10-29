public class C14_MultiplicationMatrixNoArray {
    public static void main(String[] args) {

/*
Print the multiplication table on the screen as a two-dimensional table
Output should be as below:
        1  2  3  4  5
        2  4  6  8 10
        3  6  9 12 15
        4  8 12 16 20
        5 10 15 20 25
*/

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (i + j < 6 ) {
                    System.out.print(i * j + "  ");
                } else {
                    System.out.print(i * j + " ");
                }

            }
            System.out.println();
        }

    }
}
