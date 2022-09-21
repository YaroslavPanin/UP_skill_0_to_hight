package Task_01;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//  заданному е. Общий член ряда имеет вид:

import java.util.Scanner;
public class Task_03_05 {
    public static void main(String[] args) {
        Scanner InputVar = new Scanner(System.in);                                                                      //init new scanner
        System.out.print("Введите количество членов ряда n: ");
        byte NumberOfRow = InputVar.nextByte();                                                                         //input number of row
        System.out.print("Введите число е: ");
        double NumberE = InputVar.nextDouble();                                                                         //input number e
        InputVar.close();

        byte RowNumber = 1;                                                                                              //init row member
        double Res=0;
        for (; RowNumber <= NumberOfRow; RowNumber++) {                                                                 //do row
            double a = 1 / (Math.pow(2, RowNumber)) + 1 / (Math.pow(3, RowNumber));
            System.out.printf("Член ряда № %d равен %.6f \n", RowNumber, a);
            if (Math.abs(a) >= NumberE) {                                                                               //check abs and sum
                Res +=a;
            }
        }
        System.out.printf("Сумма тех членов ряда, модуль которых больше или равен заданному числу %.6f. составляет %.6f \n", NumberE, Res); //output result
    }
}
