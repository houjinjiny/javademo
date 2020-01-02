package com.game.garbagesorting;

public class HwContainer extends WasteContainer {
    public HwContainer() {
    }
    String ccategory="有害垃圾";
    public HwContainer(String cname,int contains){
        this.cname=cname;
        this.contains=contains;
    }
    @Override
    public void disposeRubbish() {

    }
}
