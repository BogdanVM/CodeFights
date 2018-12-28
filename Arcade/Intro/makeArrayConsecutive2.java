public class Demo {

    int makeArrayConsecutive2(int[] statues) {

        Arrays.sort(statues);

        int missingStatues = 0;
        for (int i = 0; i < statues.length - 1; ++i) {

            if (statues[i + 1] - statues[i] > 1) {
                missingStatues += statues[i + 1] - statues[i] - 1;
            }
        }

        return missingStatues;
    }
}