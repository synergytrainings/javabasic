public class MatrixMultiplication {

    public static void main(String[] args) {


        //Matrix initialization.

        double[][] firstMatrix = {
                {1,0,-7,6},
                {3,88,16,4},
                {0,0,-1,-9}
        };

        double[][] secondMatrix = {
                {3,3,4},
                {-5,6,8},
                {14,3,4},
                {5,0,0},

        };
        int[] a = new int [7];
        System.out.println("l = " + a.length);


        double[][] resultMatrix = multipleMatrix(firstMatrix,secondMatrix);

        if(resultMatrix.length != 0 ) {
            int len1 = resultMatrix.length;
            int len2 = resultMatrix[0].length;
            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < len2; j++) {
                    System.out.print(resultMatrix[i][j] + "   ");
                    if (j == len2 - 1) {
                        System.out.println("");
                    }
                }
            }
        } else {
          System.out.println("Something bad with your matrices , please check them !");
        }
        //End of initialization .


    }

    public static double[][] multipleMatrix(double[][] firstMatrix, double[][] secondMatrix) {

        if (isNormalMatrix(firstMatrix) && isNormalMatrix(secondMatrix) && firstMatrix[0].length == secondMatrix.length) {
            int rows = firstMatrix.length;
            int cols = secondMatrix[0].length;
            int vectorLength = secondMatrix.length;
            double[][] result_Matrix = new double[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result_Matrix[i][j] = 0;
                    for (int k = 0; k < vectorLength; k++) {
                        result_Matrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                    result_Matrix[i][j] = firstMatrix[i][j];
                }
            }

            return result_Matrix;
        }


        return new double[][]{};
    }

    public static boolean isNormalMatrix(double[][] matrix) {

        if (matrix == null) {
            return false;
        }

        int lengthOfMatrix = matrix.length;

        if (lengthOfMatrix == 0) {
            return false;
        }

        int lengthOfRows = matrix[0].length;

        for (int i = 0; i < lengthOfMatrix; i++) {
            if (matrix[i].length != lengthOfRows) {
                return false;
            }
        }

        return true;
    }
}
