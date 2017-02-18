package com.pokemonfantasy.entity;

import java.util.List;

/**
 * Created by Vang Lee on 2/17/17.
 */
public class Battle {
    private Pokemon pokemonOne;
    private Pokemon pokemonTwo;

    public Battle(Pokemon pokemonOne, Pokemon pokemonTwo) {
        this.pokemonOne = pokemonOne;
        this.pokemonTwo = pokemonTwo;
    }

    private void enhanceAtkByType() {
        for (Type pOne_type : pokemonOne.getTypes()) {
            for(Type pTwo_type : pokemonTwo.getTypes()) {
                if (pOne_type == Type.BUG || pOne_type == Type.GRASS && pTwo_type == Type.FIRE) {

                }
            }
        }
    }

}
