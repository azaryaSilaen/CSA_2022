package UsingObjects;/*
Author: Azarya Silaen
 */

public class Fitness {

    //name, weight, height, days recorded and total steps walked.

    private String name;
    private double height;
    private double weight;
    private int daysRecorded;
    private int totalSteps;

    public Fitness (String name, double height, double weight) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        daysRecorded = 0;
        totalSteps = 0;
    }
    public Fitness (String name, double height, double weight, int daysRecorded, int totalSteps) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.daysRecorded = daysRecorded;
        this.totalSteps = totalSteps;
    }

    public void calculateBMI () {
        double BMI = weight/Math.pow(height, 2);
        System.out.println(String. format("%.2f",BMI));
    }

    public void addDay (int totalSteps) {
        daysRecorded++;
        this.totalSteps = this.totalSteps + totalSteps;
    }

    public int getStepsPerDay () {
        return totalSteps/daysRecorded;
    }

    @Override
    public String toString() {
        return "name = " + name + '\n' +
                "weight = " + weight + '\n' +
                "height = " + height + '\n' +
                "daysRecorded = " + daysRecorded + '\n' +
                "totalSteps = " + totalSteps;
    }
}
