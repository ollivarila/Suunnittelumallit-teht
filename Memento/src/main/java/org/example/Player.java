package org.example;

public class Player extends Thread{

    private Object memento;

    private GuessingGame game;

    public void setMemento(Object memento){
        this.memento = memento;
    }

    public Object getMemento(){
        return memento;
    }

    public void setGame(GuessingGame game){
        this.game = game;
    }

    @Override
    public void run(){
        boolean isPlaying = true;
        int guess = 0;

        while(isPlaying){
            guess = getRandomGuess();
            isPlaying = !game.guess(this, guess);
        }
        System.out.println("Player has stopped playing");
        System.out.println("Player guessed " + guess);
    }

    private int getRandomGuess(){
        return (int)(Math.random() * 1000);
    }
}
