package model;

/*
    Аттракцион "Американские горки"
*/

public class Rollercoaster {
    private int ageRating;
    private int weightRating;

    public Rollercoaster() {
    }

    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public int getWeightRating() {
        return weightRating;
    }

    public void setWeightRating(int weightRating) {
        this.weightRating = weightRating;
    }

    @Override
    public String toString() {
        return "Rollercoaster{" +
                "ageRaiting=" + ageRating +
                ", weightRaiting=" + weightRating +
                '}';
    }
}
