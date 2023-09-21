import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input dimensions
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Initialize the matrix
        int[][] matrixA = new int[N][M];

        // Read the matrix values
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Initialize the sum to zero
        int boundarySum = 0;

        // Iterate through the matrix and add boundary values
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == M - 1) {
                    boundarySum += matrixA[i][j];
                }
            }
        }
        // Print the sum of boundary values
        System.out.println(boundarySum);
        
        scanner.close();
    }
}
