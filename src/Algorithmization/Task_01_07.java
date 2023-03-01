package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  7. Даны действительные числа a1 a2 .... an Найти
//   max  (a1+a2n , a2+a2n-1, an+an+1)


import java.util.Scanner;

public class Task_01_07 {

    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in);                                                                      //Init scanner
        System.out.print("Введите значение n: ");                                                                       //Message count massive
        short N = InputVar.nextShort();
        System.out.print("Введите нижнюю границу отбора случайных чисел: ");
        int MinRandomNumber = InputVar.nextInt();                                                                       //input MinRandomNumber
        System.out.print("Введите верхнюю границу отбора случайных чисел: ");
        int MaxRandomNumber = InputVar.nextInt();                                                                       //input MaxRandomNumber
        InputVar.close();

        System.out.println("Сформированный массив: ");
        int[] ArrayX = new int[2*N];                                                                                    // init new Array
        for (int i=0; i<ArrayX.length; i++) {
            ArrayX[i] = (int) (Math.random()*(MaxRandomNumber-MinRandomNumber+1)+MinRandomNumber);                      // random array
            System.out.printf("%d ",ArrayX[i]);
        }

        int max = ArrayX[0]+ArrayX[2*N-1];                                                                              // init max

        for (int i=0; i<N; i++) {                                                                                       // cycle for check all pare to sum
            int Sum = ArrayX[i]+ArrayX[(2*N-1)-i];
            if (max<Sum) {
                max=Sum;
            }
        }
        System.out.printf("Максимальная сумма равна: %d ",max);
    }
}
