package Day06 ;

public class funcInterface {
    @FunctionalInterface
    interface Greeting {
        void sayHello(String name);

        default void sayBye() {
            System.out.println("Goodbye");
        }
    }

    public static void main(String[] args) {
	    Greeting g=(name) -> System.out.println("Hello, " + name + "!");
	    g.sayHello("UB");
	    g.sayBye();
	}
}