public class Function {
    public static void main(String[] args) {

        int hargaAglonema = 75000;
        int hargaYam = 50000;
        int hargaAlocasia = 60000;
        int hargaRose = 10000;

        // Stok bunga (Row = Cabang, Column = Jenis Bunga)
        int[][] stock = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };

        String[] branch = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4"
        };

        System.out.println("======================================");
        System.out.println("Income and Status of Each Branch");
        System.out.println("======================================");

        for (int i = 0; i < stock.length; i++) {

            int income = calculateIncome(
                    stock[i][0], stock[i][1],
                    stock[i][2], stock[i][3],
                    hargaAglonema, hargaYam,
                    hargaAlocasia, hargaRose);

            String status = getStatus(income);

            System.out.println(branch[i]);
            System.out.println("Income : IDR " + income);
            System.out.println("Status : " + status);
            System.out.println("--------------------------------------");
        }
    }

    public static int calculateIncome(int aglonema, int yam, int alocasia, int rose,
            int hargaA, int hargaY, int hargaAl, int hargaR) {

        return (aglonema * hargaA) +
                (yam * hargaY) +
                (alocasia * hargaAl) +
                (rose * hargaR);
    }

    public static String getStatus(int income) {

        if (income > 1500000) {
            return "Very Good";
        } else {
            return "Need Evaluation";
        }
    }
}
