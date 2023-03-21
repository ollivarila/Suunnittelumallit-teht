package org.example;

public class GuessingGame {


    public GuessingGame(){
    }

    public void joinGame(Player player){
        player.setGame(this);
        Answer answer = randomAnswer();
        System.out.println("Answer is " + answer.getCorrect());
        player.setMemento(answer);
    }

    private Answer randomAnswer(){
        int correct = (int)(Math.random() * 1000);
        return new Answer(correct);
    }


    public boolean guess(Player player, int guess){
        Answer answer = (Answer)player.getMemento();
        return answer.isCorrect(guess);
    }
}

