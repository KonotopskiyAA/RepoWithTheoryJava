package base;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[][] chisla = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < chisla.length; i++) {
            for (int j = 0; j < chisla[i].length; j++) {
                System.out.print(chisla[i][j] + " ");
            }
            System.out.println();
        }
    }
}