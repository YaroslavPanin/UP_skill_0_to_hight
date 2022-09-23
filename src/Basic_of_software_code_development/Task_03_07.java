package Basic_of_software_code_development;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//  m и n вводятся с клавиатуры.

import java.util.Scanner;
public class Task_03_07 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in);                                                                      //init new scanner
        System.out.print("Введите натуральное число m: ");
        int NumberM = InputVar.nextInt();                                                                               //input number M
        System.out.print("Введите натуральное число n: ");
        int NumberN = InputVar.nextInt();                                                                               //input number N
        InputVar.close();

        if (NumberM<=NumberN){
            int CountRow = NumberM;                                                                                     //int min number of Row
            for (; CountRow<=NumberN; CountRow++) {                                                                     // cycle check all row number
                System.out.printf("Для числа %d делители: ", CountRow);
                for (int Div=2; Div<CountRow; Div++){                                                                   // cycle check all div except 1 and number
                    int RenOfDiv = CountRow % Div;
                    if (RenOfDiv == 0) {                                                                                // output div
                        System.out.printf(" %d; ", Div);
                    }
                }
                System.out.print("\n");
            }
        }
        if (NumberM>NumberN){
            int CountRow = NumberN;                                                                                     //int min number of Row
            for (; CountRow<=NumberM; CountRow++) {                                                                     // cycle check all row number
                System.out.printf("Для числа %d делители: ", CountRow);
                for (int Div=2; Div<CountRow; Div++){                                                                   // cycle check all div except 1 and number
                    int RenOfDiv = CountRow % Div;
                    if (RenOfDiv == 0) {                                                                                // output div
                        System.out.printf(" %d; ", Div);
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
