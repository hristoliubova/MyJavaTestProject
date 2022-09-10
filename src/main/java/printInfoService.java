import java.util.Scanner; //импорт сканнера

public class printInfoService {
    public static void printInfo() {
        Scanner sc = new Scanner(System.in);    //объявление сканнера
        System.out.print("Введите Ваше Имя: ");
        String name = sc.nextLine();
        System.out.println("Привет, " + name);
    }
}
