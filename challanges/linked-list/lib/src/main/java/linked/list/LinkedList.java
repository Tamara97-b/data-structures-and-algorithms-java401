package linked.list;

public class LinkedList<T>{
    Node head;

    public LinkedList(){
       head = null;
    }

    public void insert(T value){
        Node newNode = new Node(value);
        newNode.next= head;
        head= newNode;
    }

    public boolean includes(T value){
        Node current = head;
        while (current !=null){
            if(current.value==value){
                return true;
            }
            else{
                current=current.next;
            }
        }
        return false;

    }

    @Override
    public String toString() {
      Node current = head;
      String result = "";
      while (current!=null){
          result+="{ "+current.value+"}->";
          current= current.next;
      }
      result+="null";
      return result;
    }

}
