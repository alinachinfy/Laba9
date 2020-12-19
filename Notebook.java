public class Notebook extends Computer {
    private String cpu;
    private int year;

    public Notebook() {
        super();
        cpu = "";
        year = 0;
    }

    public Notebook(String name, int threadNumber, String cpu, int year) {
        super(name, threadNumber);
        this.cpu = cpu;
        this.year = year;
    }

    public String getCPU() {
        return cpu;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "Ноутбук = '" + getName() + '\'' +
                        ", ядра = '" + getThreadNumber() + '\'' +
                        ", процессор = '" + cpu + '\'' +
                        ", год = " + year;
    }
}



