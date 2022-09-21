package Task_01;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  4. Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Task_03_04 {
    public static void main(String[] args) {
        System.out.print("Произведение квадратов первых двухста чисел равна: ");

        short i = 1;                                                                                                    //init count i
        BigInteger result = BigInteger.valueOf(1);                                                                      //init result as bigint value
        for (; i<=200; i++) {                                                                                           //calc to * pow 0-200
            result = result.multiply(BigInteger.valueOf((long)i*i));
        }
        System.out.print(result);                                                                                       //output result
    }
}
