package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//  которых число 5 встречается три и более раз.


public class Task_02_11 {
    public static void main(String[] args) {
        int[][] X = new int[10][20];
        System.out.println("Ввывод массива");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                // X[i][j] = v.nextInt(); // Ввод заданных чисел
                X[i][j] = (int) (Math.random() * 16);                                                     // random array
                System.out.print(X[i][j] + "\t"); //Вывод массива сгенерированных чисел
            }
            System.out.println();
        }
        System.out.print("Номера строк, в которых число 5 встречается три и более раз: ");
        for (int i = 0; i < X.length; i++) {                                                                            // check line
            int Count5 = 0;                                                                                             // calc elem=5
            for (int j = 0; j < X[i].length; j++) {                                                                     // check all elemens in line
                if (X[i][j] == 5) {                                                                                     // if element in line = 5, ++
                    Count5++;
                }
            }
            if (Count5 >= 3) {                                                                                          // if Elements in line =5 output number of line
                System.out.print(i+1 + "; ");
            }
        }
    }
}