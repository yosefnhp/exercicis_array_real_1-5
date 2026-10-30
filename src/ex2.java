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

    int[][] datos = new int[3][m];

    for (int j = 0; j < m; j++) {
        int suma = 0;
        int max = numeros[0][j];
        int min = numeros[0][j];

        for (int i = 0; i < n; i++) {
            suma += numeros[i][j];

            if (numeros[i][j] > max) {
                max = numeros[i][j];
            }
            if (numeros[i][j] < min) {
                min = numeros[i][j];
            }
        }

        datos[0][j] = suma;
        datos[1][j] = max;
        datos[2][j] = min;
    }

    for (int j = 0; j < m; j++) {
        System.out.println("Columna " + j + ": Suma: " + datos[0][j] + ", Max: " + datos[1][j] + ", Min: " + datos[2][j]);
    }
}