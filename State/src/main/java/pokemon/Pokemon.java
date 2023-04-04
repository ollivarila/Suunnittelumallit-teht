package pokemon;

public class Pokemon{

    private int health;
    private int xpRequired;
    private PokemonState state;
    public Pokemon(PokemonState initialState){
        this.state = initialState;
        this.xpRequired = initialState.getXpRequired();
        this.health = initialState.getMaxHealth();
    }

    public void gainXp(int amount){
        xpRequired -= amount;
    }

    public void attack(){
        this.state.dealDamage(this);
    }

    public void takeDamage(){
        this.state.takeDamage(this, 10);
    }

    protected void changeState(PokemonState state){
        this.state = state;
        this.health = state.getMaxHealth();
        this.xpRequired = state.getXpRequired();
        System.out.println("Evolved to " + state.getName());
    }

    public int getXpRequired() {
        return xpRequired;
    }

    public void setXpRequired(int xpRequired) {
        this.xpRequired = xpRequired;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
