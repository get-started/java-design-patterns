package com.getstarted;


import com.getstarted.elf.ElfArmy;
import com.getstarted.elf.ElfCastle;
import com.getstarted.elf.ElfKing;
import com.getstarted.elf.ElfKingdomFactory;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-1-17.
 */
public class ElfKingdomFactoryTest {

    private KingdomFactory kingdomFactory;

    @Before
    public void setUp() throws Exception {
        kingdomFactory = new ElfKingdomFactory();
    }

    @Test
    public void createCastle() throws Exception {
        Castle castle = kingdomFactory.createCastle();
        assertThat(castle, isA((Class) ElfCastle.class));
    }

    @Test
    public void createKing() throws Exception {
        King king = kingdomFactory.createKing();
        assertThat(king, isA((Class) ElfKing.class));
    }

    @Test
    public void createArmy() throws Exception {
        Army army = kingdomFactory.createArmy();
        assertThat(army, isA((Class) ElfArmy.class));
    }


}
