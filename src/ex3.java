void main() {
    int[][] matriz = new int[5][5];

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if (i == 0 || i == 4 || i == j) {
                matriz[i][j] = 1;
            } else {
                matriz[i][j] = 0;
            }
        }
    }

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if (matriz[i][j] == 1) {
                System.out.print("X ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}