package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = "";
        //замеряем когда начали цикл конкатенации
        long start1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            str = str + " " + i;
        }
        //выводим итоговую строку в консоль
        System.out.println(str);
        //после вывода фиксируем текущее время и отнимаем стартовое1
        long diff1 = System.currentTimeMillis() - start1;

        //замеряем когда начали цикл конкатенации
        long start2 = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            str2.append(i).append(" ");
        }
        //выводим в консоль
        System.out.println(str2.toString());
        //после вывода фиксируем текущее время и отнимаем стартовое2
        long diff2 = System.currentTimeMillis() - start2;

        System.out.printf("Просто String = %5s",diff1 + "\n");
        System.out.printf("StringBuilder = %5s",diff2 + "\n");
    }
}
