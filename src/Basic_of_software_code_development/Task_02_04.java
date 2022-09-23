package Basic_of_software_code_development;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.

public class Task_02_04 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in); // init new scanner
        System.out.print("Введите значение A: ");
        float A = InputVar.nextFloat(); //input A
        System.out.print("Введите значение B: ");
        float B = InputVar.nextFloat(); //input B
        System.out.print("Введите значение x: ");
        float x = InputVar.nextFloat(); //input x
        System.out.print("Введите значение y: ");
        float y = InputVar.nextFloat(); //input y
        System.out.print("Введите значение z: ");
        float z = InputVar.nextFloat(); //input z
        InputVar.close();
        if (A > x & B > y | A > x & B > z | A > y & B > x | A > y & B > z | A > z & B > x | A > z & B > y) {  //check all type brick to hole
            System.out.print("Кирпич пройдет в отверстие");
        }
        else {
            System.out.print("Кирпич не пройдет в отверстие");
        }
    }
}
