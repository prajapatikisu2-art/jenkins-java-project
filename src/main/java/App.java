
public class App {
    public String greet() {
        return "Hello, Jenkins CI Updated!";
    }

    public static void main(String[] args) {
        System.out.println(new App().greet());
    }
}
