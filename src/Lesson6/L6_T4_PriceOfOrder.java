package Lesson6;

public class L6_T4_PriceOfOrder {
    public static void main(String[] args) {
        int quantity1 = 4;
        int quantity2 = 4;
        int cost1 = 700;
        int cost2 = 60;

        System.out.println("Стоимость вашего заказа составит " + getPurchasePrice(quantity1, quantity2, cost1, cost2));
    }

    public static double getPurchasePrice(int quantity1, int quantity2, int cost1, int cost2) {
        final int discountQuantity = 10;
        final int discountCost = 1000;

        double discount = 0;
        double purchaseCost = cost1 * quantity1 + cost2 * quantity2;
        if (quantity1 + quantity2 >= discountQuantity && purchaseCost >= discountCost) {
            discount = 10;
        } else {
            if (quantity1 + quantity2 >= discountQuantity || purchaseCost >= discountCost) {
                discount = 5;
            }
        }
        final int divisorOfOneHundred = 100;
        return purchaseCost - purchaseCost / divisorOfOneHundred * discount;
    }
}
