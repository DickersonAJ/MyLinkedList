public class tester{
  public static void main(String[]args){
    MyLinkedList chain = new MyLinkedList();
    chain.add("one");
    chain.add("two");
    chain.add("three");
    System.out.println(chain.get(0));
    System.out.println(chain.get(1));
    System.out.println(chain.get(2));
    //System.out.println(chain.get(5));
    chain.add(0,"zero");
    chain.add(4,"last");
    chain.add(3,"interuption");
    for (int i = 0; i < chain.size(); i++) {
      System.out.println(chain.get(i));
    }
    System.out.println();
    chain.set(3,"2.5");
    for (int i = 0; i < chain.size(); i++) {
      System.out.println(chain.get(i));
    }

  }
}
