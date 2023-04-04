public class UnidirectionalList {


    //связный список однонаправленный
    private Node head; //ссылка на первый элемент


    private static class Node {
        private int value;
        private Node next;


    }

    public void addFirst(int value) {    //добавляет первый элемент
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void removeFerst() {   // удаление первого элемента
        if (head != null) {
            head = head.next;
        }
    }

    public boolean find(int value) {      // поиск
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void addLast(int value) {      //добавл в конец
        Node currentNode = new Node();
        currentNode.value = value;
        if (head == null) {
            head = currentNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = currentNode;
        }
    }


    public void removeLast() {   //удаление посл элемента
        if (head.next == null) {
            head = null;
            return;
        }
        Node node = head;
        while (node.next != null) {
            if (node.next.next == null) {
                node.next = null;
                return;
            }
            node = node.next;
        }
    }

    private void revertList(Node currentNode, Node previosNode) {
        if(currentNode.next == null){
            head = currentNode;     /// если это конец списка, то мы его желаем началом
        } else {     // если следующ элемент есть запустить рекурсию дальше
            revertList(currentNode.next, currentNode);
        }
        // замена ссылок
        currentNode.next = previosNode;
        previosNode.next = null; //первый элемент при развороте
    }

    public void revert(){
        if(head != null && head.next != null){
            revertList(head.next, head);
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
