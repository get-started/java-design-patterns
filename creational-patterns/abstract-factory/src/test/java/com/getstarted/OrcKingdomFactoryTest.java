package com.getstarted;

import com.getstarted.orc.OrcArmy;
import com.getstarted.orc.OrcCastle;
import com.getstarted.orc.OrcKing;
import com.getstarted.orc.OrcKingdomFactory;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-1-17.
 */
public class OrcKingdomFactoryTest {

    private KingdomFactory kingdomFactory;

    @Before
    public void setUp() throws Exception {
        kingdomFactory = new OrcKingdomFactory();
    }

    @Test
    public void createCastle() throws Exception {
        Castle castle = kingdomFactory.createCastle();
        assertThat(castle, isA((Class) OrcCastle.class));
    }

    @Test
    public void createKing() throws Exception {
        King king = kingdomFactory.createKing();
        assertThat(king, isA((Class) OrcKing.class));
    }

    @Test
    public void createArmy() throws Exception {
        Army army = kingdomFactory.createArmy();
        assertThat(army, isA((Class) OrcArmy.class));
    }


}
