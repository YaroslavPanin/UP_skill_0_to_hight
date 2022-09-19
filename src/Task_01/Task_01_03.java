package Task_01;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Task_01_03 {
    public static void main(String[] args) {

        System.out.println("линейная программа найти значение функции (sin(x)+cos(y))/(cos(x)-sin(y))*tg(xy)");

        Scanner VvodPeremennix = new Scanner(System.in); //присвоение сканеру ввода переменных именни
        System.out.print("Ввод x:"); //Вывод сообщения о вводе переменной x
        double x = VvodPeremennix.nextDouble(); //Ввод переменной x
        System.out.print("Ввод y:");//Вывод сообщения о вводе переменной y
        double y = VvodPeremennix.nextDouble();//Ввод переменной y
        System.out.print("Значение функции = ");//Вывод сообщения о результате
        double Result = (Math.sin(Math.toRadians(x))+Math.cos(Math.toRadians(y)))/(Math.cos(Math.toRadians(x))-Math.sin(Math.toRadians(y)))* (Math.tan(Math.toRadians(x*y))); //Расчет значения функции
        System.out.println(Result);//Вывод значения функции
    }
}

