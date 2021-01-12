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
    //chain.set(-3,"2.5");
    //chain.set(30,"2.5");
    System.out.println();
    System.out.println(chain.toString());
    System.out.println(chain.toStringReversed());
    System.out.println();
    chain.remove(3);
    System.out.println(chain.toString());
    chain.remove(4);
    System.out.println(chain.toString());
    chain.remove(0);
    System.out.println(chain.toString());

    System.out.println("node tester thing");
    Node test = new Node("0");
    chain.addNodeToFront(test);
    System.out.println(chain.toString());
    System.out.println(chain.toStringReversed());
    System.out.println(test.getdata());
    chain.addNodeToEnd(test);
    System.out.println(chain.toString());
    System.out.println(chain.toStringReversed());
    System.out.println(test.getdata());
    System.out.println("node tester thing");

    MyLinkedList empty = new MyLinkedList();
    MyLinkedList empty2 = new MyLinkedList();
    empty.extend(empty2);
    System.out.println(empty.toString());
    System.out.println(empty.toStringReversed());
    chain.extend(empty);
    System.out.println(chain.toString());
    System.out.println(chain.toStringReversed());
    System.out.println("testing the thing that doesn't work");
    /*empty.extend(chain);
    System.out.println(empty.toString());
    System.out.println(empty.toStringReversed());*/
    MyLinkedList chain2 = new MyLinkedList();
    chain2.add("four");
    chain2.add("five");
    chain2.add("six");
    chain.extend(chain2);
    System.out.println(chain.toString());
    System.out.println(chain.toStringReversed());

    MyLinkedList chain3 = new MyLinkedList();
    chain3.add("seven");
    chain.extend(chain3);
    System.out.println(chain.toString());
    System.out.println(chain.toStringReversed());
    empty.extend(chain);
    System.out.println(empty.toString());
    System.out.println(empty.toStringReversed());

  }
}
