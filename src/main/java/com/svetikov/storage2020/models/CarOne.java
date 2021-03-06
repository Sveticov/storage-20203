package com.svetikov.storage2020.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class CarOne extends Car{


    public CarOne(int positionX, int positionZ,boolean busy) {
        super(positionX, positionZ,busy);
    }

    public CarOne() {
        super();
    }

    @Override
    public int getPositionX() {
        return super.getPositionX();
    }

    @Override
    public void setPositionX(int positionX) {
        super.setPositionX(positionX);
    }

    @Override
    public int getPositionZ() {
        return super.getPositionZ();
    }

    @Override
    public void setPositionZ(int positionZ) {
        super.setPositionZ(positionZ);
    }

    @Override
    public boolean isBusy() {
        return super.isBusy();
    }

    @Override
    public void setBusy(boolean busy) {
        super.setBusy(busy);
    }
}
