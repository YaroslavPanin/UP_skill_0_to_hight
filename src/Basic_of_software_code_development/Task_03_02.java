package Basic_of_software_code_development;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task_03_02 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in);                                                                      //init new scanner
        System.out.print("Введите начало отрезка на котором вычисляется функция: ");
        float BeginSegment = InputVar.nextFloat();                                                                      //input beginning of the segment
        System.out.print("Введите конец отрезка на котором вычисляется функция: ");
        float EndSegment = InputVar.nextFloat();                                                                        //input ending of the segment
        System.out.print("Введите размер шага h: ");
        float Step = InputVar.nextFloat();                                                                              //input step function
        InputVar.close();

        float i = BeginSegment;                                                                                         //init i fot cycle
        float ResultFunct;                                                                                              //init result function
        for (; i<=EndSegment; i+=Step) {                                                                                //cycle begin segment to end segment with step
            if (i>2) {                                                                                                  //first condition function
                ResultFunct= i;
            }
            else {                                                                                                      //second condition function
                ResultFunct= i*(-1);
            }
            System.out.printf("При значении: %.4f значение функции составляет: %.4f \n", i, ResultFunct);               //output result function
        }
    }
}
