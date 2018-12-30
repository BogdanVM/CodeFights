int[][] boxBlur(int[][] image) {
    
    int rows = image.length - 2;
    int cols = image[0].length - 2;
    
    int[][] blurredImg = new int[rows][cols];
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            blurredImg[i][j] = (image[i][j] + image[i][j+1] + image[i][j+2] +
                      image[i+1][j] + image[i+1][j+1] + image[i+1][j+2] +
                      image[i+2][j] + image[i+2][j+1] + image[i+2][j+2]) / 9;
        }
    }
    
    return blurredImg;
}