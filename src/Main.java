import model.Entities;
import service.PlaySnakeAndLadder;

import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Entities entities= Entities.getInstance();

        int noOfSnakes=sc.nextInt();
        while(noOfSnakes>0){
            int startPosition = sc.nextInt();
            int endPosition = sc.nextInt();
            entities.setSnake(startPosition, endPosition);
            noOfSnakes--;
        }

        int noOfLadders = sc.nextInt();
        while(noOfLadders>0){
            int startPosition = sc.nextInt();
            int endPosition = sc.nextInt();
            entities.setLadder(startPosition, endPosition);
            noOfLadders--;
        }
        int noOfPlayers = sc.nextInt();
        int i=0;
        while(noOfPlayers>0){
            String player = sc.next();
            entities.setPlayer(i++, player);
            noOfPlayers--;
        }
        PlaySnakeAndLadder playSnakeAndLadder = new PlaySnakeAndLadder(1);
        System.out.println(playSnakeAndLadder.PlayGame()+" wins the game");
    }
}