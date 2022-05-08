package com;

import java.util.Arrays;

public class Prizmas {
    private RightPrizma[] prizmas;
    public RightPrizma[] getPrizmas(){
        return prizmas;
    }

    public Prizmas() {
        prizmas = new RightPrizma[0];
    }
    public Prizmas(int length) {
        this.prizmas = new RightPrizma[length];
    }

    public void setPrizmaAt(int index, RightPrizma prizma) {
        prizmas[index] = prizma;
    }

    public int maxDiagonale(){
        int maxIndex = 0;
        for (int i=0; i<prizmas.length; i++){
            if (prizmas[maxIndex].GetSquare()<prizmas[i].GetSquare()) {
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    @Override
    public String toString() {
        return "Prizmas{" +
                "prizmas=" + Arrays.toString(prizmas) +
                '}';
    }
}
