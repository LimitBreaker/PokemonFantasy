package com.pokemonfantasy.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by student on 2/11/17.
 */
@Entity
@Table(name="move")
public class Move {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "move_id")
    private int moveId;

    @Column(name="move_name")
    private String moveName;

    @Column(name="move_type")
    private int moveType;

    @Column(name="move_power")
    private int movePower;

    @Column(name="move_pp")
    private int movePP;

    public Move() {

    }

    public Move(String name, int type, int power, int pp) {
        this.moveName = name;
        this.moveType = type;
        this.movePower = power;
        this.movePP = pp;
    }

    public int getMoveId() { return this.moveId; }
    public String getMoveName() { return this.moveName; }
    public int getMoveType() { return this.moveType; }
    public int getMovePower() { return this.movePower; }
    public int getMovePP() { return this.movePP; }

    public Type typeName() { return null; }
}
