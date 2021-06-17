package task3;

public class Test {

    public int arr[][] = {{1, 7, 9, 19, 12}, {5, 6, 2, 4, 11}, {3, 5, 3, 11, 3}, {23, 8, 13, 6, 2}, {10, 2, 3, 4, 18}};
    public int height = 5;
    public int weight = 5;

    public int[][] replaceMyArray(int[][] array) {
        int[][] newMas = new int[height][weight];
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < weight; i++) {
                newMas[i][j] = array[j][i];
            }
        }
        return newMas;
    }

    public void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Test test = new Test();
        int[][] newArray = test.replaceMyArray(test.arr);
        test.print(newArray);
    }
}
