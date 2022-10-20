package org.scaler.entity;

import org.scaler.entity.BallPen;
import org.scaler.entity.FountainPen;
import org.scaler.entity.GellPen;
import org.scaler.entity.Marker;

public class PenFactory {

    public static GellPen.Builder createGellPen() {
        return new GellPen.Builder();
    }

    public static BallPen createBallPen(){
        return null;
    }

    public static Marker createMarker(){
        return null;
    }

    public static FountainPen createFountainPen(){
        return null;
    }


}
