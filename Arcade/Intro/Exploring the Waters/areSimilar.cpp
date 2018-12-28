bool areSimilar(std::vector<int> a, std::vector<int> b) {
    
    int numSwaps = 0;
    std::set<int> sa;
    std::set<int> sb;
    
    for (int i = 0; i < a.size(); ++i) {
        if (a[i] != b[i]) {
            numSwaps++;
            sa.insert(a[i]);
            sb.insert(b[i]);
        }
    }
    
    if (numSwaps == 0)
        return true;
    if (numSwaps == 2 && sa == sb)
        return true;
    
    return false;
}