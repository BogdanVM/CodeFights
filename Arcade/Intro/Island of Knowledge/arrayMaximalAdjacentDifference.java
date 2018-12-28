public class Demo {

    int arrayMaximalAdjacentDifference(int[] inputArray) {

        int maximumDif = 0;
        for (int i = 0; i < inputArray.length - 1; ++i) {
            if (Math.abs(inputArray[i] - inputArray[i + 1]) > maximumDif) {
                maximumDif = Math.abs(inputArray[i] - inputArray[i + 1]);
            }
        }

        return maximumDif;
    }
}