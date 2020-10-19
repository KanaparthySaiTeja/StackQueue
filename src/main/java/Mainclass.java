public class Mainclass {
    public static void main(String[] args) {
/*
        StackQueue obj = new StackQueue();
        obj.push(70);
        obj.push(30);
        obj.push(56);
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek()); //UC2

        obj.pop(); // UC 2
        obj.display();*/

        //uc3
        StackQueue.Queue q = new StackQueue.Queue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        //System.out.println("Queue is: "+q);
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}
