package org.example.pokemon;

public class ConcretePokemonVisitor implements PokemonVisitor{

    private Pokemon context;
    @Override
    public void visit(Charizard charizard) {
        int bonus = (int) (charizard.getBonusMultiplier() * 50);
        context.addBonusPoints(bonus);
        removeContext();
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        int bonus = (int) (charmeleon.getBonusMultiplier() * 20);
        context.addBonusPoints(bonus);
        removeContext();
    }

    @Override
    public void visit(Charmander charmander) {
        int bonus = (int) (charmander.getBonusMultiplier() * 10);
        context.addBonusPoints(bonus);
        removeContext();
    }

    private void removeContext(){
        this.context = null;
    }

    @Override
    public void setContext(Pokemon context) {
        this.context = context;
    }
}
