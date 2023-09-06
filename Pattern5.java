public class Pattern2 {
    public static void main(String[] args) {
        pattern5(4);
    }
    static void pattern5(int n){
        for (int row = 1; row <= n; row++){
            // for every row, run the col
            int totalColsInRow = row > n ? 2*n - row : row;
            for (int col = 1; col < totalColsInRow; col++){
                System.out.print(col+" ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

}
