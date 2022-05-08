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
        RightPrizma prizma = new RightPrizma();
        Prizmas prizmas;

        System.out.print("Введите количество квадратов:");
        int numSquares = scan.nextInt();
        squares = new Squares(numSquares);

        System.out.print("Введите количество призм:");
        int numPrizmas = scan.nextInt();
        prizmas = new Prizmas(numPrizmas);


        int side;
        System.out.println("\n\nКвадраты:");
        for (int i = 0; i < numSquares; i++) {
            side = -1;
            while (square.CheckCorrectSide("" + (side = (int) (Math.random() * 11 - 5))) < 0) {//-5...5
//                System.out.println(side);
            }
            square = new Square(side);
            squares.setSquareAt(i, square);
            System.out.println(square + "\n");
        }

        int height;
        System.out.println("\n\nПризмы:");
        for (int i = 0; i < numPrizmas; i++) {
            side = -1;
            height = -1;
            while (prizma.CheckCorrectSide("" + (side = (int) (Math.random() * 11 - 5))) < 0 || prizma.CheckCorrectHeight("" + (height = (int) (Math.random() * 11 + 5))) < 0) {
//                System.out.println("\n"+side +"\n"+ height+"\n");
            }
            prizma = new RightPrizma(side, height);
            prizmas.setPrizmaAt(i, prizma);
            System.out.println(prizma + "\n");
        }

        System.out.println("\n Квадрат с максимальной площадью: " + squares.getSquares()[squares.maxSquare()]);
        System.out.println("\n Призма с максимальной диагональю: " + prizmas.getPrizmas()[prizmas.maxDiagonale()]);
    }
}

