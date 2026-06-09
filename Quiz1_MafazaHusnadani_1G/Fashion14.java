package Quiz1_MafazaHusnadani_1G;

public class Fashion14 {
    public String name;
    public String category;
    public int price;
    public int sold;
    public int stock;

    public Fashion14(String name, String category, int price, int sold, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.sold = sold;
        this.stock = stock;
    }

    public void printInfo() {
        System.out.println("Name     : " + name);
        System.out.println("Category : " + category);
        System.out.println("Price    : " + price);
        System.out.println("Sold     : " + sold);
        System.out.println("Stock    : " + stock);
    }
}