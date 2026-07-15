class Package {
    private String trackingId;
    private double weight;

    Package(String trackingId, double weight) {
        this.trackingId = trackingId;
        setWeight(weight);
    }

    public String getTrackingId() {
        return trackingId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight! Weight unchanged.");
        }
    }
}

class ExpressPackage extends Package {
    private String priorityLevel;

    ExpressPackage(String trackingId, double weight, String priorityLevel) {
        super(trackingId, weight);
        this.priorityLevel = priorityLevel;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void printShippingLabel() {
        System.out.println("Tracking ID: " + getTrackingId());
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Priority: " + priorityLevel);
    }
}

public class eCommerce {
    public static void main(String[] args) {
        ExpressPackage p = new ExpressPackage("EXP101", 2.5, "Critical");

        p.printShippingLabel();

        p.setWeight(-1.5);
        p.setWeight(0.0);

        System.out.println("Final Weight: " + p.getWeight());
    }
}