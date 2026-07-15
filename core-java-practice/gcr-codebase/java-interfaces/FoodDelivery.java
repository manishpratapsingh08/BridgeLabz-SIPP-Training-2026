interface FoodDelivery {

    void deliverFood();

    default void trackOrder() {
        System.out.println("Tracking Food Delivery");
    }

    static String generateDeliveryCode() {
        return "FD1001";
    }
}

interface GroceryDelivery {

    void deliverGrocery();

    default void trackOrder() {
        System.out.println("Tracking Grocery Delivery");
    }
}

class DeliveryExecutive implements FoodDelivery, GroceryDelivery {

    String[] customers = {
        "Manish",
        "Rahul",
        "Amit",
        "Priya",
        "Neha"
    };

    @Override
    public void deliverFood() {
        System.out.println("Food Deliveries:");
        for (String customer : customers) {
            System.out.println("Food delivered to " + customer);
        }
    }

    @Override
    public void deliverGrocery() {
        System.out.println("\nGrocery Deliveries:");
        for (String customer : customers) {
            System.out.println("Groceries delivered to " + customer);
        }
    }

    @Override
    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }
}

class Main {
    public static void main(String[] args) {

        DeliveryExecutive delivery = new DeliveryExecutive();

        System.out.println("Delivery Code: " + FoodDelivery.generateDeliveryCode());

        delivery.trackOrder();

        System.out.println();

        delivery.deliverFood();

        System.out.println();

        delivery.deliverGrocery();
    }
}