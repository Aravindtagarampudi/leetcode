class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int col = 0;
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            boolean lucky = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][col] > min) {
                    lucky = false;
                    break;
                }
            }
            if (lucky) {
                list.add(min);
            }
        }
        return list;
    }
}