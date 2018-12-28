public class Demo {

    boolean checkPalindrome(String inputString) {

        int last = inputString.length() - 1;
        int first = 0;

        while (first < last) {

            if (inputString.charAt(first) != inputString.charAt(last)) {
                return false;
            }

            first++;
            last--;
        }

        return true;
    }
}