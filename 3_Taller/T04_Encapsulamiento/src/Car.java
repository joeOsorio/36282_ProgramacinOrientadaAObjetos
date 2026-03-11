class Car {
    private String make;
    private int yearModel;

    // Constructores.
    public Car() {
        this.make = "NULL";
        this.yearModel = 0;
    }

    public Car(String make, int yearModel) {
        this.make = make;
        this.yearModel = yearModel;
    }

    // Métodos setters.

    public void setMake(String make) {
        this.make = make;
    }

    public void setYaerModel(int yearModel) {
        this.yearModel = yearModel;
    }

    // Métodos getters.
    public String getMake() {
        return make;
    }

    public int getYearModel() {
        return yearModel;
    }

    // Método toString

    public String toString() {
        return "\nMake:\t" + make + "\nYear model:\t" + yearModel;
    }
}