package animal.fish;

public class Eel extends Fish {
    private String special;

    public Eel() {
        super();
        this.special = "Releases Electric Shock";
    }
    public String showInfo() {
        return "Eel{" +
                "heightInFeet=" + height +
                ", weightInKilos=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", special='" + special + '\'' +
                ", waterBone=" + waterBone +
                ", gills=" + gills +
                '}';
    }

}
