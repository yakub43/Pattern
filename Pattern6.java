public class Pattern2 {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void patter6(int n){
        for (int row = 0; row < n * 2; row++){
            // for every row, run the col
            int totalColsInRow = row > n ? 2 * n - row : row;
            // print number of spaces
            int noOfSpace = n - totalColsInRow;
            for (int space = 0; space < noOfSpace ; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

}
