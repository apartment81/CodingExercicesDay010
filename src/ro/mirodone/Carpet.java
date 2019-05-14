package ro.mirodone;

public class Carpet {

    private double cost;

    Carpet(double cost) {

        this.cost = cost;
    }

    public double getCost() {
        if (cost < 0) {
            cost = 0.0;
        }
        return cost;
    }
}
