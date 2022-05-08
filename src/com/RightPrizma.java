package com;

public class RightPrizma extends Square {
    double height;

    public RightPrizma() {

    }

    public RightPrizma(double side, double height) {
        super(side);
        this.setHeight(height);
    }

    public static double CheckCorrectHeight(String value) {
        double height = -1;
        try {
            if (Double.parseDouble(value) > 0) {
                height = Double.parseDouble(value);
            } else {
                height = -1;
            }

        } catch (Exception e) {

        }
        return height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double GetVolume() { //объем
        return super.GetSquare() * height;
    }

    public double GetDiagonalePrizma() {
        return side * Math.sqrt(3);
    }

    @Override
    public double GetSquare() {
        return 2 * super.GetSquare() + 4 * side * height;
    }

    @Override
    public String toString() {
        return "\n" +
                "\tSide = " + Correction.formatDouble(side) +
                "\tHeight = " + Correction.formatDouble(height) +
                "\tVolume = " + Correction.formatDouble(GetVolume()) +
                "\tSquare Prizm = " + Correction.formatDouble(GetSquare()) +
                "\tDiagonale Prizm = " + Correction.formatDouble(GetDiagonalePrizma());
    }
}
