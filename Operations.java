public abstract class Operations {
    public void add(int a, int b){
    System.out.println("Addition: " + (a + b));
    }
    public void multiply(int a, int b){
        System.out.println("Multiply: " + (a * b));
    }
    public void division(int a, int b){
        System.out.println("Division: " + (a / b));
    }
    public abstract void square(int a);
}
