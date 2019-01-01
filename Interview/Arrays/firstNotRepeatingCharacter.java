char firstNotRepeatingCharacter(String s) {
    
    for (int i = 0; i < s.length(); ++i) {
        
        if (s.lastIndexOf(s.charAt(i)) == s.indexOf(s.charAt(i))) 
            return s.charAt(i);
    }
    
    return '_';
}