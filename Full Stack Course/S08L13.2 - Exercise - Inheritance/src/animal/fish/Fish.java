package animal.fish;

import animal.Animal;

public class Fish extends Animal {
    protected boolean waterBone = true;
    protected boolean gills = true;


    public Fish() { //Constructor
        animalType = "Fish";
        this.waterBone = true;
        this.gills = true;
    }

    @Override
    public String showInfo() {
        return "Fish{" +
                "heightInFeet=" + heightInFeet +
                ", weightInKilos=" + weightInKilos +
                ", animalType='" + animalType + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", waterBone=" + waterBone +
                ", gills=" + gills +
                '}';
    }

}
