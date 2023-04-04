public class BidirectionalList {


    //связный список двунаправленный

    private Node head; //ссылка на первый элемент
    private Node tail; //ссылка на последний элемент

    static class Node {
        private int value;
        private Node next;
        private Node previous;

    }

    public void addFirst(int value) {    //добавляет первый элемент
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
            head.previous = node;
        } else {
            tail = node;
        }
        head = node;
    }

    //public void removeFirst() {   // удаление первого элемента
    //    if (head != null && head.next != null) {
    //        head.next.previous = null;
    //        head = head.next;
    //    } else {
    //        tail = null;
    //        head = null;
    //    }
    //}


    //public boolean find(int value) {      // поиск
    //    Node currentNode = head;
    //    while (currentNode != null) {
    //        if (currentNode.value == value) {
    //            return true;
    //        }
    //        currentNode = currentNode.next;
    //    }
    //    return false;
    //}


    public void addLast(int value) {      //добавл в конец
        Node currentNode = new Node();
        currentNode.value = value;
        if(tail != null){
            currentNode.previous = tail;
            tail.next = currentNode;
        }else{
            head = currentNode;
        }
        tail=currentNode;
    }


    //public void removeLast() {   //удаление посл элемента
    //    if (tail != null && tail.previous !=null) {
    //        tail.previous.next = null;
    //        tail=tail.previous;
    //    }else{
    //        head = null;
    //        tail = null;
    //    }
    //}

    public void swap(Node node){
        // меняем местами указатели head и tail
        Node temp = head;
        head = tail;
        tail = temp;
    }

    ///public void revertList() {
    //    Node previous = null;
    //    Node curr = head;

        //перебирая список переворачивая указатели
    //    while (curr != null) {
    //        swap(curr);
    //        previous = curr;
    //        curr = curr.previous;
    //    }
     //   if(previous != null){
    //        head = previous;
    //    }

    //}

    public void revertList(){
        Node currentNode = head;
        while(currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if(previous == null){
                tail = currentNode;
            }
            if(next == null){
                head = currentNode;
            }
            currentNode = next;
        }

    }


    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "-> ");
            node = node.next;
        }

    }
}
