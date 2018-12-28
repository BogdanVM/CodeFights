public class Demo {

    int[] sortByHeight(int[] a) {

        List<Integer> aux = new ArrayList<>();
        for (int i = 0; i < a.length; ++i) {
            if (a[i] != -1) {
                aux.add(a[i]);
            }
        }
        Collections.sort(aux);

        int[] sortedArray = new int[a.length];
        ListIterator<Integer> iterator = aux.listIterator();
        for (int i = 0; i < a.length; ++i) {
            if (a[i] == -1) {
                sortedArray[i] = -1;
                continue;
            }

            sortedArray[i] = iterator.next();
        }

        return sortedArray;
    }
}