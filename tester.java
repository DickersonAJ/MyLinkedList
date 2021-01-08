public class tester{
  public static void main(String[]args){
    MyLinkedList chain = new MyLinkedList();
    chain.add("one");
    chain.add("two");
    chain.add("three");
    System.out.println(chain.get(0));
    System.out.println(chain.get(1));
    System.out.println(chain.get(2));
    System.out.println(chain.get(5));


  }
}
