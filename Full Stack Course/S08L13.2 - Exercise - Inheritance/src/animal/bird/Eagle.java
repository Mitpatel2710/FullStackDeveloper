package animal.bird;

public class Eagle extends Bird {
    @Override
    public String showInfo() {
        return "Eagle{" +
                "heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", feather=" + feather +
                ", canFly=" + canFly +
                '}';
    }
}
