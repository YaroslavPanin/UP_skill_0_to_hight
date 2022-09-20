package Task_01;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//он прямоугольным.

public class Task_02_01 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in); // init new scanner
        System.out.print("Введите первый угол в градусах: ");
        float Corner1 = InputVar.nextFloat(); //input 1 corner
        System.out.print("Введите второй угол в градусах: ");
        float Corner2 = InputVar.nextFloat(); //input 2 corner
        InputVar.close();

        if (Corner1+Corner2 >=180 || Corner1<=0 || Corner2<=0) {   // check right input data
            System.out.print("Данного треугольника не может быть построено");
        }
        else {
            if (Corner1== 90 || Corner2==90 || 180-Corner1-Corner2==90) {      //check right 90 corner
                System.out.print("Данный треугольника может быть построен, он прямоугольный!");
            }
            else {
                System.out.print("Данный треугольника может быть построен, но он не прямоугольный!");
            }
        }
    }
}
