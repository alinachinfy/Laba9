public class Computer {
    private String name;
    private int threadNumber;

    public Computer() {
        name = "";
        threadNumber = 0;
    }

    public Computer(String name, int threadNumber) {
        this.name = name;
        this.threadNumber = threadNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThreadNumber() {
        return threadNumber;
    }

    public void setThreadNumber(int threadNumber) {
        this.threadNumber = threadNumber;
    }
}



