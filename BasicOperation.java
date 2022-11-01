public class BasicOperation extends Operations{
    public void subtraction(int a, int b){
        System.out.println("Subtraction: " + (a - b));
    }

    public static void main(String[] args) {
        BasicOperation bo = new BasicOperation();
        bo.subtraction( 4, 3);
        bo.add(1,6);
        bo.multiply(2, 3);
        bo.square(5);

    }

    @Override
    public void square(int a) {
        System.out.println("Square root: " + (a * a));
    }
}
