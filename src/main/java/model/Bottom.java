package model;
import org.example.Employee;
import org.example.ImproveTask;
import org.example.Position;

public class Bottom extends Employee implements  ImproveTask {
    public Position p; //что за "p"?
    public Bottom(String name, int age, Position p) {
        super(name, age);
        this.p = p;
//не нужная строка
    }

    public Position getP() {
        return p;
    }

    @Override
    public void improve() {
        System.out.println("Выполняю задание");
    }
}
//не нужная строка
