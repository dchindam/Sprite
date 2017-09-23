package myfirstmaven.HelloMaven;

public class App {
	public static void main(String[] args) {

		System.out.println(getHelloDivya());
		//System.out.println(getHelloName("D"));

	}

	public static String getHelloDivya() {

		return "Hello Divya";

	}

	public static String getHelloDSC() {

		return "Hello Divya Sri Chindam";

	}
	
	public static String getHelloName(String name) {

		name = name + "ivya";
		return "Hello " + name;

	}
}
