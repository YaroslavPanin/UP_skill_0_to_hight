package Task_01;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Task_01_02 {
    public static void main(String[] args) {

        System.out.println("линейная программа найти значение функции z =(b+Math.sqrt(b^2+4*a*c))/(2*a)-(a^3)*c+(b^(-2)");

        Scanner VvodPeremennix = new Scanner(System.in); //присвоение сканеру ввода переменных именни
        System.out.print("Ввод a:"); //Вывод сообщения о вводе переменной а
        double a = VvodPeremennix.nextDouble(); //Присвоение переменной. Ввод переменной а
        System.out.print("Ввод b:");//Вывод сообщения о вводе переменной b
        double b = VvodPeremennix.nextDouble();//Присвоение переменной. Ввод переменной b
        System.out.print("Ввод c:");//Вывод сообщения о вводе переменной c
        double c = VvodPeremennix.nextDouble();//Присвоение переменной. Ввод переменной c
        System.out.print("Значение функции = ");//Вывод сообщения о результате
        double z = ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - (a * a * a) * c + (1 / (b * b))); //Расчет значения функции
        System.out.println(z);//Вывод значения функции
    }

}
