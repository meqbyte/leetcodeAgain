package org.example;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length - 1;
        int columns = 0;

        while (rows >= 0 && columns < matrix[0].length) {
            if (matrix[rows][columns] > target) {
                rows--;
            } else if (matrix[rows][columns] < target) {
                columns++;
            } else {
                return true;
            }
        }

        return false;

    }
}
