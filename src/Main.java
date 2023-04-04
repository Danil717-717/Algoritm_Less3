public class Main {



    public static void main(String[] args) {

        UnidirectionalList list = new UnidirectionalList();
        list.addFirst(1);
        list.addLast(2);
        list.addFirst(3);
        //list.removeLast();
        //list.removeFerst();
        //list.removeLast();
        //list.removeFerst();
        list.print();
        list.revert();
        System.out.println();
        list.print();
        System.out.println();

        BidirectionalList list1 = new BidirectionalList();
        list1.addFirst(1);
        list1.addLast(2);
        list1.addFirst(3);

        list1.print();
        list1.revertList();
        System.out.println();
        list1.print();

    }

}