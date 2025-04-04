public class disc {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        int disc = (125000*10)/100;
        int discfee = fee - disc;
        System.out.println("The discount amount is INR " + disc + " and final discounted fee is INR " + discfee);
    }
}

