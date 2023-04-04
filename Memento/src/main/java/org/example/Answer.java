package org.example;

public class Answer {

    private final int correct;

    public Answer(int correct){
        this.correct = correct;
    }

    public boolean isCorrect(int guess){
        return guess == correct;
    }

    public int getCorrect(){
        return correct;
    }
}
