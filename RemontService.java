import java.util.ArrayList;

public class RemontService {
    private ArrayList<Computer> computers = new ArrayList<>();

    public RemontService() {
    }

    public RemontService(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public Boolean findComputer(Computer computer) {
        return computers.contains(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public int getNotebooksCount() {
        int count = 0;
        for (Computer computer : computers) {
            if (computer instanceof Notebook) {
                count++;
            }
        }
        return count;
    }

    public int getSmartphonesCount() {
        int count = 0;
        for (Computer computer : computers) {
            if (computer instanceof Smartphone) {
                count++;
            }
        }
        return count;
    }

    public void printRemontService() {
        System.out.println("В сервисном центре: ");
        for (Computer computer : computers) {
            System.out.println("\t" + computer.toString());
        }
    }
}
