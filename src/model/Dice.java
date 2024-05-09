package model;

import java.util.Random;

public class Dice {
    private int numberOfDice;
    private  int MIN,MAX,Range;
    Random random;
    public Dice(int numberOfDice){
        random = new Random();
        this.numberOfDice = numberOfDice;
        MIN=1 * numberOfDice;
        MAX=6 * numberOfDice;
        Range=MAX-MIN+1;
    }

    public int getDiceNumber(){
        return random.nextInt(Range) + MIN;
    }

}
