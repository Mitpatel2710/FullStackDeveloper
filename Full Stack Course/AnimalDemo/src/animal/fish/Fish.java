package animal.fish;

import animal.Animal;

public class Fish extends Animal {

    protected boolean waterBone = true;
    protected boolean gills = true;

    public Fish() {
        animalType = "Fish";
        this.waterBone = true;
        this.gills = true;
    }
    public String showInfo(){
        return "Fish{" +
                "heightInFeet=" + height +
                ", weightInKilos=" + weight +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", waterBone=" + waterBone +
                ", gills=" + gills +
                '}';
    }
}
