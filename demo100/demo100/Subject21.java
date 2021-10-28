package demo100;



public class Subject21 {
    public void speak(){
        System.out.println("地球人会说话");
    }

    public static void main(String[] args) {
        Person p=new Person();
        China c=new China();
        AM a=new AM();
        p.speak(c);
    }
}

class China extends Subject21{
    @Override
    public void speak(){
        System.out.println("中国人说汉语");
    }
}

class AM extends Subject21{
    @Override
    public void speak(){
        System.out.println("美国人说汉语");
    }
}
class Person{
    public void speak(Subject21 s){
        s.speak();
    }
}