import java.io.IOException;
import java.lang.reflect.Method;


public class test {
	public static void main(String[] args){
		String coucou = "Hello World !";
		System.out.print(coucou+"\n\n");
		Class tClass = coucou.getClass();
		System.out.println(tClass.getName()+"\n\n");
		Method[] methods = tClass.getMethods();
		for (int i = 0; i < methods.length; i++) {
			String s = methods[i].toString();
			System.out.println(methods[i].getName());
			//System.out.println("public method: " + s);
		}
			System.out.println(String.valueOf( methods.length ) );
	}
}