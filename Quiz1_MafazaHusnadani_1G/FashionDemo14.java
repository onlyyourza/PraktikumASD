package Quiz1_MafazaHusnadani_1G;
import java.util.Scanner;

public class FashionDemo14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5;
        Fashion14[] arrayOfAccessories = new Fashion14[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Input Accessories Data #" + (i + 1));

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Category : ");
            String category = sc.nextLine();

            System.out.print("Price : ");
            int price = sc.nextInt();

            System.out.print("Sold : ");
            int sold = sc.nextInt();

            System.out.print("Stock : ");
            int stock = sc.nextInt();
            sc.nextLine();

            arrayOfAccessories[i] = new Fashion14(name, category, price, sold, stock);

            System.out.println("-----------------------------");
        }

        DataFashion14 data = new DataFashion14();

        data.dataAllFashion(arrayOfAccessories);
        data.calculateTotalSales(arrayOfAccessories);
        data.searchCheapestAccessories(arrayOfAccessories);
        data.checkStock(arrayOfAccessories);

        sc.close();
    }
}