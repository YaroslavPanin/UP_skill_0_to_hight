package Basic_of_software_code_development;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  5. Вычислить значение функции:

public class Task_02_05 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in);                                                                      // init new scanner
        System.out.print("Введите значение x: ");
        float x = InputVar.nextFloat();                                                                                 //input x
        InputVar.close();
        float result;                                                                                                   // init result funct
        if (x<=3){                                                                                                      // the 1 condition
            result = (float) (Math.pow(x,2)-3*x+9);
        }
        else {                                                                                                          // other condition
            result = (float) (1/(Math.pow(x,3)+6));
        }
        System.out.printf("Значение функции: %.8f \n", result);                                                         // output result function
    }
}
