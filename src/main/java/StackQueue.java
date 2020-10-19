import static java.lang.System.exit;

public class StackQueue {
    Node top;
    StackQueue()
    {
        this.top = null;
    }
    // UserCase 1
    // insert at the beginning
    public void push(int x) {
        Node temp = new Node();


            if (temp == null) {
                System.out.println("Heap Overflow");
                return;
            }

            temp.data = x;

            temp.link = top;

            top = temp;
        }
        public void display()
        {
            if (top == null) {
                System.out.println("Stack Underflow");
                exit(1);
            } else {
                Node temp = top;
                while (temp != null) {

                    System.out.printf("%d-->", temp.data);

                    temp = temp.link;
                }
            }

        }
    }