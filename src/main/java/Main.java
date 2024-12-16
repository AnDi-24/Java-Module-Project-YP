
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello to 24 Heures du Mans!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название автомобиля для пилота № 1");
        String nameA = nameValidation(scanner);
        System.out.println("Введите название автомобиля для пилота № 2");
        String nameB = nameValidation(scanner);
        System.out.println("Введите название автомобиля для пилота № 3");
        String nameC = nameValidation(scanner);
        System.out.println("Введите скорость (0 - 250 км/ч) для " + nameA);
        Vehicle a;
        int speedA = speedValidation(scanner);
        a = new Vehicle(nameA, speedA);
        System.out.println("Введите скорость (0 - 250 км/ч) для " + nameB);
        Vehicle b;
        int speedB = speedValidation(scanner);
        b = new Vehicle(nameB, speedB);
        System.out.println("Введите скорость (0 - 250 км/ч) для " + nameC);
        Vehicle c;
        int speedC = speedValidation(scanner);
        c = new Vehicle(nameC, speedC);
        Race win = new Race(a.speed, b.speed, c.speed, a.name, b.name, c.name);
        if (win.winner.equals(a.name)) {
            System.out.println("Победил пилот на " + a.name);
        } else if (win.winner.equals(b.name)) {
            System.out.println("Победил пилот на " + b.name);
        } else if (win.winner.equals(c.name)) {
            System.out.println("Победил пилот на " + c.name);
        }
    }
    private static int speedValidation(Scanner scanner) {
        int speed;
        while (!scanner.hasNextInt() || (speed = scanner.nextInt()) > 250 || speed < 0) {
            scanner.nextLine();
            System.out.println("Скорость должна быть целым числом от 0 до 250, попробуйте еще");
        }
        return speed;
    }
    private static String nameValidation(Scanner scanner) {
        String name;
        while (true) {
            name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Название не может быть пустым, попробуйте еще");
            } else {
                break;
            }
        }
        return name;
    }
}