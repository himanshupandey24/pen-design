package org.scaler;

import org.scaler.entity.GellPen;
import org.scaler.entity.Pen;
import org.scaler.entity.PenFactory;
import org.scaler.entity.Refil;
import org.scaler.enums.PenType;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Pen> pens = new ArrayList<>();
        for(Pen pen : pens){
            if(pen.getPenType().equals(PenType.GELL)){

            }
        }

        GellPen gellPen = PenFactory
                .createGellPen()
                .setCanChangeRefil(true)
                .setRefil(new Refil())
                .build();

    }
}