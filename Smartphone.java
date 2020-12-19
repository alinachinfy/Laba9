import java.util.Scanner;

public class Smartphone extends Computer {
    private String os;
    private int internalMemory;

    public Smartphone() {
        super();
        os = "";
        internalMemory = 0;
    }

    public Smartphone(String name, int threadNumber, String os, int internalMemory) {
        super(name, threadNumber);
        this.os = os;
        this.internalMemory = internalMemory;
    }

    public String getOS() {
        return os;
    }

    public void setOS(String os) {
        this.os = os;
    }

    public int getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(int internalMemory) {
        this.internalMemory = internalMemory;
    }

    public void setAllInfo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название смартфона: ");
        String name = in.next();
        setName(name);
        System.out.print("Введите количество ядер: ");
        int threadNumber = in.nextInt();
        setThreadNumber(threadNumber);
        System.out.print("Введите операционную систему смартфона: ");
        os = in.next();
        System.out.print("Введите количество встроенной памяти: ");
        internalMemory = in.nextInt();
    }

    @Override
    public String toString() {
        return
                "Смартфон = '" + getName() + '\'' +
                        ", ядра = '" + getThreadNumber() + '\'' +
                        ", операционка = '" + os + '\'' +
                        ", памяти = " + internalMemory + "GB";
    }
}


