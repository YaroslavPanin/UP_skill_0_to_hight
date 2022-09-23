package Basic_of_software_code_development;
import java.util.Scanner;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  2. Найти max{min(a, b), min(c, d)}.

public class Task_02_02 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in); // init new scanner
        System.out.print("Введите значение а: ");
        float a = InputVar.nextFloat(); //input a
        System.out.print("Введите значение b: ");
        float b = InputVar.nextFloat(); //input b
        System.out.print("Введите значение c: ");
        float c = InputVar.nextFloat(); //input c
        System.out.print("Введите значение d: ");
        float d = InputVar.nextFloat(); //input d
        InputVar.close();
        float min1 = a; //init min from pair 1
                if (b<a) { //determining the min in 1 pair
            min1=b;
        }
        float min2 = c; //init min from pair 2
                if (d<c) {   //determining the min in 2 pair
                    min2 = d;
        }
        float max = min1; //init max from two pair min1
        if (min2>min1) {   //determining the max in 2 pair min
            max = min2;
        }
        System.out.print("Максимальное значение между min(a, b), min(c, d): "); //output data
        System.out.print(max);
    }
}
