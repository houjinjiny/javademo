package com.game.garbagesorting;

public class OwContainer extends WasteContainer {
    public OwContainer(){}
    String ccategory="其他垃圾";
    public OwContainer(String cname,int contains){
        this.cname=cname;
        this.contains=contains;
    }
    @Override
    public void disposeRubbish() {

    }
}
