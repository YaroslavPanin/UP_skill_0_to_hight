package Basic_of_software_code_development;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//  данное значение длительности в часах, минутах и секундах в следующей форме:
//  ННч ММмин SSc.

public class Task_01_05 {
    public static void main(String[] args) {

        System.out.print("Введите натуральное число: ");

        Scanner InputVar = new Scanner(System.in); // init new scanner
        int T = InputVar.nextInt(); //Input T
        int SS = T%60; // calc sec
        int mm = (T-SS)/60; // calc full minutes
        int HH = mm/60; // calc Hours
        int MM = mm-HH*60; // calc minute without hours minutes
        InputVar.close();
        System.out.printf("%d ч %d мин %d с\n",HH, MM, SS); //output data


    }

}
