int firstDuplicate(int[] a) {
    
    Hashtable<Integer, Integer> appearances = new Hashtable<>();
    appearances.put(a[0], 1);
    
    for (int i = 1; i < a.length; ++i) {
        
        if (appearances.containsKey(a[i])) {
            return a[i];
        } 
        
        else {
          appearances.put(a[i], 1);  
        }
    }
    
    return -1;
}