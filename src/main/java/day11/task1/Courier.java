package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private static final int TASK_SALARY = 100;

    public Courier(Warehouse warehouseInput) {
        this.warehouse = warehouseInput;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Курьер {" +
                "Зарплата = " + salary +
                ", Премия выплачена? " + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        warehouse.incrementCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
        }
        else {
            if (!this.isPayed) {
                salary += 50_000;
                isPayed = true;
            }
            else {
                System.out.println("Бонус уже был выплачен");
            }
        }
    }
}
