
public class C13_MultiplicationMatrix {

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
        int [][] arr = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (i+1)*(j+1);
               System.out.print(arr[i][j]);
               if ( (i+j)<4){
                   System.out.print("  "); //two space after the element if the sum of its index values (i+j) is smaller than 4
               }else {
                   System.out.print(" "); //only one space after the element
               }

            }
            System.out.println();
        }

    }
}
