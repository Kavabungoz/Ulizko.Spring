package model;

/*
    Аттракцион "Американские горки"
*/

public class Rollercoaster {
    private int ageRaiting;
    private int weightRaiting;

    public Rollercoaster() {
    }

    public int getAgeRaiting() {
        return ageRaiting;
    }

    public void setAgeRaiting(int ageRaiting) {
        this.ageRaiting = ageRaiting;
    }

    public int getWeightRaiting() {
        return weightRaiting;
    }

    public void setWeightRaiting(int weightRaiting) {
        this.weightRaiting = weightRaiting;
    }

    @Override
    public String toString() {
        return "Rollercoaster{" +
                "ageRaiting=" + ageRaiting +
                ", weightRaiting=" + weightRaiting +
                '}';
    }
}
