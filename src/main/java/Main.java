
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello to 24 Heures du Mans!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите марку автомобиля для пилота № 1");
        String nameA = scanner.nextLine();
        System.out.println("Введите марку автомобиля для пилота № 2");
        String nameB = scanner.nextLine();
        System.out.println("Введите марку автомобиля для пилота № 3");
        String nameC = scanner.nextLine();
        System.out.println("Введите скорость (0 - 250 км/ч) для " + nameA);
        Vehicle a = null;
        while (true) {
            int speedA = scanner.nextInt();
            if ((speedA < 0) || (speedA > 250)) {
                System.out.println("Скорость должна быть от 0 до 250 км/ч");
            } else {
                a = new Vehicle(nameA, speedA);
                break;
            }
        }
        System.out.println("Введите скорость (0 - 250 км/ч) для " + nameB);
        Vehicle b = null;
        while (true) {
            int speedB = scanner.nextInt();
            if ((speedB < 0) || (speedB > 250)) {
                System.out.println("Скорость должна быть от 0 до 250 км/ч");
            } else {
                b = new Vehicle(nameB, speedB);
                break;
            }
        }
        System.out.println("Введите скорость (0 - 250 км/ч) для " + nameC);
        Vehicle c = null;
        while (true) {
            int speedC = scanner.nextInt();
            if ((speedC < 0) || (speedC > 250)) {
                System.out.println("Скорость должна быть от 0 до 250 км/ч");
            } else {
                c = new Vehicle(nameC, speedC);
                break;
            }
        }

        Race win = new Race (a.speed, b.speed, c.speed, a.name, b.name, c.name);
        if (win.winner.equals(a.name)) {
            System.out.println("Победил пилот на " + a.name);
        }else if (win.winner.equals(b.name)) {
            System.out.println("Победил пилот на " + b.name);
        }else if (win.winner.equals(c.name)) {
            System.out.println("Победил пилот на " + c.name);
        }

    }

    }









