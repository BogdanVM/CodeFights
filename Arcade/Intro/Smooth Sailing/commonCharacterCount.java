public class Demo {

    int commonCharacterCount(String s1, String s2) {

        char[] sorted = s1.toCharArray();
        Arrays.sort(sorted);
        String sortedS1 = new String(sorted);

        sorted = s2.toCharArray();
        Arrays.sort(sorted);
        String sortedS2 = new String(sorted);

        int iS1 = 0, iS2 = 0;
        int common = 0;

        while (iS1 < sortedS1.length() && iS2 < sortedS2.length()) {

            if (sortedS1.charAt(iS1) == sortedS2.charAt(iS2)) {
                common++;
                iS1++;
                iS2++;
            } else if (sortedS2.charAt(iS2) > sortedS1.charAt(iS1)) {
                iS1++;
            } else {
                iS2++;
            }
        }

        return common;
    }
}