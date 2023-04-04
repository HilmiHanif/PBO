package array;

import java.util.Scanner;

public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return (rear+1)%size == front;
    }

    public void enqueue(int x) {
        if(isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        else if(isEmpty()) {
            front = rear = 0;
        }
        else {
            rear = (rear+1)%size;
        }
        queue[rear] = x;
    }

    public int dequeue() {
        int x;
        if(isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        else if(front == rear) {
            x = queue[front];
            front = rear = -1;
        }
        else {
            x = queue[front];
            front = (front+1)%size;
        }
        return x;
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i;
        for(i = front; i != rear; i = (i+1)%size) {
            System.out.print(queue[i] + " ");
        }
        System.out.print(queue[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of queue: ");
        int size = sc.nextInt();
        Queue q = new Queue(size);

        while(true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display queue");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int x = sc.nextInt();
                    q.enqueue(x);
                    break;
                case 2:
                    int y = q.dequeue();
                    if(y != -1) {
                        System.out.println("Dequeued element: " + y);
                    }
                    break;
                case 3:
                    System.out.print("Queue: ");
                    q.display();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
