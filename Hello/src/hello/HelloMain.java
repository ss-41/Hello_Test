package hello;

public class HelloMain {

	public static void main(String[] args) {
		System.out.println("Hello!");
		System.out.println("-----");

		Hello hello = new Hello();
		System.out.println(hello.talk());

	}
}
