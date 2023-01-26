//import static sun.jvm.hotspot.gc.cms.AdaptiveFreeList.sizeOf;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        //«Сумма трат за месяц составила … рублей».
        System.out.println("Задача 1");
        int sum = 0;
        for (int element:arr) {sum+=element;}
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
        System.out.println();

        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        //«Минимальная сумма трат за день составила … рублей.
        //Максимальная сумма трат за день составила … рублей».
        System.out.println("Задача 2");
        int min = 1000000000;
        int max = 0;
        for (int element:arr) {
            if (element < min) {min = element;}
            if (element > max) {max = element;}
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей");
        System.out.println("Максимальная сумма трат за день составила "+max+" рублей");
        System.out.println();

        //Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней), и
        //выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        //Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
        //Сумма посчитана в задаче 1
        System.out.println("Задача 3");
        double avg = (double)sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+avg+" рублей");
        System.out.println();

        //В результате в консоль должно быть выведено: Ivanov Ivan.
        //не используйте дополнительные массивы для решения этой задачи.
        //без индекса здесь уже не обойтись
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char ch;  //буфер для обмена элементов
        for (int i = 0; i < reverseFullName.length/2; i++) { //если длина - нечетная, то индекс середины нам не нужен
            ch = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length-1-i] = ch;
        }
        for (char c:reverseFullName) {System.out.print(c);}
        System.out.println();

        //Пробую массив экземпляров класса Main
        //Main[] test= new Main[3];
        //for (Main m:test) {m = new Main();} через m ничего сохранить не получается, только прочитать
        //for (int i = 0; i < test.length; i++) {test[i]=new Main();} //а так работает
        //System.out.println(Arrays.toString(test));
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
         }
        return arr;
    }
}