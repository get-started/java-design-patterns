package com.getstarted.elf;

import com.getstarted.Army;
import com.getstarted.Castle;
import com.getstarted.King;
import com.getstarted.KingdomFactory;

/**
 * Created by L.x on 15-1-17.
 */
public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
