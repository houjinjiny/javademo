package com.game.runeland.pojo;

public class OrangeRune extends Epigraph {
    private double adAttack;//物理攻击
    private double apAttack;//法术攻击
    private String attackSpeed;//攻速
    private String criStrike;//暴击率
    private double adThrough;//物理穿透
    private String criEffect;//暴击效果
    private double maxLive;//最大生命
    private String apThrough;//法术穿透
    private String adSuckBlood;//物理吸血
    private double adDefence;//物理防御
    static final String COLOR="橙色";
    //空参构造
    public OrangeRune(){}
    //有参构造
    public OrangeRune(String name, String color, int level, String categore, double adAttack, double apAttack, String attackSpeed, String criStrike, double adThrough, String criEffect, double maxLive, String apThrough, String adSuckBlood, double adDefence) {
        super(name, color, level, categore);
        this.adAttack = adAttack;
        this.apAttack = apAttack;
        this.attackSpeed = attackSpeed;
        this.criStrike = criStrike;
        this.adThrough = adThrough;
        this.criEffect = criEffect;
        this.maxLive = maxLive;
        this.apThrough = apThrough;
        this.adSuckBlood = adSuckBlood;
        this.adDefence = adDefence;
    }
    //set get

    public double getAdAttack() {
        return adAttack;
    }

    public void setAdAttack(double adAttack) {
        this.adAttack = adAttack;
    }

    public double getApAttack() {
        return apAttack;
    }

    public void setApAttack(double apAttack) {
        this.apAttack = apAttack;
    }

    public String getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(String attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public String getCriStrike() {
        return criStrike;
    }

    public void setCriStrike(String criStrike) {
        this.criStrike = criStrike;
    }

    public double getAdThrough() {
        return adThrough;
    }

    public void setAdThrough(double adThrough) {
        this.adThrough = adThrough;
    }

    public String getCriEffect() {
        return criEffect;
    }

    public void setCriEffect(String criEffect) {
        this.criEffect = criEffect;
    }

    public double getMaxLive() {
        return maxLive;
    }

    public void setMaxLive(double maxLive) {
        this.maxLive = maxLive;
    }

    public String getApThrough() {
        return apThrough;
    }

    public void setApThrough(String apThrough) {
        this.apThrough = apThrough;
    }

    public String getAdSuckBlood() {
        return adSuckBlood;
    }

    public void setAdSuckBlood(String adSuckBlood) {
        this.adSuckBlood = adSuckBlood;
    }

    public double getAdDefence() {
        return adDefence;
    }

    public void setAdDefence(double adDefence) {
        this.adDefence = adDefence;
    }
}
