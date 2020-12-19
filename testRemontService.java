public class testRemontService {
    public static void main(String[] args) {
        RemontService remontService = new RemontService();
        Notebook myNotebook1 = new Notebook("ASUS TUF Gaming FX705", 6, "AMD Ryzen 7", 2020);
        remontService.addComputer(myNotebook1);
        remontService.addComputer(new Notebook("MSI Prestige 14", 4, "Intel Core i5 10210U", 2020));
        Smartphone mySmartphone = new Smartphone("Iphone X", 6, "iOS", 64);
        remontService.addComputer(mySmartphone);
        remontService.printRemontService();
        System.out.println("Количество ноутбуков в сервисном центре: " + remontService.getNotebooksCount());
        System.out.println("Количество смартфонов в сервисном центре: " + remontService.getSmartphonesCount());
        if (remontService.findComputer(myNotebook1)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        remontService.removeComputer(myNotebook1);
    }
}



