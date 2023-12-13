package animal.fish;

public class Eel extends Fish{
    private String special;

    public Eel() {
        super();
        this.special = "Releases electric stock";
    }

    @Override
    public String showInfo() {
        return "Eel{" +
                "heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", special='" + special + '\'' +
                ", waterBone=" + waterBone +
                ", gills=" + gills +
                '}';
    }
}
