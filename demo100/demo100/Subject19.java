package demo100;

public class Subject19 {
    public String pizza(){
        String pizza="披萨";
        System.out.println(pizza);
        return pizza;
    }

    public static void main(String[] args) {
        cheesePizza cp=new cheesePizza();
        System.out.println("做一个"+cp.pizza());

        BeefPizza bp=new BeefPizza();
        System.out.println("做一个"+bp.pizza());
    }
}

class cheesePizza extends Subject19{
    @Override
    public String pizza() {
        String pizza="芝士披萨";
        return pizza;
    }
}

class BeefPizza extends Subject19{
    @Override
    public String pizza() {
        String pizza="牛肉披萨";
        return pizza;
    }
}