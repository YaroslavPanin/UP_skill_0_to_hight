import java.util.Scanner;
public class Task_01_01 { /*
Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
*/
    public static void main(String[] args) {
        System.out.println("линейная программа найти значение функции z = ( (a – 3 ) * b / 2) + c");

        Scanner in = new Scanner(System.in);
        System.out.print("Ввод a:");
        double a = in.nextDouble();
        System.out.print("Ввод b:");
        double b = in.nextDouble();
        System.out.print("Ввод c:");
        double c = in.nextDouble();
        System.out.print("Значение функции = ");
        double z = (a-3)*b/2+c;
        System.out.println(z);


    }
}
