package org.scaler.entity;

import org.scaler.enums.Color;
import org.scaler.enums.PenType;
import org.scaler.strategies.writestrategy.SmoothWriteBehaviour;
import org.scaler.strategies.writestrategy.WriteBehaviour;

public class GellPen extends Pen implements RefilPen {

    private Refil refil;
    private boolean canChangeRefil;

    private GellPen(WriteBehaviour writeBehaviour){
        super(PenType.GELL, writeBehaviour);
    }

    public static class Builder{
        private Refil refil;
        private boolean canChangeRefill = false;

        public Builder setRefil(Refil refil){
            this.refil = refil;
            return this;
        }

        public Builder setCanChangeRefil(boolean value){
            this.canChangeRefill = value;
            return this;
        }

        public GellPen build(){
            GellPen gellPen = new GellPen(new SmoothWriteBehaviour());
            gellPen.refil = this.refil;
            gellPen.canChangeRefil = this.canChangeRefill;
            return gellPen;
        }
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
        return this.refil;
    }

    @Override
    public boolean canChangeRefil() {
        return this.canChangeRefil;
    }

    @Override
    public void changeRefil(Refil newRefil) {

    }
}
