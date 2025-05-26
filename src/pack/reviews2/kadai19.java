package pack.reviews2;

public class kadai19 {
    public static void main(String[] args) {
        int num = 10;
        int factorial = 1;
        int i = 2;
        while (i < num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("結果: " + factorial);
    }
}
