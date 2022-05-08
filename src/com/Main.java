package com;

import java.util.Scanner;

/**
 * Vykhodets Roman, #1
 */
public class Main {

    private static void Start() {
        System.out.println("\nCompleted by student AT-212 \nOdessa Polytechnic University \nVykhodets Roman \n\nVariant 1 \n\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Start();

        Square square = new Square();
        Squares squares;

        System.out.print("Введите количество квадратов:");
        int numSquares = scan.nextInt();
        squares = new Squares(numSquares);

        int side;
        for (int i = 0; i < numSquares; i++) {
            side = -1;
            while (square.CheckCorrectSide("" + (side = (int) (Math.random() * 11 - 5))) < 0) {//-5...5
//                System.out.println(side);
            }
            square = new Square(side);
            squares.setSquareAt(i,square);
            System.out.println(square + "\n");
        }



        System.out.println("\n Квадрат с максимальной площадью: " + squares.getSquares()[squares.maxSquare()]);
    }
}

