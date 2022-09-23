package Basic_of_software_code_development;
import java.util.Scanner;
public class Task_01_01 { /*
Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
*/
    public static void main(String[] args) {
        System.out.println("линейная программа найти значение функции z = ( (a – 3 ) * b / 2) + c"); //Вывод сообщения о значении выражения которого собираемся находить
        Scanner VvodPeremennix = new Scanner(System.in); //присвоение сканеру ввода переменных именни
        System.out.print("Ввод a:");//Вывод сообщения о вводе значения а
        double a = VvodPeremennix.nextDouble(); //Присвоение переменной. Ввод значения а
        System.out.print("Ввод b:");//Вывод сообщения о вводе значения b
        double b = VvodPeremennix.nextDouble(); //Присвоение переменной. Ввод значения b
        System.out.print("Ввод c:");//Вывод сообщения о вводе значения c
        double c = VvodPeremennix.nextDouble(); //Присвоение переменной. Ввод значения c
        System.out.print("Значение функции = "); //Вывод сообщения о результате
        double z = (a-3)*b/2+c; //Присвоение переменной. Расчет значения функции
        System.out.println(z); //Вывод значения функции
    }
}
