public class Demo {

    boolean palindromeRearranging(String inputString) {
        HashMap<Character, Integer> appearances = new HashMap<>();

        for (int i = 0; i < inputString.length(); ++i) {

            Integer appI = appearances.get(inputString.charAt(i));

            if (appI != null) {
                appearances.put(inputString.charAt(i), appI + 1);
            } else {
                appearances.put(inputString.charAt(i), 1);
            }
        }

        Iterator it = appearances.entrySet().iterator();
        int allowed = 1;
        boolean odd = false;

        while (it.hasNext()) {
            Map.Entry<Character, Integer> entry = (Map.Entry<Character, Integer>)it.next();

            if (inputString.length() % 2 == 0) {
                if (entry.getValue() % 2 != 0) {
                    return false;
                }
            }

            else {
                /* If the string's length is odd, it's allowed only one char to appear an odd amount of times */
                odd = true;
                if (entry.getValue() % 2 != 0) {
                    if (allowed == 0) {
                        return false;
                    } else {
                        allowed--;
                    }
                }
            }
        }

        if (odd && allowed != 0)
            return false;

        return true;
    }
}