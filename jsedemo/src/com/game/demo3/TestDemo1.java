package com.game.demo3;

import com.game.demo3.Animal;
import com.game.demo3.User;

import java.util.Scanner;

public class TestDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Animal[] aarr=new Animal[40];
        Animal a1=new Animal("辉夜姬","火","蓬莱玉枝");
        aarr[0]=a1;
        Animal a2=new Animal("花鸟卷","火","归鸟");
        aarr[1]=a2;
        Animal a3=new Animal("一目连","火","风符·破");
        aarr[2]=a3;
        Animal a4=new Animal("大天狗","火","风袭");
        aarr[3]=a4;
        Animal a5=new Animal("青行灯","火","幽火");
        aarr[4]=a5;
        Animal a6=new Animal("酒吞","火","鬼葫芦");
        aarr[5]=a6;
        Animal a7=new Animal("茨木","火","黒焰");
        aarr[6]=a7;
        Animal a8=new Animal("妖刀姬","火","连斩");
        aarr[7]=a8;
        Animal a9=new Animal("小鹿男","金","神之力");
        aarr[8]=a9;
        Animal a10=new Animal("荒","金","星轨");
        aarr[9]=a10;
        Animal a11=new Animal("彼岸花","金","死亡之花");
        aarr[10]=a11;
        Animal a12=new Animal("雪童子","金","雪走");
        aarr[11]=a12;
        Animal a13=new Animal("玉藻前","金","狐之面");
        aarr[12]=a13;
        Animal a14=new Animal("奴良陆生","金","镜花水月");
        aarr[13]=a14;
        Animal a15=new Animal("御馔津","金","一失");
        aarr[14]=a15;
        Animal a16=new Animal("卖药郎","金","道吾之真理");
        aarr[15]=a16;
        Animal a17=new Animal("鬼灯","木","锤击");
        aarr[16]=a17;
        Animal a18=new Animal("面灵气","木","注灵");
        aarr[17]=a18;
        Animal a19=new Animal("犬夜叉","木","爆流破");
        aarr[18]=a19;
        Animal a20=new Animal("杀生丸","木","毒化爪");
        aarr[19]=a20;
        Animal a21=new Animal("鬼切","木","鬼斩");
        aarr[20]=a21;
        Animal a22=new Animal("白藏主","木","炎影");
        aarr[21]=a22;
        Animal a23=new Animal("桔梗","木","灵力迸发");
        aarr[22]=a23;
        Animal a24=new Animal("书翁","木","云游");
        aarr[23]=a24;
        Animal a25=new Animal("青坊主","水","无量");
        aarr[24]=a25;
        Animal a26=new Animal("白童子","水","不灭");
        aarr[25]=a26;
        Animal a27=new Animal("黑童子","水","罪罚黑");
        aarr[26]=a27;
        Animal a28=new Animal("般若","水","鬼之假面");
        aarr[27]=a28;
        Animal a29=new Animal("姑获鸟","水","伞剑");
        aarr[28]=a29;
        Animal a30=new Animal("妖琴师","水","惊弦");
        aarr[29]=a30;
        Animal a31=new Animal("白狼","水","文射");
        aarr[30]=a31;
        Animal a32=new Animal("吸血姬","水","血袭");
        aarr[31]=a32;
        Animal a33=new Animal("桃花妖","土","花舞");
        aarr[32]=a33;
        Animal a34=new Animal("海坊主","土","青龙卷");
        aarr[33]=a34;
        Animal a35=new Animal("食梦貘","土","入眠");
        aarr[34]=a35;
        Animal a36=new Animal("傀儡师","土","傀儡出击");
        aarr[35]=a36;
        Animal a37=new Animal("孟婆","土","药汤");
        aarr[36]=a37;
        Animal a38=new Animal("骨女","土","骨刺");
        aarr[37]=a38;
        Animal a39=new Animal("犬神","土","心斩");
        aarr[38]=a39;
        Animal a40=new Animal("金鱼姬","土","扇舞");
        aarr[39]=a40;
        //进入仙境
        System.out.println("请输入：姓名 门派 性别 年龄");
        String uname=sc.next();
        String mp=sc.next();
        String sex=sc.next();
        int age=sc.nextInt();
        User[] uarr=new User[200];
        String[] mps=new String[4];
        int a=join(uname,mp,sex,age,uarr,mps);
        if(a==-1){
            System.out.println("无法进入灵境");
        }
        if(a==1){
            //选择灵兽
            int c=getAnimal(aarr);
            while (c==-1){
                getAnimal(aarr);
            }
            if(c==1){
                System.out.println("可以离开了！");
            }

        }


    }
    //进入仙境
    public static int join(String uname,String mp,String sex,int age,User[] uarr,String[] mps) {
        User u = new User();
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        u.uname = uname;
        u.mp = mp;
        u.sex = sex;
        u.age = age;
        for (int i=0;i<uarr.length;i++){
            if(uarr[i]==null){
                if(u.age>10&&u.age<30){
                    if(mps[0]==null||uarr[i].mp.equals(mps[0])){
                        if(count1<=10){
                            uarr[i]=u;
                            count1=count1+1;
                            return 1;
                        }
                    }else if(mps[1]==null||uarr[i].mp.equals(mps[1])){
                        if(count2<=10){
                            uarr[i]=u;
                            count2=count2+1;
                            return 1;
                        }
                    }else if(mps[2]==null||uarr[i].mp.equals(mps[2])){
                        if(count3<=10){
                            uarr[i]=u;
                            count3=count3+1;
                            return 1;
                        }
                    }else if(mps[3]==null||uarr[i].mp.equals(mps[3])) {
                        if (count4 <= 10) {
                            uarr[i] = u;
                            count4 = count4 + 1;
                            return 1;
                        }
                    }else{
                        return -1;
                    }
                }
            }
        }
        return -1;
    }
    //选择神兽
    public static int getAnimal(Animal[] aarr){
        Animal a=new Animal();
        Scanner sc2=new Scanner(System.in);
        for(int i=0;i<aarr.length;i++){
            System.out.println("灵兽序号为"+(i+1)+"灵兽姓名："+aarr[i].anme+"灵兽属性："+aarr[i].shuxing+"灵兽独有技能"+aarr[i].dskills);
        }
        System.out.println("请输入灵兽的序号：");
        int m=sc2.nextInt();
        double d = Math.random()*10;
        int n =(int) Math.round(d);
        a.abliity=n;
        if(n>=0&&n<=3){
            a.grade="一般";
        }else if(n>=4&&n<=6){
            a.grade="中等";
        }else if(n>=7&&n<=9){
            a.grade="优秀";
        }else if(n==10){
            a.grade="极品";
        }
        System.out.println("需要我的帮助吗？需要选1 不需要选2");
        Scanner sc1=new Scanner(System.in);
        int answer=sc1.nextInt();
        if(answer==1){
            System.out.println("恭喜获得神兽");
            System.out.println("灵兽序号为"+m+"灵兽姓名："+aarr[m].anme+"灵兽属性："+aarr[m].shuxing+"灵兽的能力值"+a.abliity+"灵兽的等级"+a.grade+"灵兽独有技能"+aarr[m].dskills);
            return 1;
        }
        else {
            System.out.println("请重新选择");
        }
        return -1;
    }
}
