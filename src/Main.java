import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listGoods = new ArrayList<>();
        while (true) {
            System.out.println("Выберите операцию: \n" +
                    "1. Добавить покупку \n" +
                    "2. Показать список покупок \n" +
                    "3. Удалить покупку \n" +
                    "4. Выход из программы");
            String number = scanner.nextLine();
            switch (number) {
                case ("1"): {
                    System.out.println("Какую покупку хотите добавить?");
                    String goods = scanner.nextLine();
                    listGoods.add(goods);
                    System.out.println(goods + " добавлен в корзину");
                }
                case ("2"): {

                }
                case ("3"): {

                }
                case ("4"): {

                }
            }
        }
    }
}

