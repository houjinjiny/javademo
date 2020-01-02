package com.game.garbagesorting;

public class KgContainer extends WasteContainer {
    public KgContainer(){}
    String ccategory="厨余垃圾";
    public KgContainer(String cname,int contains){
        this.cname=cname;
        this.contains=contains;
    }
    @Override
    public void disposeRubbish() {

    }
}
