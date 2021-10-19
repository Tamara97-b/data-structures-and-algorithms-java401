package Class ;
Public class App {
    Public static void main (String[] args ){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Sysrem.out.println(linkedList.toString());
        linkedList.insert(4);
        linkedList.insert(7);
        linkedList.insert(8);
        linkedList.kthFromEnd(5);
        System.out.println(linkedList.toString());
        System.out.println(linkedList.includes(7));}

}

