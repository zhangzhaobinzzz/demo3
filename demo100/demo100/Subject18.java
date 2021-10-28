package demo100;



public abstract class Subject18 {
    public abstract void fruit();
    public static void main(String[] args) {
        Banana b=new Banana();
        b.fruit();

        Apple a=new Apple();
        a.fruit();

    }
}

class Banana extends Subject18{
    @Override
    public void fruit() {
        System.out.println("结出一个香蕉");
    }
}
class Apple extends Subject18{
    @Override
    public void fruit(){
        System.out.println("结出一个苹果");
    }
}
