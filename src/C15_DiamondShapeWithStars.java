public class C15_DiamondShapeWithStars {
    public static void main(String[] args) {
        /*
         check the shape line by line
         the spaces at the beginning of the line should be considered separately
         then the star+space ("* ") part should be considered as a different figure
         first line starts with 4 spaces and continues with one single star+space ("* ")
         As the lines go down the spaces at the beginning decrease one by one
         whereas ("* ") part increases one by one
         No spaces at the beginning of mid-line and 5 times ("* ") side by side
         just below the mid-line the above process is just the opposite
         increase the spaces one by one and decrease the ("* ") part one by one
         that's it, we got the shape :)
        */

        int n = 5; // Adjust the shape as 5 stars at the mid-line

        // let's print the top 5 lines
        for (int i = 1; i <= n; i++) {
            // print the spaces that should be at the beginning of each line
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print the ("* ") figure that should be at the end of each line
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // now just reverse the process for the last 4 lines
        for (int i = n - 1; i >= 1; i--) {
            // print the spaces that should be at the beginning of each line
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // print the ("* ") figure that should be at the end of each line
            for (int k = i; k >= 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
