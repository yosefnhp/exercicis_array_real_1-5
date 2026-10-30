import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    int[][] notas = new int[20][6];

    for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 3; j++) {
            notas[i][j] = input.nextInt();
        }
    }

    int mejorCurso = notas[0][0];
    int peorCurso = notas[0][0];

    for (int i = 0; i < 20; i++) {
        int suma = 0;
        int max = notas[i][0];
        int min = notas[i][0];

        for (int j = 0; j < 3; j++) {
            suma += notas[i][j];

            if (notas[i][j] > max) {
                max = notas[i][j];
            }
            if (notas[i][j] < min) {
                min = notas[i][j];
            }
        }

        notas[i][3] = suma / 3;
        notas[i][4] = max;
        notas[i][5] = min;

        if (max > mejorCurso) {
            mejorCurso = max;
        }
        if (min < peorCurso) {
            peorCurso = min;
        }
    }

    for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 6; j++) {
            System.out.print(notas[i][j] + " ");
        }
        System.out.println();
    }

    System.out.println("Mejor nota: " + mejorCurso);
    System.out.println("Peor nota: " + peorCurso);
}