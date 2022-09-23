package Basic_of_software_code_development;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//  m и n вводятся с клавиатуры.

import java.util.Scanner;
public class Task_03_08 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in);                                                                      //init new scanner
        System.out.print("Введите первое натуральное число: ");
        int Number1 = InputVar.nextInt();                                                                               //input number M
        System.out.print("Введите второе натуральное число: ");
        int Number2 = InputVar.nextInt();                                                                               //input number N
        InputVar.close();

        int i = Number1; // присвоение постоянного значения числа m для повторного цикла, тк по результатам цикла m приобретает новое значение
        int l = Number2; // присвоение постоянного значения числа n для повторного цикла, тк по результатам цикла n приобретает новое значение
        for (int a = 0; a <= 9; a++) {   // проверка наличия цифр в числах
            int b=Number1;
            while (b >= 0 && Number1>=1){  // проверка 1 числа последовательно каждая цира
                b = Number1 % 10;
                if (b == a) { // если проверяемая цифра равна элементу который проверяется, то включаем проверку второго числа
                    int c=Number2;
                    while (c>=0 && Number2>=1){  // проверка 2 числа во время проверки первого
                        c = Number2 % 10;
                        if (b == c) {
                            System.out.println("Цифра - " + a + " входит в оба числа;");
                            break; // выход из цикла 2 числа при совпадении
                        }
                        Number2 = Number2 / 10;  // новое значение n
                    }
                    Number2 = l; // возврат значения n
                    break; // выход из цикла проверки 1 числа при совпадении
                }
                Number1 = Number1 / 10;  // новое значение m
            }
            Number1 = i; // возврат значения m
        }
    }
}
