import java.util.Scanner;
import java.util.Locale;

public class Product {

    private Double cost;
    private String name;

    public Product() {
        setName();
        setCost();
        System.out.println("Товар успешно добавлен!");
    }

    public Double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введите название блюда.");
            String line = scanner.nextLine();
            if(line.trim().isEmpty()){
                System.out.println("Пусто!");
                continue;
            }
            else{
                name = line;
                break;
            }
        }
    }

    public void setCost() {
        Scanner scanner;
        while(true){
            System.out.println("Укажите стоимость в формате XX.XX " + name);
            scanner = new Scanner(System.in).useLocale(Locale.US);
            if(!scanner.hasNextDouble()){
                System.out.println("Необходимо указать стоимость в формате XX.XX.");
                continue;
            }
            cost = scanner.nextDouble();
            if(cost <= 0.0){
                System.out.println("Не может быть отрицательной цены!");
            }
            else{
                break;
            }
        }
    }
}
