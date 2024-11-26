public class __LinkedList {
  public Node head = null;
  public int size = 0;
  
  public __LinkedList() {

  }

  public void append() {
    Node current = head;
    if(size == 0) {
      this.head = new Node();
      head.readFromConsole();
      size++;
    }
    else {
      while(current.next != null) {
        current = current.next;
      }
      Node new_node = new Node();
      new_node.readFromConsole();
      current.next = new_node;
      size++;
    }
  }

  public void pop(int index) {
    int current__index = 0;
    Node current = head;
    if(index > size - 1 || index < 0) {
      System.out.println("Индекс вышел за диапазон!");
      return;
    }
    if(index == 0) {
      head = head.next;
      size--;
      return;
    }
    while(current__index != index - 1) {
      current = current.next;
      current__index++;
    }
    current.next = current.next.next;
    size--;
  }

  public void print(int index) {
    if(index > size - 1 || index < 0) {
      System.out.println("Индекс вышел за диапазон!");
      return;
    }
    Node current = head;
    int current__index = 0;
    while (current__index != index) {
      current = current.next;
      current__index++;
    }
    current.printInfo();
    System.out.println("");
  }
  
  public void print() {
    Node current = head;
    if(head == null) {
      System.out.println("Пустой список");
      return;
    }
    System.out.printf("\n[");
    while(current.next != null) {
      System.out.printf("[");
      current.printInfo();
      System.out.printf("], ");
      current = current.next;
    }
    System.out.printf("[");
    current.printInfo();
    System.out.printf("], ");
    System.out.printf("]\n");
  }

  public void clear() {
    if(this.size > 1) {
      pop(0);
      clear();
    }
    else {
      this.head = null;
      System.out.println("Список очищен!");
      return;
    }
  }

  public boolean is_empty() {
    if(size == 0) {
      System.out.println("Список пуст!");
      return true;
    }
    else {
      System.out.printf("Список содержит %d элементов", size);
      return false;
    }

  }
}