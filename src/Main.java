public class Main {
    public static void main(String[] args) {
        // Örnek bir matris oluşturma
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Matrisin satır ve sütun sayılarını al
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpoz matrisi oluşturma
        int[][] transpose = new int[cols][rows];

        // Matrisin transpozunu bulma
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Matrisin transpozunu ekrana yazdırma
        System.out.println("Matris:");
        printMatrix(matrix);
        System.out.println("\nTranspoz Matris:");
        printMatrix(transpose);
    }

    // Matrisi ekrana yazdırmak için yardımcı bir metod
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
