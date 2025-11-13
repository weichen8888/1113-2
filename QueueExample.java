import java.util.LinkedList;

// -----------------------------------
// MyQueue 類別（符合測試要求）
// -----------------------------------
class MyQueue<T> extends LinkedList<T> {

    public MyQueue() {
        super();
    }

    // 將元素加入佇列尾端
    public void enqueue(T item) {
        addLast(item);
    }

    // 取出佇列前端元素並回傳
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return removeFirst();
    }

    // 檢查佇列是否為空
    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // 回傳佇列中元素數量
    @Override
    public int size() {
        return super.size();
    }
}

// -----------------------------------
// 測試物件 Person（JUnit 會使用）
// -----------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// -----------------------------------
// 主程式，用來自行測試
// -----------------------------------
public class QueueExample {
    public static void main(String[] args) {
        MyQueue<Integer> intQueue = new MyQueue<>();
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);

        System.out.println("Queue size: " + intQueue.size());
        System.out.println("Dequeue: " + intQueue.dequeue());
        System.out.println("Dequeue: " + intQueue.dequeue());
        System.out.println("Is empty: " + intQueue.isEmpty());

        MyQueue<Person> personQueue = new MyQueue<>();
        personQueue.enqueue(new Person("Alice", 25));
        personQueue.enqueue(new Person("Bob", 30));

        System.out.println("Dequeue person: " + personQueue.dequeue());
        System.out.println("Dequeue person: " + personQueue.dequeue());
        System.out.println("Is empty: " + personQueue.isEmpty());
    }
}
