package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier = new Courier(warehouse1);
        Picker picker = new Picker(warehouse1);

        businessProcess(picker);
        businessProcess(courier);

        System.out.println(warehouse1);
        System.out.println(courier);
        System.out.println(picker);
        System.out.println("------------------------------------");
        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);
        courier2.doWork();
        picker2.doWork();
        System.out.println(warehouse2);
        System.out.println(picker2);
        System.out.println(courier2);
//        System.out.println(warehouse1);
//        System.out.println(courier);
//        System.out.println(picker);
//        picker.bonus();
//        courier.bonus();

    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10_000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
