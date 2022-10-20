package org.scaler.entity;

import org.scaler.enums.Color;
import org.scaler.enums.PenType;
import org.scaler.strategies.writestrategy.WriteBehaviour;

public class FountainPen extends Pen implements RefilPen {
    public FountainPen(WriteBehaviour writeBehaviour){
        super(PenType.FOUNTAIN, writeBehaviour);
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public void write() {

    }

    @Override
    public Refil getRefil() {
        return null;
    }

    @Override
    public boolean canChangeRefil() {
        return false;
    }

    @Override
    public void changeRefil(Refil newRefil) {

    }
}
