class Vehicle {
    private int numberOfWheels;
    private String color;
    // public Vehicle(String color) {
    // getter
    // public int getNumberOfWheels() {
    //     return numberOfWheels;
    // }
    public Vehicle() {
    }
    public Vehicle(String color) {
        this.color = color;
    }
    public Vehicle(String color, int num) {
        this.color = color;
        this.numberOfWheels = num;
    }
    
    // // setter
    // public void setNumberOfWheels(int number) {
    //     numberOfWheels = number;
    // }
    // // getter
    // public String getColor() {
    //     return color;
    // }
    // // setter
    // public void setColor(String color) {
    //     this.color = color;        // 1
    // }
}
