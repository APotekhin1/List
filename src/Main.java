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
                    break;
                }
                case ("2"): {
                    System.out.println("Список покупок:");
                    shopList(listGoods);
                    break;
                }
                case ("3"): {
                    System.out.println("Список покупок: ");
                    shopList(listGoods);
                    System.out.println("Какую покупку хотите удалить? Введите номер ли название: ");
                    String numberName = scanner.nextLine();
                    try {
                        if (Integer.parseInt(numberName) > 0 &&
                                Integer.parseInt(numberName) < listGoods.size() + 1) {
                            int n = Integer.parseInt(numberName) - 1;
                            String delGoods = listGoods.get(n);
                            listGoods.remove(n);
                            System.out.println("Покупка " + delGoods + " удалена. \n" +
                                    " Список покупок: ");
                            shopList(listGoods);
                        }
                    } catch (NumberFormatException e) {

                        listGoods.remove(numberName);
                        System.out.println("Покупка " + numberName + " удалена. \n" +
                                " Список покупок: ");
                        shopList(listGoods);
                    }
                    break;
                }
                case ("4"): {
                    System.out.println("Пока.");
                    System.exit(1);
                }
            }
        }
    }

    public static void shopList(List<String> listGoods) {
        if (listGoods.isEmpty()) {
            System.out.println("Список покупок пуст.");
        }
        for (int i = 0; i < listGoods.size(); i++) {
            System.out.println((i + 1) + ". " + listGoods.get(i));
        }
    }
}

