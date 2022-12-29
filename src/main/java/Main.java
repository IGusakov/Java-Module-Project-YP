
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        int peopleNumber = getPeopleNumber();


        ArrayList<Product> productList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String command = "";
        while(true){
            productList.add(new Product());
            System.out.println("Введите новый товар или наберите \"завершить\".");
            command = scanner.nextLine();
            if(command.equalsIgnoreCase("завершить")){
                System.out.println("Список составлен");
                break;
            }
        }
        new Calculator(peopleNumber, productList);
    }

    public static int getPeopleNumber() {
        Scanner scanner;
        while (true) {
            System.out.println("На сколько человек делим счёт?");
            scanner = new Scanner(System.in);
            if (!scanner.hasNextInt()) {
                System.out.println("Так не выйдет! Это не цифра...");
                continue;
            }
            int peopleNumber = scanner.nextInt();
            if (peopleNumber <= 1) {
                System.out.println("Должно быть как минимум 2.");
            } else {
                System.out.println("Счёт будет разделён на " + peopleNumber + " человек");
                return peopleNumber;
            }
        }
    }
}
