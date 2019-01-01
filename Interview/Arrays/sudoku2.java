boolean sudoku2(char[][] grid) {
    
    HashSet<Character>[] colsApps = new HashSet[9];
    for (int i = 0; i < 9; ++i) {
        colsApps[i] = new HashSet<>();
    }
    
    /* Solve rows and cols */
    for (int i = 0; i < 9; ++i) {
        
        Set<Character> rowApps = new HashSet<>();
        for (int j = 0; j < 9; ++j) {
            if (grid[i][j] != '.') {
                if (rowApps.contains(grid[i][j])) {
                    return false;
                } else {
                    rowApps.add(grid[i][j]);
                }
                
                if (colsApps[j].contains(grid[i][j])) {
                    return false;
                } else {
                    colsApps[j].add(grid[i][j]);
                }
            }
        }
    }
    
    for (int j = 0; j < 9; j += 3) {
        HashSet<Character> square = new HashSet<>();
        
        for (int i = 0; i < 9; ++i) {
            if (i % 3 == 0) {
                square = new HashSet<>();
            }
            
            char c = grid[i][j];
            if (c != '.') {
                if (square.contains(c)) {
                    return false;
                } else {
                    square.add(c);
                }
            }
            
            c = grid[i][j + 1];
            if (c != '.') {
                if (square.contains(c)) {
                    return false;
                } else {
                    square.add(c);
                }
            }
            
            c = grid[i][j + 2];
            if (c != '.') {
                if (square.contains(c)) {
                    return false;
                } else {
                    square.add(c);
                }
            }
        }
    }
    
    return true;
}