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

  public boolean add(int index, String value){
    return true;
  }

  public String get(int index){
    
  }

  /*public String set(int index, String value){

  }

  public String toString(){

  }*/

}
