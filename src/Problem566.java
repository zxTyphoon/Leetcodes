public class Problem566 {
    public static void main(String[] args) {
        System.out.println("Mat 1");
        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] result1 = matrixReshape(mat1, 1, 4); //Expected Output: [[1,2,3,4]]
        for (int i = 0; i < result1.length; i++) {
            for (int j = 0; j < result1[0].length; j++) {
                System.out.print(result1[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.println("Mat 2");
        int[][] mat2 = {{1, 2}, {3, 4}};
        int[][] result2 = matrixReshape(mat2, 2, 4); //Expected Output: [[1,2],[3,4]]
        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[0].length; j++) {
                System.out.print(result2[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.println("Mat 3");
        int[][] mat3 = {{1, 2, 3, 4}};
        int[][] result3 = matrixReshape(mat3, 2, 2);
        for (int i = 0; i < result3.length; i++) {
            for (int j = 0; j < result3[0].length; j++) {
                System.out.print(result3[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.println("Mat 4");
        int[][] mat4 = {{1, 2}};
        int[][] result4 = matrixReshape(mat4, 1, 1);
        for (int i = 0; i < result4.length; i++) {
            for (int j = 0; j < result4[0].length; j++) {
                System.out.print(result4[i][j] + " ");
            }
            System.out.print('\n');
        }


    }


    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat == null || mat.length == 0 || mat[0].length == 0)
            return mat;
        int[][] res = new int[r][c];
        int x = 0, y = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (y % c == 0 && y > 0) {
                    if (x == r - 1)
                        return mat;
                    x++;
                    y = 0;
                }
                res[x][y] = mat[i][j];
                y++;

            }
        }
        if (x != r - 1 || y != c)
            return mat;
        return res;
    }

}
