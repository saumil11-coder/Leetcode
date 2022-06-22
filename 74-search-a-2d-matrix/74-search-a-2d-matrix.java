class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int selectRow = binarySearchSelectRow(matrix, target);
        if (selectRow == -1) return false;
        boolean numberFoundOrNot = numberPresentOrNot(matrix, selectRow, target);
        return numberFoundOrNot;
    }

    public static int binarySearchSelectRow(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length - 1;
        int lastColumn = matrix[0].length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (matrix[mid][0] <= target && target <= matrix[mid][lastColumn]) {
                return mid;
            } else if (matrix[mid][0] < target) low = mid + 1; else if (matrix[mid][0] > target) high = mid - 1;
        }
        return -1;
    }

    public static boolean numberPresentOrNot(int[][] matrix, int selectRow, int target) {
        int low = 0;
        int high = matrix[0].length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (matrix[selectRow][mid] == target) return true; else if (matrix[selectRow][mid] < target) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return false;
    }
}
