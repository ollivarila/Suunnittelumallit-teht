package org.example;

public class Main {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        Player player1 = new Player();
        Player player2 = new Player();
        game.joinGame(player1);
        game.joinGame(player2);
        player1.start();
        player2.start();
    }
}