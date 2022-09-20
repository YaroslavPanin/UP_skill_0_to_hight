package Task_01;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  3. Найти сумму квадратов первых ста чисел.

public class Task_03_03 {
    public static void main(String[] args) {
        System.out.print("Сумма квадратов первых ста чисел равна: ");

        int i = 1;                                                                                                      //init count i
        int result=0;                                                                                                   //init result
        for (; i<=100; i++) {                                                                                           //cycle to sum pow 0-100
            result += Math.pow(i, 2);
        }
        System.out.print(result);                                                                                       //output result function
    }
}
