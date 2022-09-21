package Task_01;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

import java.util.Scanner;
public class Task_03_06 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in);                                                                      //init new scanner
        System.out.print("Введите по какой символ таблицы ASCII выводить символы: ");
        int Number = InputVar.nextInt();                                                                                //input number max symbol of tab
        InputVar.close();
        for (int i = 1; i <= Number; i++) {                                                                             //output number and symbol
            System.out.println(i + " " + (char) i);
        }
    }
}
