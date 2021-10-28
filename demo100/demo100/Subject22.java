package demo100;

public class Subject22 {
    public Tree getTree(String s){
        Tree n=null;
        if (s.equals("苹果")){
            n=new AppleTree();
        }else if(s.equals("香蕉")){
            n=new BananaTree();
        }
        return n;
    }

    public static void main(String[] args) {
        Subject22 sub=new Subject22();
        String s="苹果";
        Tree n=sub.getTree(s);
        n.show();
    }
}
class Tree{
    public void show(){
        System.out.println("树木");
    }
}

class AppleTree extends Tree{
    @Override
    public void show(){
        System.out.println("苹果");
    }
}

class BananaTree extends Tree{
    @Override
    public void show(){
        System.out.println("香蕉");
    }
}