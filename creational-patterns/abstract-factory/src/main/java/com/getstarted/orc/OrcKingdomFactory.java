package com.getstarted.orc;

import com.getstarted.Army;
import com.getstarted.Castle;
import com.getstarted.King;
import com.getstarted.KingdomFactory;

/**
 * Created by L.x on 15-1-17.
 */
public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
