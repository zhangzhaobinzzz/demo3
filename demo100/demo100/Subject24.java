package demo100;

import sun.security.ssl.HandshakeOutStream;

public class Subject24 {
    String brand;
    String type;

    public void sendInfo(){
        System.out.println("可以发短信");
    }
    public void call(){
        System.out.println("可以打电话");
    }
    public void info(){
        System.out.println("手机品牌是："+brand+"型号是："+type);
    }
    public static void main(String[] args) {
        CommonHandset sub=new CommonHandset();
        System.out.println("功能机");
        sub.brand="Nokia";
        sub.type="5230";
        sub.info();
        sub.play("音乐");
        sub.sendInfo();
        sub.call();
        System.out.println("************");
        System.out.println("智能机");

        SmartPhone sub1=new SmartPhone();
        System.out.println("智能机");
        sub1.brand="Apple";
        sub1.type="iphone13";
        sub1.info();
        sub1.net();
        sub1.play("视频");
        sub1.takePhoto();
        sub1.sendInfo();
        sub1.call();
    }
}

class CommonHandset extends Subject24 implements PlayWiring{
    @Override
    public void play(String content){
        System.out.println("可以播放"+content);
    }

}

class SmartPhone extends Subject24 implements NetWork,TakePhoto,PlayWiring{
    @Override
    public void play(String content) {
        System.out.println("可以播放"+content);

    }
    @Override
    public void takePhoto(){
        System.out.println("可以照相");
    }

    @Override
    public void net(){
        System.out.println("可以上网");
    }
}