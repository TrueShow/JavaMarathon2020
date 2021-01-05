package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public Picker(Warehouse warehouseInput) {
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
        return "Сборщик {" +
                "Зарплата = " + salary +
                ", Премия выплачена? " + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.countPickedOrders++;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
        }
        else {
            if (!this.isPayed) {
                salary += 70_000;
                isPayed = true;
            }
            else {
                System.out.println("Бонус уже был выплачен");
            }
        }
    }
}
