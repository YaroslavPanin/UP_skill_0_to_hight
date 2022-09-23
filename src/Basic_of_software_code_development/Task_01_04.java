package Basic_of_software_code_development;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.:

public class Task_01_04 {
    public static void main(String[] args) {

        System.out.println("");

        Scanner VvodPeremennix = new Scanner(System.in); //присвоение сканеру ввода переменных именни
        System.out.print("Ввод значения числа R (Число R должно быть в формате nnn.ddd):"); //Вывод сообщения о вводе переменной R
        double ChisloR = VvodPeremennix.nextDouble(); //Ввод переменной R
        Double ChisloNNN = ChisloR*1000%1000; // нахождения нового числа после запятой
        double ChisloDDD = ChisloR/1000-ChisloNNN/1000000; //нахождение нового числа до запятой
        double Result = ChisloNNN+ChisloDDD; //Расчет значения выражения
        System.out.print("Ввывод итогового числа (ddd.nnn):");
        System.out.println(Result);//Вывод значения выражения
    }
}
