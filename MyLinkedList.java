public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    Node temp = new Node(value);
    if (size==0){
      start = temp;
      end = temp;
    }
    else if (size==1){
      end = temp;
      start.setnext(end);
      end.setprev(start);
    }
    else {
      String old = end.getdata();
      end.getprev().setnext(temp);
      temp.setprev(end.getprev());
      temp.setnext(end);
      end.setprev(temp);
      end.setdata(value);
      temp.setdata(old);
    }
    size+=1;
    return true;
  }

  public void add(int index, String value){
    if (index < 0) {
      throw new IndexOutOfBoundsException("index of " + index
        + " cannot be negative");
    }
    if (index > size) {
      throw new IndexOutOfBoundsException("index of " + index
        + " is too large");
    }
    Node temp = new Node(value);
    if (index == 0){
      if (size==0){
        start = temp;
        end = temp;
      }
      else {
        String old = start.getdata();
        start.getnext().setprev(temp);
        temp.setnext(start.getnext());
        temp.setprev(start);
        start.setnext(temp);
        start.setdata(value);
        temp.setdata(old);
      }
    }
    else if (index==size){
      String old = end.getdata();
      end.getprev().setnext(temp);
      temp.setprev(end.getprev());
      temp.setnext(end);
      end.setprev(temp);
      end.setdata(value);
      temp.setdata(old);
    }
    else {
      Node current = start;
      for (int i = 0; i < index; i++) {
        current = current.getnext();
      }
      current.getprev().setnext(temp);
      temp.setprev(current.getprev());
      temp.setnext(current);
      current.setprev(temp);
      temp.setdata(value);
    }
    size+=1;
  }

  public String get(int index){
    if (index < 0) {
      throw new IndexOutOfBoundsException("index of " + index
        + " cannot be negative");
    }
    if (index >= size) {
      throw new IndexOutOfBoundsException("index of " + index
        + " is too large");
    }
    Node current = start;
    for (int i = 0; i < index; i++) {
      current = current.getnext();
    }
    return current.getdata();
  }

  public String set(int index, String value){
    if (index < 0) {
      throw new IndexOutOfBoundsException("index of " + index
        + " cannot be negative");
    }
    if (index > size) {
      throw new IndexOutOfBoundsException("index of " + index
        + " is too large");
    }
    Node current = start;
    for (int i = 0; i < index; i++) {
      current = current.getnext();
    }
    String old = current.getdata();
    current.setdata(value);
    return old;
  }

  public String toString(){
    String ret = "[";
    for (int i = 0; i < size; i++) {
      ret+=get(i);
      if (i!=size-1) {
        ret+=", ";
      }
    }
    ret+="]";
    return ret;
  }

  public String toStringReversed(){
    String ret = "[";
    for (int i = size-1; i >= 0; i--) {
      ret+=get(i);
      if (i!=0) {
        ret+=", ";
      }
    }
    ret+="]";
    return ret;
  }

  public String remove(int index){
    if (index < 0) {
      throw new IndexOutOfBoundsException("index of " + index
        + " cannot be negative");
    }
    if (index >= size) {
      throw new IndexOutOfBoundsException("index of " + index
        + " is too large");
    }
    String ret = get(index);
    if (index == 0){
      if (size==1){
        start = null;
        end = null;
      }
      else {
        start.getnext().setprev(null);
        start = start.getnext();
      }
    }
    else if (index==size-1){
      end.getprev().setnext(null);
      end = end.getprev();
    }
    else {
      Node current = start;
      for (int i = 0; i < index; i++) {
        current = current.getnext();
      }
      current.getprev().setnext(current.getnext());
      current.getnext().setprev(current.getprev());
    }
    size-=1;
    return ret;
  }

}
