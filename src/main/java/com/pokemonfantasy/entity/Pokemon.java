package com.pokemonfantasy.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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

    public Pokemon() {}

    public Pokemon(String name, String description, int generation, int health, int attack, int defense, int spAttack,
                   int spDefense, int speed) {
        this.pokemonName = name;
        this.pokemonDescription = description;
        this.pokemonGeneration = generation;
        this.pokemonHealth = health;
        this.pokemonAttack = attack;
        this.pokemonDefense = defense;
        this.pokemonSpecialAttack = spAttack;
        this.pokemonSpecialDefense = spDefense;
        this.pokemonSpeed = speed;
    }

}
