import effects.Effect;
import effects.EffectFactory;
import effects.EffectFactoryImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardGame extends Game{

    private Die die;
    private List<Player> players;

    private final int gameLength;

    private final Scanner scanner;

    private Player playerCurrentlyPlaying;

    private final EffectFactory effectFactory;

    public BoardGame(int playersCount, int gameLength){
       super.playersCount = playersCount;
       this.gameLength = gameLength;
       this.scanner = new Scanner(System.in);
       this.effectFactory = new EffectFactoryImpl();
    }

    private void createPlayers(){
        for(int i = 0; i < super.playersCount; i++){
            players.add(new Player(i + 1));
        }
    }

    @Override
    void initializeGame() {
       die = new Die();
       this.players = new ArrayList<>();
       createPlayers();
    }

    @Override
    void makePlay(int player) {
        playerCurrentlyPlaying = players.get(player);
        printChoices();
        try{
            int selection = getSelection();
            playBasedOnSelection(selection);
        } catch (IllegalArgumentException e){
            System.out.println("Invalid selection");
            makePlay(player);
        }
    }

    private void playBasedOnSelection(int selection) throws IllegalArgumentException {
        if(selection == Selection.ROLL_DICE.ordinal()){
            playDiceRoll();
            return;
        }

        if(selection == Selection.GAIN_EFFECT.ordinal()){
            playGainEffect();
            return;
        }

        throw new IllegalArgumentException("Invalid selection");
    }

    private void playGainEffect() {
        Effect effect = effectFactory.getRandomEffect();
        playerCurrentlyPlaying.setEffect(effect);
        System.out.printf("Player %d gained effect %s\n", playerCurrentlyPlaying.getPlayerNumber(), effect.toString());
    }

    private void playDiceRoll() {
        int value = die.roll();
        playerCurrentlyPlaying.move(value);
    }

    private int getSelection() throws NumberFormatException{
        String selection = scanner.nextLine();
        return Integer.parseInt(selection);
    }

    private void printChoices(){
        System.out.println("------------");
        System.out.println(playerCurrentlyPlaying);
        System.out.println("Select 0 to roll the die or select 1 to gain a random effect");
        System.out.println("------------");
    }

    @Override
    boolean endOfGame() {
       for(Player p : players){
           if(playerHasReachedEnd(p)){
               return true;
           }
       }
       return false;
    }

    private boolean playerHasReachedEnd(Player player){
        return player.getCurrentPosition() >= gameLength;
    }





    @Override
    void printWinner() {
        Player winner = getWinner();
        System.out.printf("Player %d has reached the end!", winner.getPlayerNumber());
    }

    Player getWinner(){
        for(Player p : players){
            if(playerHasReachedEnd(p)){
                return p;
            }
        }
        throw new IllegalStateException("No winner found but game ended!");
    }
}
