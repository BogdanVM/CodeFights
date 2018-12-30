int leastFactorial(int n) {
    int fact = 1;
    int currentFact = 1;
    
    while (fact < n) {
        fact *= ++currentFact;
    }
    
    return fact;
}