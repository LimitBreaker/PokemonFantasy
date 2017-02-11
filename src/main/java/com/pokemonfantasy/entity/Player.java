package com.pokemonfantasy.entity;

import com.pokemonfantasy.persistence.LocalDateAttributeConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by student on 2/11/17.
 */
@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "p_id")
    private int playerId;

    @Column(name="p_username")
    private String playerUsername;

    @Column(name="p_password")
    private String playerPassword;

    @Column(name="p_email")
    private String playerEmail;

    @Column(name="p_gender")
    private Gender playerGender;

    @Column(name="p_joined")
    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate playerJoined;

    @Column(name="p_canceled")
    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate playerCanceled;

    @Column(name="p_world_rank")
    private double worldRank;

    public Player() {

    }

    public Player(String username, String password, String email, int gender, LocalDate joined ) {
        this.playerUsername = username;
        this.playerPassword = password;
        this.playerEmail = email;
        this.playerJoined = joined;
    }

    public String getPlayerUsername() { return this.playerUsername; }

    public String getPlayerPassword() { return this.playerPassword; }

    public String getPlayerEmail() { return this.playerEmail; }
    @Enumerated(EnumType.ORDINAL)
    public Gender getPlayerGender() { return this.playerGender; }

    private void setWorldRank(double rank) { this.worldRank = rank; }
    public double getWorldRank() { return this.worldRank; }

    public void calculatePlayerWorldRank() {

    }
}
