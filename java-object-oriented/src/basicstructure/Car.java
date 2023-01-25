package basicstructure;

/**
 * Object oriented example exercise
 */

class Car {

    String color;
    String model;
    int tankCapacity;

    // Constructor here

    Car() {

    }

    Car(String color, String model, int tankCapacity) {
        this.color = color;
        this.model = model;
        this.tankCapacity = tankCapacity;
    }

    // Get and Set

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getModel() {
        return model;
    }

    // Get and Set Tank

    void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    int getTankCapacity() {
        return tankCapacity;
    }

    // Method of total to fill the tank

    double tankTotalValor(double fuelValue) {
        return tankCapacity * fuelValue;
    }

}
