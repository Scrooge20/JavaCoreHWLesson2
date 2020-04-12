import javax.xml.stream.XMLInputFactory;
import java.lang.reflect.Array;

public class HomeWork {
    public static void main (String [] arg){
        System.out.println("Hi");

        //Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0.
        int[] array1 = {1, 1, 0, 1, 0, 0, 0, 1, 1, 0};
        printIntArray(array1);
        replaceValue(array1);
        printIntArray(array1);

        //Задание 2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

//      Первый вариант решения с ОДНОЙ переменной при объявлении цикла
//        int [] array2 = new int[8];
//        int fill = 0;
//        for (int i = 0; i < Array.getLength(array2); i++) {
//            array2 [i] = fill;
//            fill = fill +3;
//        }
//        printIntArray(array2);

//      Второй вариант решения для записи цикла
        int [] array2 = new int[8];
        int q; // дурацкое решение объявления переменных из-за ошибки в цикле. Разобрался 4-м задании
        int fill;
        for (q = 0, fill = 0; q < Array.getLength(array2); q++, fill = fill + 3) {
            array2 [q] = fill;
        }
        printIntArray(array2);

        //Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    printformatIntArray(array3);//для лучшей визуализации результатов применяем форматированный вывод
        for (int j = 0; j < Array.getLength(array3); j++) {
            if (array3[j] < 6){
                array3[j] = array3[j] * 2;
            }
        }
    printformatIntArray(array3);

    //Задание 4/7. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    System.out.println("Задание 4.");
    int[][] array4 = new int[5][5];
    fill2Array(array4);// заполняем массив
    printformat2Array(array4);
    replaceDiagonal(array4);
    printformat2Array(array4);

    // Задание 5/7. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)
    System.out.println("Задание 5.");
    int[] array5 = {3, 5, 9, 2, 11, 6, 7, 8, 3, 4};
    printformatIntArray(array5);
    minmax(array5);

    // Задание 6/7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны
    // Примеры
    // checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    System.out.println("");
    System.out.println("Задание 6.");
    int[] array6 = {3, 5, 9, 2, 11, 6, 7, 5, 3, 4};
    printformatIntArray(array6);
    findBorder(array6);// можно "доводить" этот метод, остановился так как основное задание выполняет

    // Задание 7/7. Написать метод, которому на вход подается одномерный массив
    // и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        System.out.println("");
        System.out.println("Задание 7.");
        int[] array7 = {00, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        printformatIntArray(array7);

        int n7 = Array.getLength(array7);
        System.out.println("Dimention Array = " + n7);

        int d7 = 2; // на сколько будем смещать массив
        for (int i = 0; i < d7 ; i++) { // данный цикл используем для смещения элементов массива. Один проход - одно смещение
            int lostvalue = array7[0]; // запоминаем ПЕРВЫЙ элемент, так как смещаем влево
            for (int j = 0; j < Array.getLength(array7) - 1 ; j++) { // данный цикл для прохода по элементам массива
                int shiftvalue = j + 1;
                array7[j] = array7[j + 1]; //смещение влево
                //System.out.println(j);
                //смещение работает, но нужно разобраться с теми элементами что выпадают
                // используем общепринятую практику - для последнего элемента который может выпасть создадим переменную
                // и в эту переменную запишем "выпадающий элемент" вначале цикла и потом присвоим свободной ячейке
            }
            array7[array7.length - 1] = lostvalue;
        }
        printformatIntArray(array7);
        // YAHOOO !!! Работает.


    }//THE END ===================================================================

    //Метод для вывода в консоль одномерного массива
    public static void printIntArray (int inArray[]){
        for (int j = 0; j < Array.getLength(inArray); j++) {
            System.out.print(inArray[j]+" ");
        }
        System.out.println("");
    }

    //Метод для форматированного вывода в консоль одномерного массива
    public static void printformatIntArray (int inArray[]){
        for (int j = 0; j < Array.getLength(inArray); j++) {
            System.out.printf ("%1$4d", inArray[j]);
        }
        System.out.println("");
    }
    
    //Метод для форматированного вывода двумерного массива
    public static void printformat2Array(int inArray [][]){
        for (int i = 0; i < inArray.length; i++) {
            for (int j = 0; j < inArray[i].length; j++) {
                System.out.print(inArray[i][j]);
            }
            System.out.println();
        }
    }

    //Метод для заполнения данными двумерного массива
    public static void fill2Array(int inArray [][]){
        int fill = 8;
        for (int i = 0; i < inArray.length; i++) {
            for (int j = 0; j < inArray[i].length; j++) {
                inArray[i][j] = fill;
            }
        }
    }

    //Метод для замены значений массива : 0 -> 1, 1 -> 0
    public static void replaceValue (int [] inArray){
        for (int i = 0; i < Array.getLength(inArray) ; i++) {
            switch (inArray[i]){
                case 1:
                    inArray[i] = 0;
                    break;
                case 0:
                    inArray[i] = 1;
                    break;
            }
        }
    }

    //Задание 4. метод для замены значений по диагонали
    public static void replaceDiagonal (int inArray4 [][]){
    // В цикле ниже возникала ошибка "java: not a statement" - при объявлении переменных.
    // Просто тип переменной указываем ОДИН раз, вначале
        for (int i = 0, j = 0, x = Array.getLength(inArray4) - 1; i < Array.getLength(inArray4); i++, j++, x = x - 1) {
                inArray4[i][j] = 1;
                inArray4[i][x] = 1;
        }
    }

    // Задание 5/7
    public static void minmax (int [] inArray5) {
        int max = inArray5[0];
        int min = inArray5[0];
        for (int j = 0; j < inArray5.length; j++) {
            if (inArray5[j] > max) {
                max = inArray5[j];// тут всё Ок!
            }
        }
        for (int j = 0; j < inArray5.length; j++) {
            if (inArray5[j] < min) {
                min = inArray5[j];// тут всё Ок!
            }
        }
        System.out.printf("max : %1$4d min : %2$4d", max, min);
    }

    // Задание 6/7. Нахождение границы.
    public static void findBorder(int [] inArray){
        int r = 0;
        int lborder = 0;
        int rborder = 0;
        int n = Array.getLength(inArray) - 1; // Афигеть ! Для указания последнего элемента массива НУЖНО отнять 1 - иначе переполнение ИНДЕКСА
        lborder = lborder + inArray[r];
        rborder = rborder + inArray[n];

        while (r < n){
//        lborder = lborder + array6[r];
//        rborder = rborder + array6[n];
            System.out.println("LB = " + lborder + " RB = " + rborder);
            //r = r + 1;
            //n = n - 1;
            if (lborder == rborder){
                System.out.println("Border here ");
                break; // если выбросить данный оператор, метод будет искать "границу" до конца массива
            }
            if (lborder < rborder){
                r = r + 1;
                lborder = lborder + inArray[r];
            }
            if (rborder < lborder){
                n = n - 1;
                rborder = rborder + inArray[n];
            }

        }
        System.out.println("Рассчёт окончен.");
    }
}
