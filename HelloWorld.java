import java.util.ArrayList;
import java.util.List;

public class HelloWorld{
	public static void main(String[] args){
		Object obj1=new Object();
		Object obj2=obj1;
		System.out.println(obj1);
		System.out.println(obj1.getClass()==obj2.getClass());

		List<Integer> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();


	}
}

