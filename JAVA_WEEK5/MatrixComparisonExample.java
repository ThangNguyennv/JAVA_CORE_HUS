public class MatrixComparisonExample {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 1, 4},
            {5, 6, 5, 8},
            {9, 10, 9, 12}
        };

        boolean hasDuplicateColumns = false;
        int columns = matrix[0].length;
        int rows = matrix.length;

        // Duyệt qua tất cả các cặp cột
        for (int i = 0; i < columns - 1; i++) {
            for (int j = i + 1; j < columns; j++) {
                // So sánh hai cột
                boolean areColumnsEqual = true;
                for (int k = 0; k < rows; k++) {
                    if (matrix[k][i] != matrix[k][j]) {
                        areColumnsEqual = false;
                        break;
                    }
                }

                // Nếu tìm thấy hai cột giống nhau, đặt hasDuplicateColumns thành true và dừng vòng lặp
                if (areColumnsEqual) {
                    hasDuplicateColumns = true;
                    break;
                }
            }
            if (hasDuplicateColumns) {
                break;
            }
        }

        if (hasDuplicateColumns) {
            System.out.println("Tồn tại hai cột giống nhau trong ma trận.");
        } else {
            System.out.println("Không tồn tại hai cột giống nhau trong ma trận.");
        }
    }
}