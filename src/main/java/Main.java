public class Main {
    public static void main(String args[]) {
        System.out.println("Первое задание: ");
        printInfoService printinfo = new printInfoService();
        printinfo.printInfo();
        System.out.println("");

        System.out.println("Второе задание: ");
        GalToLitTable gtl = new GalToLitTable();
        gtl.printGal();
        System.out.println("");
    }
}
