package com;

public class Square {
    double side;

    public Square() {

    }

    public Square(double side) {
        this.setSide(side);
    }

    public static double CheckCorrectSide(String value) { //проверка стороны
        double side = -1;
        try {
            if (Double.parseDouble(value) > 0) {  //String
                side = Double.parseDouble(value);
            } else {
                side = -1;
            }
        } catch (Exception e) { //исключение
            //Ошибка
        }
        return side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            this.side = 0;
        }
    }

    public double GetPerimetr() {
        return side * 4;
    }

    public double GetSquare() {
        return side * side;
    }

    public double GetDiagonale() {
        return side * Math.sqrt(2);
    }

    @Override
    public String toString() {
        return "\n" +
                "\tSide = " + Correction.formatDouble(side) +
                "\tPerimetr = " + Correction.formatDouble(GetPerimetr()) +
                "\tDiagonale = " + Correction.formatDouble(GetDiagonale()) +
                "\tSquare = " + Correction.formatDouble(GetSquare());
    }
}