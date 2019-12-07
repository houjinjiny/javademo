package com.game.runeland.pojo;

public class BlueRune extends Epigraph {
    private double maxLife;//最大生命
    private double backBloodPerFive;//每五秒回血
    private double moveSpeed;//移速
    private double adAttack;//物理攻击
    private String adSuckBlood;//物理吸血
    private double apAttack;//法术攻击
    private String apSuckBlood;//法术吸血
    private double apDefence;//法术防御
    private String criStrike;//暴击率
    static final String COLOR="蓝色";
    public BlueRune(){
    }//空参构造
    //有参构造
    public BlueRune(String name, String color, int level, String categore,double maxLife, double backBloodPerFive, double moveSpeed, double adAttack, String adSuckBlood, double apAttack, String apSuckBlood, double apDefence, String criStrike) {
        super(name, color, level, categore);
        this.maxLife = maxLife;
        this.backBloodPerFive = backBloodPerFive;
        this.moveSpeed = moveSpeed;
        this.adAttack = adAttack;
        this.adSuckBlood = adSuckBlood;
        this.apAttack = apAttack;
        this.apSuckBlood = apSuckBlood;
        this.apDefence = apDefence;
        this.criStrike = criStrike;
    }
    //get set方法

    public double getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(double maxLife) {
        this.maxLife = maxLife;
    }

    public double getBackBloodPerFive() {
        return backBloodPerFive;
    }

    public void setBackBloodPerFive(double backBloodPerFive) {
        this.backBloodPerFive = backBloodPerFive;
    }

    public double getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public double getAdAttack() {
        return adAttack;
    }

    public void setAdAttack(double adAttack) {
        this.adAttack = adAttack;
    }

    public String getAdSuckBlood() {
        return adSuckBlood;
    }

    public void setAdSuckBlood(String adSuckBlood) {
        this.adSuckBlood = adSuckBlood;
    }

    public double getApAttack() {
        return apAttack;
    }

    public void setApAttack(double apAttack) {
        this.apAttack = apAttack;
    }

    public String getApSuckBlood() {
        return apSuckBlood;
    }

    public void setApSuckBlood(String apSuckBlood) {
        this.apSuckBlood = apSuckBlood;
    }

    public double getApDefence() {
        return apDefence;
    }

    public void setApDefence(double apDefence) {
        this.apDefence = apDefence;
    }

    public String getCriStrike() {
        return criStrike;
    }

    public void setCriStrike(String criStrike) {
        this.criStrike = criStrike;
    }
}
