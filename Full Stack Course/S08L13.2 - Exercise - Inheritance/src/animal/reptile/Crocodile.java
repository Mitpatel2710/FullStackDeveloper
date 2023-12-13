package animal.reptile;

public class Crocodile extends Reptile  {
    public Crocodile() {
        super();
        egg = "Hard Shelled";
    }

    @Override
    public String showInfo() {
        return "Crocodile{" +
                "heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backbone=" + backbone +
                '}';
    }
}
