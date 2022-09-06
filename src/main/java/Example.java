import java.util.Scanner; //импорт сканнера

public class Example {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);    //объявление сканнера
        System.out.print("Введите Ваше Имя: ");
        String name = sc.nextLine();
        System.out.println("Привет, " + name);
    }
}
