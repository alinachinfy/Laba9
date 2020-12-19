import java.util.Scanner;

public class testComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название: ");
        String name = in.nextLine();
        computer.setName(name);
        System.out.print("Введите количество ядер: ");
        int threadNumber = in.nextInt();
        computer.setThreadNumber(threadNumber);
        System.out.println("Какой-то ноутбук: " + computer.getName() + " " + computer.getThreadNumber());
        System.out.println();

        Notebook myNotebook1 = new Notebook("ASUS TUF Gaming FX705", 6, "AMD Ryzen 7", 2020);
        Notebook myNotebook2 = new Notebook();
        System.out.print("Введите название ноутбука: ");
        name = in.next();
        myNotebook2.setName(name);
        System.out.print("Введите количество ядер: ");
        threadNumber = in.nextInt();
        myNotebook2.setThreadNumber(threadNumber);
        System.out.print("Введите модель процессора: ");
        String cpu = in.next();
        myNotebook2.setCPU(cpu);
        System.out.print("Введите год выпуска: ");
        int year = in.nextInt();
        myNotebook2.setYear(year);
        System.out.println();
        System.out.println("Первый ноутбук: " + myNotebook1.toString());
        System.out.println("Второй ноутбук: " + myNotebook2.toString());

        Smartphone smartphone = new Smartphone();
        smartphone.setAllInfo();
        System.out.println(smartphone.toString());
    }
}


