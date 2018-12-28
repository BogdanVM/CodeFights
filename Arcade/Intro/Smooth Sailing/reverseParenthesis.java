public class Demo {

    String reverseParentheses(String s) {

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ')') {

                s = s.substring(0, i) + s.substring(i + 1);
                i--;

                String rev = "";
                while (s.charAt(i) != '(') {
                    rev = rev + s.charAt(i);
                    s = s.substring(0, i) + s.substring(i + 1);
                    i--;
                }

                s = s.substring(0, i) + rev + s.substring(i + 1);
                i += rev.length() - 1;
            }
        }

        return s;
    }
}