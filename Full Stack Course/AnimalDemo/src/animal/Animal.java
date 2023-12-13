package animal;

public class Animal {
    //Properties
    protected float height;
    protected float weight;
    protected String animalType;
    protected String bloodType;

    //constructor
    public Animal() {
        this.height = 0;
        this.weight = 0;
        this.animalType = "unknown";
        this.bloodType = "unknown";
    }

    //showInfo method
    public String showInfo(){
        return "Animal [heightInFeet=" + height + ", weightInKilos=" + weight
                + ", animalType=" +animalType + ", bloodType=" + bloodType + "]";
    }
}
