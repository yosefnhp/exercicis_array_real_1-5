import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);

    System.out.println("Introduce numero de filas: ");
    int n = input.nextInt();
    System.out.println("Introduce numero de columnas: ");
    int m = input.nextInt();

    int[][] numeros = new int[n][m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            numeros[i][j] = input.nextInt();
        }
    }

    int[] sumaColumnas = new int[m];

    for (int j = 0; j < m; j++) {
        for (int i = 0; i < n; i++) {
            sumaColumnas[j] += numeros[i][j];
        }
    }

    System.out.println("Suma de cada columna:");
    for (int j = 0; j < m; j++) {
        System.out.println("Columna " + j + ": " + sumaColumnas[j]);
    }
}