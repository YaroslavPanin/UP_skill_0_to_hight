package Basic_of_software_code_development;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task_02_03 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in); // init new scanner
        System.out.print("Введите значение x1: ");
        float x1 = InputVar.nextFloat(); //input x1
        System.out.print("Введите значение y1: ");
        float y1 = InputVar.nextFloat(); //input y1
        System.out.print("Введите значение x2: ");
        float x2 = InputVar.nextFloat(); //input x2
        System.out.print("Введите значение y2: ");
        float y2 = InputVar.nextFloat(); //input y2
        System.out.print("Введите значение x3: ");
        float x3 = InputVar.nextFloat(); //input x3
        System.out.print("Введите значение y3: ");
        float y3 = InputVar.nextFloat(); //input y3
        InputVar.close();

        if ( ((x1+x2)/(y1+y2)) == ((x1+x3)/(y1+y3)) ) {  //check proportion 1-2 line to 1-3 line
            System.out.printf("Три точки А(%.2f; %.2f), В(%.2f; %.2f) и С(%.2f; %.2f) лежат на 1 прямой", x1, y1, x2, y2, x3, y3); //output data
        }
        else {
            System.out.printf("Три точки А(%.2f; %.2f), В(%.2f; %.2f) и С(%.2f; %.2f) не лежат на 1 прямой", x1, y1, x2, y2, x3, y3); //output data
        }
    }
}
