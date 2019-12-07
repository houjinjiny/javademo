package com.game.auction.dao;
import com.game.auction.pojo.Commodity;
import com.game.auction.pojo.Users;
public class UserDao {
    private static Users[] users;//存放用户
    private static Users u;//用户对象
    private static int[] capital;//存放用户余额的钱包
    private static double sum;//余额的和
    private static double sum2;//当前余额
    private static Commodity[] co;//存放物品的数组
    Commodity[] shopping=new Commodity[15];//购物车
    Commodity[] grabBag=new Commodity[100];//百宝囊
    private static double total;
    static {
        users=new Users[10];
        u=new Users();
        capital=new int[10];
        sum=0;
        sum2=0;
        co=new Commodity[15];
        total=0;
    }
    //商品信息
    {
        Commodity c1=new Commodity(1,"黄金白羊座",168.8,2,"张良皮肤");
        Commodity c2=new Commodity(2,"久胜战神",158.8,2,"干将莫邪皮肤");
        Commodity c3=new Commodity(3,"黄金狮子座",148.8,2,"达摩皮肤");
        Commodity c4=new Commodity(4,"冠军飞将",138.8,2,"花木兰皮肤");
        Commodity c5=new Commodity(5,"黄金射手座",128.8,2,"后羿皮肤");
        Commodity c6=new Commodity(6,"仲夏夜之梦",118.8,2,"貂蝉皮肤");
        Commodity c7=new Commodity(7,"凤求凰",108.8,2,"李白皮肤");
        Commodity c8=new Commodity(8,"末日机甲",178.8,2,"孙尚香皮肤");
        Commodity c9=new Commodity(9,"地狱火",188.8,2,"孙悟空皮肤");
        Commodity c10=new Commodity(10,"海洋之心",198.8,2,"武则天皮肤");
        Commodity c11=new Commodity(11,"无限星赏官",208.8,2,"公孙离皮肤");
        Commodity c12=new Commodity(12,"一生所爱",88.8,2,"露娜皮肤");
        Commodity c13=new Commodity(13,"大圣娶亲",98.8,2,"孙悟空情人节皮肤");
        Commodity c14=new Commodity(14,"逐浪之夏",78.8,2,"李元芳皮肤");
        Commodity c15=new Commodity(15,"舞动绿茵",68.8,2,"蔡文姬皮肤");
        co[0]=c1;
        co[1]=c2;
        co[2]=c3;
        co[3]=c4;
        co[4]=c5;
        co[5]=c6;
        co[6]=c7;
        co[7]=c8;
        co[8]=c9;
        co[9]=c10;
        co[10]=c11;
        co[11]=c12;
        co[12]=c13;
        co[13]=c14;
        co[14]=c15;
    }
    //查看当前用户是否存在
    public Users selectByuname(String uname){
        for (int i = 0; i <users.length ; i++) {
            if(users[i]!=null){
                if(users[i].getUname().equals(uname)){
                    return users[i];
                }
            }
        }
        return null;
    }
    //存储用户
    public int addUsers(Users u){
        for (int i = 0; i <users.length ; i++) {
            if(users[i]==null){
                users[i]=u;
                return 1;
            }
        }
        return 0;
    }
    //登录
    public Users login(String uname,String psd) {
        for (int i = 0; i <users.length ; i++) {
            if(users[i]!=null){
                if(users[i].getUname().equals(uname)&&users[i].getPassword().equals(psd)){
                    return users[i];
                }
            }
        }
        return null;
    }
    //充值
    public double reCharge(double recharge){
        for (int i = 0; i <users.length ; i++) {
            sum=users[i].getCapital();//获得充值前的余额
            sum=sum+recharge;//充值后的余额
            users[i].setCapital(sum);//把余额存进数组
            sum2=users[i].getCapital();//得到改变后的数组
            return sum2;
        }
        return -1;
    }
    //展示用户信息
    public void showUsers(){
        if(u.getCapital()<=500&&u.getCapital()>100){
            u.setIdentity("青铜");
        }else if(u.getCapital()<=1000&&u.getCapital()>500){
            u.setIdentity("白银");
        }else if(u.getCapital()<=1500&&u.getCapital()>1000){
            u.setIdentity("黄金");
        }else if(u.getCapital()<=2000&&u.getCapital()>1500){
            u.setIdentity("铂金");
        }else if(u.getCapital()<=2500&&u.getCapital()>2000){
            u.setIdentity("钻石");
        }else if(u.getCapital()<=3000&&u.getCapital()>2500){
            u.setIdentity("星耀");
        }else if(u.getCapital()>3000){
            u.setIdentity("王者");
        }
        System.out.println("当前用户的资金："+u.getCapital());
        System.out.println("身份级别："+u.getIdentity());
    }
    //展示全部商品信息
    public void showAll(){
    for (int i=0;i<co.length;i++){
        if(co[i]!=null){
            System.out.println("序号"+co[i].getOrdinal()+"  名称："+co[i].getCname()+"  价格："+co[i].getPrice()+
                    "  数量："+co[i].getNum() +"  描述："+co[i].getDescribe());
        }

        }
    }
    //查看商品详情
    public String showDescribe(int index){
        for (int i=0;i<co.length;i++){
            if(co[i].getOrdinal()==index){
               return "序号"+co[i].getOrdinal()+"  名称："+co[i].getCname()+"  价格："+co[i].getPrice()+
                       "  数量："+co[i].getNum() +"  描述："+co[i].getDescribe();
            }
        }
        return null;
    }
    //搜索商品
    public String search(String cname){
        for (int i=0;i<co.length;i++){
            if(co[i].getCname().equals(cname)){
                return "序号"+co[i].getOrdinal()+"  名称："+co[i].getCname()+"  价格："+co[i].getPrice()+
                        "  数量："+co[i].getNum() +"  描述："+co[i].getDescribe();
            }
        }
        return null;
    }
    //加入购物车
    public int shoppingCar(int index2){
        for(int i=0;i<shopping.length;i++){
            for (int j=0;j<co.length;j++){
                if(co[j]!=null){
                    if(co[j].getOrdinal()==index2){
                        if(shopping[i]==null){
                            shopping[i]=co[j];
                            co[j]=null;
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }
    //展示购物车
    public int showCar(){
        for (int i=0;i<shopping.length;i++){
            if(shopping[i]!=null){
                System.out.println("序号"+shopping[i].getOrdinal()+"  名称："+shopping[i].getCname()+"  价格："+shopping[i].getPrice()+
                        "  数量："+shopping[i].getNum() +"  描述："+shopping[i].getDescribe());
            }
        }
        return 0;
    }
    //结算模块
    public int  spend(){
        for (int i=0;i<shopping.length;i++){
            if(shopping[i]!=null){
                total=total+shopping[i].getPrice();
                if(sum2>=total){
                    sum2=sum2-total;
                    System.out.println("当前余额为："+sum2);
                    for (int j=0;j<shopping.length;j++){
                        if(shopping[j]!=null){
                            for(int k=0;k<grabBag.length;k++)
                                if (grabBag[k] == null) {
                                    grabBag[k] = shopping[j];
                                    shopping[j]=null;
                                    break;
                                }
                        }
                    }
                    return 1;
                }
                else {
                    System.out.println("余额不足请充值");
                    return 0;
                }
            }
        }
        return 0;
    }
//    public int spend(){
//       if(sum2>=total){
//           sum2=sum2-total;
//           System.out.println(sum2);
//           for (int j=0;j<shopping.length;j++){
//               if(shopping[j]!=null){
//                   for(int i=0;i<grabBag.length;i++)
//                       if (grabBag[i] == null) {
//                           grabBag[i] = shopping[j];
//                           shopping[i]=null;
//                           break;
//                       }
//               }
//           }
//            return 1;
//       }
//       else {
//           System.out.println("余额不足请充值");
//           return 0;
//       }
//    }
    //展示百宝箱
    public void showGraBag(){
        for (int i=0;i<grabBag.length;i++){
            if (grabBag[i]!=null){
                System.out.println("序号"+grabBag[i].getOrdinal()+"  名称："+grabBag[i].getCname()+"  价格："+grabBag[i].getPrice()+
                        "  数量："+grabBag[i].getNum() +"  描述："+grabBag[i].getDescribe());
            }
        }
    }
    //上架商品
    public void putaway(){
        if(sum2>500){
            for (int j=0;j<grabBag.length;j++){
                if(grabBag[j]!=null){
                    for(int i=0;i<co.length;i++)
                        if (co[i] == null) {
                            co[i] = grabBag[j];
                            grabBag[i]=null;
                            break;
                        }
                }
            }
        }
    }
    //排行榜
    public void sort(){
        for(int i=0;i<co.length-1;i++){
            for(int j=0;j<co.length-1-i;j++){
                Commodity t;
                if(co[j].getPrice()<co[j+1].getPrice()){
                    t=co[j];
                    co[j]=co[j+1];
                    co[j+1]=t;
                }
            }
        }
    }
    //
    public void showRankList(){
        for(int i=0;i<co.length;i++){
            System.out.println("序号"+co[i].getOrdinal()+"  名称："+co[i].getCname()+"  价格："+co[i].getPrice()+
                    "  数量："+co[i].getNum() +"  描述："+co[i].getDescribe());
        }
    }
}
