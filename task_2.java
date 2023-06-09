import java.util.ArrayList;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(34);
        list.add(-65);
        list.add(6543);
        list.add(-1);
        list.add(0);
        System.out.println("Список чисел " + list);

        int min = list.get(0);
        int max = list.get(0);
        int average = list.get(0);

        for (Integer i: list) {
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }

        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println("среднее арифметическое: " + average(args, list, average));

    }
    public static int average(String[] args, ArrayList<Integer> list, int average) {
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i) + temp;
        }
        average = temp / list.size();
        return average;
    }
}