public class Demo {

    int avoidObstacles(int[] inputArray) {

        int div = 2;
        while (true) {

            int j;
            for (j = 0; j < inputArray.length; ++j) {
                if (inputArray[j] % div == 0) {
                    break;
                }
            }

            if (j == inputArray.length) {
                return div;
            }

            div++;
        }

    }
}