import java.util.ArrayList;

public class Calculator {
    public Calculator(int peopleNumber, ArrayList<Product> productList) {
        calculate(peopleNumber, productList);
    }

    private void calculate(int personCount, ArrayList<Product> productList){
        showProductList(productList);
        totalCostForPerson(personCount, productList);
    }

    private String getRightEnding(double cost) {

            int val = (int) (Math.floor(cost) % 100);

            if (val >= 10 && val <= 20)
                return "рублей";

            val %= 10;

            if (val == 1) {
                return "рубль";
            } else if (val >= 2 && val <= 4) {
                return "рубля";
            } else {
                return "рублей";
            }
        }

    private void showProductList(ArrayList<Product> productList){
        System.out.println("Добавленные товары:");
        double price;
        for(int i = 0; i < productList.size(); i++){
            price = productList.get(i).getCost();
            String ending = getRightEnding(price);
            System.out.println("Позиция: " + productList.get(i).getName() + " Цена: " + String.format("%.2f", productList.get(i).getCost()) + " " + ending);
        }
    }

    private void totalCostForPerson(int personCount, ArrayList<Product> dishesList){
        Double totalPrice = 0.0;
        for(int i = 0; i < dishesList.size(); i++){
            totalPrice = totalPrice + dishesList.get(i).getCost();
        }
        totalPrice = totalPrice / personCount;
        double price = totalPrice;
        String ending = getRightEnding(price);
        System.out.println("Итоговая цена для каждой персоны: " + String.format("%.2f", totalPrice) + " " + ending);
    }
}
