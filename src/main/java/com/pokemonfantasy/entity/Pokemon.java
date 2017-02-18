package com.pokemonfantasy.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by student on 2/11/17.
 */
@Entity
@Table(name="pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "pk_id")
    private int pokemonId;

    @Column(name="pk_name")
    private String pokemonName;

    @Column(name="pk_description")
    private String pokemonDescription;

    @Column(name="pk_generation")
    private int pokemonGeneration;

    @Column(name="pk_hp")
    private int pokemonHealth;

    @Column(name="pk_atk")
    private int pokemonAttack;

    @Column(name="pk_def")
    private int pokemonDefense;

    @Column(name="pk_spatk")
    private int pokemonSpecialAttack;

    @Column(name="pk_spdef")
    private int pokemonSpecialDefense;

    @Column(name="pk_speed")
    private int pokemonSpeed;

    private Status status;

    private List<Type> types;

    public Pokemon() {}

    public Pokemon(int id, String name, String description, int generation, int health, int attack, int defense, int spAttack,
                   int spDefense, int speed, List<Type> types) {
        this.pokemonName = name;
        this.pokemonDescription = description;
        this.pokemonGeneration = generation;
        this.pokemonHealth = health;
        this.pokemonAttack = attack;
        this.pokemonDefense = defense;
        this.pokemonSpecialAttack = spAttack;
        this.pokemonSpecialDefense = spDefense;
        this.pokemonSpeed = speed;
        this.status = Status.NORMAL;
        this.types = types;
    }

    public int getPokemonId() { return this.pokemonId; }
    public String getPokemonName() { return this.pokemonName; }
    public String getPokemonDescription() { return this.pokemonDescription; }
    public int getPokemonGeneration() { return this.pokemonGeneration; }
    public int getPokemonHealth(){ return this.pokemonHealth; }
    public int getPokemonAttack() { return this.pokemonAttack; }
    public int getPokemonDefense() { return this.pokemonDefense; }
    public int getPokemonSpecialAttack() { return this.pokemonSpecialAttack; }
    public int getPokemonSpecialDefense() { return this.pokemonSpecialDefense; }
    public int getPokemonSpeed() { return this.pokemonSpeed; }
    public Status getStatus() { return this.status; }
    public List<Type> getTypes() { return this.types; }



    public void takeDamage(Pokemon pokemon) {
        int damage = 0;

        if (this.pokemonDefense < pokemon.getPokemonAttack()) {
            damage = pokemon.getPokemonAttack() - this.pokemonDefense;
        } else {
            damage = this.pokemonDefense - pokemon.getPokemonAttack();
        }

        if (this.pokemonHealth < damage) {
            this.pokemonHealth = 0;
            this.status = Status.FAINTED;
        } else {
            this.pokemonHealth = getPokemonHealth() - damage;
        }
    }

    public void recieveCommand(Move move) {

    }
    private void enhance(Move move) {
        int enhancement = 0;
    }
    private void attack(Move move) {
        this.pokemonAttack =  getPokemonAttack() + move.getMovePower();
    }

}
