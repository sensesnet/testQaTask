package task5;

public class Test {

    public String divideToChipAndDale(Integer num) {
        StringBuilder resultString = new StringBuilder();
        resultString.append("| ").append(num);
        if (num % 3 == 0) resultString.append(" Chip");
        if (num % 7 == 0) resultString.append(" Dale");
        return resultString.toString();
    }

    public static void main(String[] args) {
        Test test = new Test();
        StringBuilder resultString = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            resultString.append(test.divideToChipAndDale(i));
        }
        System.out.println(resultString.toString());
    }
}
