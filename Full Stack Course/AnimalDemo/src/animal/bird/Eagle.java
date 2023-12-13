package animal.bird;

public class Eagle extends Bird {
    public String showInfo() {
        return "Eagle{" +
                "heightInFeet=" + height +
                ", weightInKilos=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", feather=" + feather +
                ", canFly=" + canFly +
                '}';
    }
}