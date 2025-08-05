package UsingObjects;/*
Author: Azarya Silaen
 */

public class Dog {

    private String name;
    private String breed;
    private double weight;

    public Dog (String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }
    public Dog (String name, double weight) {
        this.name = name;
        breed = "Mutt";
        this.weight = weight;
    }

    public String toString() {
        return "name = " + name + '\n' +
                "breed = " + breed + '\n' +
                "weight = " + weight + '\n';
    }
}
