package exercise01;

public class Exercise1_06 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 2; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);//expect 55
    }
}
