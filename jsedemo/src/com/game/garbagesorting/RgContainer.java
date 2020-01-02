package com.game.garbagesorting;

public class RgContainer extends WasteContainer {
    public RgContainer() {
    }
    String ccategory="可回收垃圾";
    public RgContainer(String cname,int contains){
        this.cname=cname;
        this.contains=contains;
    }

    @Override
    public void disposeRubbish() {

    }
}
