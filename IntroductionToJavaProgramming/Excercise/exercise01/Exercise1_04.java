package exercise01;

public class Exercise1_04 {
    public static void main(String[] args) {
        String[] headers = {"a", "a^2", "a^3", "a ^ 4"};
        for (String s : headers) {
            System.out.printf("%-7s", s);
        }
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            System.out.printf("%-7d%-7d%-7d%-7d%n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3), (int)Math.pow(i, 4));
        }
    }
}
