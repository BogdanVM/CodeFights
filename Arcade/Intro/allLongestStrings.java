public class Demo {

    String[] allLongestStrings(String[] inputArray) {

        List<String> longestStrings = new ArrayList<>();

        int maximum = 0;
        for (int i = 0; i < inputArray.length; ++i) {

            if (inputArray[i].length() > maximum) {

                maximum = inputArray[i].length();
                longestStrings.clear();
                longestStrings.add(inputArray[i]);
            }

            else if (inputArray[i].length() == maximum){
                longestStrings.add(inputArray[i]);
            }
        }

        return longestStrings.toArray(new String[0]);
    }
}