package Basic_of_software_code_development;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

public class Task_03_01 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in);                                                                      // init new scanner
        System.out.print("Введите любое целое положительное число: ");
        int NumberToSumUp = InputVar.nextInt();                                                                         //input Number
        InputVar.close();
        long result = 0;

        if (NumberToSumUp>0){
            for (int i =0 ; i<=NumberToSumUp; i++) {                                                                    // cycle for sum i++
                result += i;                                                                                            // count 0 to NumberToSumUp
            }
            System.out.printf("Сумма чисел от 1 до %d составляет: %d \n", NumberToSumUp, result);                       // output information
        }
        else {
            System.out.print("Число отрицательное");                                                                    // output txt msg if error
        }
    }
}
