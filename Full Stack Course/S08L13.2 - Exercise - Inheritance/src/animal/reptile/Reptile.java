package animal.reptile;

import animal.Animal;

public class Reptile extends Animal {
    protected String skin, egg;
    protected boolean backbone;

    public Reptile() { //Constructor
        heightInFeet = 5; //came from animal
        weightInKilos = 20; //came from animal
        animalType = "Reptile"; //came from animal
        bloodType = "Cold"; //came from animal
        this.skin = "Dry Skin";
        this.egg = "soft shelled";
        this.backbone = true;
    }

    @Override
    public String showInfo() {
        return "Reptile{" +
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
