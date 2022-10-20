package org.scaler.entity;

public interface RefilPen {
    Refil getRefil();
    boolean canChangeRefil();
    void changeRefil(Refil newRefil);
}
