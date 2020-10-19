public class Mainclass {
    public static void main(String[] args) {

        StackQueue obj = new StackQueue();
        obj.push(70);
        obj.push(30);
        obj.push(56);
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek()); //UC2

        obj.pop(); // UC 2
        obj.display();
    }
}
