package animal.reptile;

public class Crocodile extends Reptile {

    public Crocodile() {
        super();
        egg = "Hard Shelled";
    }

    @Override
    public String showInfo() {
        return "Crocodile{" +
                "heightInFeet=" + height +
                ", weightInKilos=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", skin='" + skin + '\'' +
                ", egg='" + egg + '\'' +
                ", backbone=" + backbone +
                '}';
    }

}
