package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public Courier(Warehouse warehouseInput) {
        this.salary = 0;
        this.isPayed = false;
        warehouse = warehouseInput;
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
        salary += 100;
        warehouse.countDeliveredOrders++;
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
