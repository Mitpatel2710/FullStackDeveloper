package animal.reptile;

import animal.Animal;

public class Reptile extends Animal {

    protected String skin, egg;

    protected boolean backbone;

    public Reptile() {
        height = 5;
        weight = 20;
        animalType = "Reptile";
        bloodType = "Cold";
        this.skin = "Dry Skin";
        this.egg = "Soft Shelled";
        this.backbone = true;
    }
    public String showInfo(){
        return  "Reptile{" +
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
