public class Node<E> {
    E element;
    Node<E> next;
     
    public Node(E e){
        element = e;
        next = null;
        }
    public static void main (String[] args)  {

        Node<Integer> head = null, tail = null,startHead = null, tail2 = null, 
        newHead = null, newTail = null, oldTail = null;
        head = new Node<>(1);
        tail = head;
        tail.next = new Node<>(2);
        tail = tail.next;

        newHead = tail;
        tail.next = new Node<>(3); 
        tail = tail.next;

        newTail = tail;
        tail.next = new Node<>(4); 
        tail = tail.next;

        oldTail = tail;
        tail = tail.next;
        

        System.out.print("Original set of nodes: ");
        Node<Integer> walkThrough = head;
        while(walkThrough != null) {
            System.out.print(walkThrough.element + " ");
        walkThrough = walkThrough.next;
        
            }
        
        System.out.print("\n" + "Swapping every two adjacent nodes: ");
        startHead = newHead;
        tail2 = startHead; 
        tail2.next = head;
        tail2 = tail2.next;
        tail2.next = oldTail;
        tail2 = tail2.next;
        tail2.next = newTail; //This original code is not running. I need to refactor it. 
        tail2.next = new Node<>(3); 
        //tail2 = newHead;
       
        Node<Integer> walkAndSwap = startHead;
        while(walkAndSwap != null) {
            walkAndSwap = walkAndSwap.next;
            System.out.print(walkAndSwap.element + " ");
        
                }
            }
         }

    

