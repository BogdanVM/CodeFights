public class Demo {

    boolean isLucky(int n) {
        
        int digitNumber = 0;
        int aux = n;

        while (aux != 0) {
            digitNumber++;
            aux /= 10;
        }

        int half = digitNumber / 2;
        int i = 0;
        int sumLowerHalf = 0;
        int sumUpperHalf = 0;

        while (n != 0) {
            if (i < half) {
                sumLowerHalf += n % 10;
            } else {
                sumUpperHalf += n % 10;
            }

            i++;
            n /= 10;
        }

        return (sumLowerHalf == sumUpperHalf);
    }
}