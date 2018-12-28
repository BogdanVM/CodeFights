public class Demo {

    boolean almostIncreasingSequence(int[] sequence) {

        int removableElements = 0;
        for (int i = 1; i < sequence.length; ++i) {

            if (sequence[i] <= sequence[i - 1]) {

                if (removableElements > 0) {
                    return false;
                }

                removableElements++;

                if (i == 1 || i == sequence.length - 1)
                    continue;

                if (sequence[i] > sequence[i - 2]) {
                    sequence[i - 1] = sequence[i - 2];
                }
                else if (sequence[i - 1] >= sequence[i + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}