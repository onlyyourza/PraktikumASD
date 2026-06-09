package Quiz1_MafazaHusnadani_1G;

public class DataFashion14 {

    public void dataAllFashion(Fashion14[] arrayOfAccessories) {
        System.out.println("=== ALL FASHION DATA ===");

        for (int i = 0; i < arrayOfAccessories.length; i++) {
            arrayOfAccessories[i].printInfo();
            System.out.println("-----------------------");
        }
    }

    public void calculateTotalSales(Fashion14[] arrayOfAccessories) {
        int total = 0;

        for (int i = 0; i < arrayOfAccessories.length; i++) {
            total = total + (arrayOfAccessories[i].price * arrayOfAccessories[i].sold);
        }

        System.out.println("Total Sales : " + total);
    }

    public void searchCheapestAccessories(Fashion14[] arrayOfAccessories) {
        int indexCheapest = 0;

        for (int i = 1; i < arrayOfAccessories.length; i++) {
            if (arrayOfAccessories[i].price < arrayOfAccessories[indexCheapest].price) {
                indexCheapest = i;
            }
        }

        System.out.println("=== CHEAPEST ACCESSORY ===");
        arrayOfAccessories[indexCheapest].printInfo();
    }

    public void checkStock(Fashion14[] arrayOfAccessories) {
        System.out.println("=== STOCK STATUS ===");

        for (int i = 0; i < arrayOfAccessories.length; i++) {

            arrayOfAccessories[i].printInfo();

            if (arrayOfAccessories[i].stock > 5) {
                System.out.println("Stock Status : Many Stock");
            } else {
                System.out.println("Stock Status : Limited Stock");
            }

            System.out.println("-----------------------");
        }
    }
}