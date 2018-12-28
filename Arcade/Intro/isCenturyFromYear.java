public class Demo {

    int centuryFromYear(int year) {
        int lastTwo = year % 100;
        int firstTwo = year / 100;

        if (lastTwo > 0) {
            return firstTwo + 1;
        } else {
            return firstTwo;
        }
    }
}