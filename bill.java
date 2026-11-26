public class bill {
    public static void main(String[] args) {
        String Customer_name = "Rahul";
        int unit = 350;
        double bill = 0;
        if (unit < 0) {
            System.out.println("invalid units");

        } else if (unit <= 100) {
            bills = unit * 2;

        } else if (unit <= 200) {
            bill = unit * 3;
        }
    }
}
