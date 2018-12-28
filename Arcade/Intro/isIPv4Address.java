public class Demo {

    boolean isIPv4Address(String inputString) {

        String[] numbers = inputString.split("\\.");
        if (numbers.length != 4) {
            return  false;
        }

        for (String s : numbers) {

            try {
                Integer x = Integer.parseInt(s);

                if (x < 0 || x > 255)
                    return false;

            } catch (NumberFormatException ex) {
                return false;
            }
        }

        return true;
    }
}
