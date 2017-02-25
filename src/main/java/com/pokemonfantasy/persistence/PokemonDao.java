package com.pokemonfantasy.persistence;

import com.pokemonfantasy.entity.Pokemon;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by student on 2/24/17.
 */
public class PokemonDao extends GenericDao {

    private final Logger logger = Logger.getLogger(this.getClass());

    public PokemonDao() { super(Pokemon.class); }

}
