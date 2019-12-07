package com.game.runeland.pojo;

public class GreenRune extends Epigraph {
    private double adAttack;//物理攻击
    private double adThrough;//物理穿透
    private double adDefence;//物理防御
    private double apDefence;//法术防御
    private double apAttack;//法术攻击
    private double apThrough;//法术穿透
    private String cd;//冷却减缩
    private double lifeBack;//生命回复
    private String apSuckBlood;//法术吸血
    private double attackSpeed;//攻速
    static final String COLOR="绿色";
    //无参构造
    public GreenRune(){}
    //有参构造
    public GreenRune(String name, String color, int level, String categore, double adAttack, double adThrough, double adDefence, double apDefence, double apAttack, double apThrough, String cd, double lifeBack, String apSuckBlood, double attackSpeed) {
        super(name, color, level, categore);
        this.adAttack = adAttack;
        this.adThrough = adThrough;
        this.adDefence = adDefence;
        this.apDefence = apDefence;
        this.apAttack = apAttack;
        this.apThrough = apThrough;
        this.cd = cd;
        this.lifeBack = lifeBack;
        this.apSuckBlood = apSuckBlood;
        this.attackSpeed = attackSpeed;
    }
    //set get

    public double getAdAttack() {
        return adAttack;
    }

    public void setAdAttack(double adAttack) {
        this.adAttack = adAttack;
    }

    public double getAdThrough() {
        return adThrough;
    }

    public void setAdThrough(double adThrough) {
        this.adThrough = adThrough;
    }

    public double getAdDefence() {
        return adDefence;
    }

    public void setAdDefence(double adDefence) {
        this.adDefence = adDefence;
    }

    public double getApDefence() {
        return apDefence;
    }

    public void setApDefence(double apDefence) {
        this.apDefence = apDefence;
    }

    public double getApAttack() {
        return apAttack;
    }

    public void setApAttack(double apAttack) {
        this.apAttack = apAttack;
    }

    public double getApThrough() {
        return apThrough;
    }

    public void setApThrough(double apThrough) {
        this.apThrough = apThrough;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public double getLifeBack() {
        return lifeBack;
    }

    public void setLifeBack(double lifeBack) {
        this.lifeBack = lifeBack;
    }

    public String getApSuckBlood() {
        return apSuckBlood;
    }

    public void setApSuckBlood(String apSuckBlood) {
        this.apSuckBlood = apSuckBlood;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
}
