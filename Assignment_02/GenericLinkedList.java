class Node<T> {
    T data;          
    Node<T> next;    

   
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    private Node<T> head;  

    
    public LinkedList() {
        this.head = null;
    }

   
    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;  
        } else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode; 
        }
    }

   
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;  
        head = newNode;       
    }

    
    public void deleteNode(T key) {
        Node<T> current = head;
        Node<T> previous = null;

       
        if (current != null && current.data.equals(key)) {
            head = current.next; 
            return;
        }

        
        while (current != null && !current.data.equals(key)) {
            previous = current;
            current = current.next;
        }

       
        if (current == null) {
            System.out.println("Key " + key + " not found.");
            return;
        }

    
        previous.next = current.next;
    }

   
    public void display() {
        Node<T> current = head;

        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }

       
        while (current != null) {
            System.out.print(current.data + " , ");
            current = current.next;
        }
        System.out.println("null");
    }

    
  
}

public class GenericLinkedList {
    public static void main(String[] args) {
       
        LinkedList<Integer> intList = new LinkedList<>();
        intList.insertAtEnd(5);
        intList.insertAtEnd(10);
        intList.insertAtBeginning(15);
        intList.display();  
        intList.deleteNode(10);
        intList.display();  

      
  

     
        LinkedList<String> stringList = new LinkedList<>();
        stringList.insertAtEnd("Suhail");
        stringList.insertAtEnd("Ahmed");
        stringList.insertAtBeginning("Seelro");
        stringList.display();  

       
        stringList.deleteNode("Seelro");
        stringList.display();  

        
      
    }
}


