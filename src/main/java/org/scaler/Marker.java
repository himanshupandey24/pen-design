package org.scaler;

public class Marker extends Pen{

    public Marker(){
        super(PenType.MARKER);
    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public void write() {

    }
}
