package exercise01;

public class Exercise1_08 {
    public static void main(String[] args) {
        float radius = 6.5f;
        double perimeter = 2 * radius * Math.PI;
        double area = Math.pow(radius, 2) * Math.PI;
        System.out.println(perimeter);//40.840704496667314
        System.out.println(area);//132.73228961416876
    }
}
