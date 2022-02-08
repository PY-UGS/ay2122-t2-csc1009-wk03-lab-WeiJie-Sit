package T4;

import java.util.Scanner;

public class Bmi {
    private double height;
    private double weight;

    public Bmi(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    public Bmi() {

    }

    public double getHeight() {
        return height*0.0254;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight*0.45359237;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi(){
        return (this.getWeight()/Math.pow(this.getHeight(),2));
    }

    public String getInterpretation(){
        double a = this.getBmi();
        if(18.5>a) {
            return "UnderWeight";
        }else if(25.0>a){
            return "Normal";
        }else if(30>a){
            return "Overweight";
        }else{
            return "Obese";
        }
    }
}
