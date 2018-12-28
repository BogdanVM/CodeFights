public class Demo {

    int matrixElementsSum(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] != 0) {

                    if (i == 0 || matrix[i - 1][j] != 0) {
                        sum += matrix[i][j];
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        return sum;
    }
}