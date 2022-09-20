package Task_01;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//  принадлежит закрашенной области, и false — в противном случае:

public class Task_01_06 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in); // init new scanner
        System.out.print("Введите координату Х:");
        double CoordinatX = InputVar.nextDouble(); //input X coordinat
        System.out.print("Введите координату Y:");
        double CoordinatY = InputVar.nextDouble(); //input Y coordinat
        InputVar.close();

        if (CoordinatY>0) {
        Boolean Coordinat = Math.abs(CoordinatX) <= 2 && CoordinatY <=4;  // calc up zone
        System.out.println(Coordinat);
        }
        else {
            if (CoordinatY<=0) {
            Boolean Coordinat = Math.abs(CoordinatX) <= 4 && CoordinatY >=-3;   //calc down zone
            System.out.println(Coordinat);
            }
        }
    }
}
