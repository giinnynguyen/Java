package exercise01;

import java.math.BigDecimal;
import java.math.MathContext;

public class Exercise1_05 {
    public static void main(String[] args) {
        float with8DigitPrecision = (float) ((7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5));
        System.out.println("8 digit precision: "+ with8DigitPrecision);
        double with16DigitPrecision = (7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5);
        System.out.println("16 digit precision: "+with16DigitPrecision);

        BigDecimal firstMul = BigDecimal.valueOf(7.5).multiply(BigDecimal.valueOf(6.5));
        BigDecimal secondMul = BigDecimal.valueOf(4.5).multiply(BigDecimal.valueOf(3));
        BigDecimal numerator = firstMul.subtract(secondMul);
        BigDecimal denominator = BigDecimal.valueOf(47.5).subtract(BigDecimal.valueOf(5.5));
        BigDecimal fullPrecision = numerator.divide(denominator, MathContext.DECIMAL128);
        System.out.println("128bit precision: "+fullPrecision);
    }
}
