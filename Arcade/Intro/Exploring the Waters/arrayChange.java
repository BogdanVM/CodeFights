public class Demo {

    int arrayChange(int[] inputArray) {

        int changes = 0;
        for (int i = 0; i < inputArray.length - 1; ++i) {
            if (inputArray[i + 1] <= inputArray[i]) {

                int necessaryChanges = inputArray[i] - inputArray[i + 1] + 1;
                changes += necessaryChanges;
                inputArray[i + 1] += necessaryChanges;
            }
        }

        return changes;
    }
}