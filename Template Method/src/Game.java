public abstract class Game {
        protected int playersCount;

        abstract void initializeGame();

        abstract void makePlay(int player);

        abstract boolean endOfGame();

        abstract void printWinner();

        public final void playOneGame() {
            initializeGame();
            int j = 0;
            while (!endOfGame()){
                makePlay(j);
                j = (j + 1) % playersCount;
            }
            printWinner();
        }
}