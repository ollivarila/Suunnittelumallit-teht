package org.example.pokemon;

public interface PokemonVisitor {

    void visit(Charizard charizard);
    void visit(Charmeleon charmeleon);
    void visit(Charmander charmander);
    void setContext(Pokemon context);
}
