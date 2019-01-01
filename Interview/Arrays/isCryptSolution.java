boolean isCryptSolution(String[] crypt, char[][] solution) {
    
    /* We store the letters from solution in a map for easier accessibility later */
    HashMap<Character, Integer> cryptedLetters = new HashMap<>();
    for (int i = 0; i < solution.length; ++i) {
        cryptedLetters.put(solution[i][0], Character.getNumericValue(solution[i][1]));
    }
    
    /* Now foreach string, we form another string containing its crypted variant */
    long[] numbers = new long[3];
    int currNo = 0;
    for (String s : crypt) {
        
        String crypted = "";
        for (int i = 0; i < s.length(); ++i) {
            Integer value = cryptedLetters.get(s.charAt(i));
            crypted += value.toString();
        }
        
        if (crypted.charAt(0) == '0' && crypted.length() > 1) {
            return false;
        }
        numbers[currNo++] = Long.parseLong(crypted);
    }
    
    /* Now we simply check if the equation is true */
    return numbers[0] + numbers[1] == numbers[2];
}