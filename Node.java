public class Node{
  public Node(String value){
    data = value;
  }
  private String data;
  private Node next,prev;

  public String getdata(){
    return data;
  }
  public void setdata(String value){
    //String old = data;
    data = value;
    //return old;
  }

  public Node getnext(){
    return next;
  }
  public void setnext(Node other){
    next = other;
  }

  public Node getprev(){
    return prev;
  }
  public void setprev(Node other){
    prev = other;
  }

}
