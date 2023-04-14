package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
public class Priority_Queue_eg {
public static void main(String[] args) {
PriorityQueue<String> queue= new PriorityQueue<String>();
//insert the element
queue.add("Hasan");
queue.add("Sana");
queue.add("Amir");
queue.add("Barira");
queue.add("Kajol");
queue.add("Aashi");
//its work in alphabetic form
System.out.println(" to show the first word Head: "+queue.element());
System.out.println("Queue: "+queue);
System.out.println("Head: "+queue.peek());
System.out.println("Queue: "+queue);
System.out.println("Iterating the elements:");
Iterator itr=queue.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());	
}
//poll means to pop out the element---means remove
System.out.println("Head: "+queue.poll());
System.out.println("Queue: "+queue);
System.out.println("Head: "+queue.remove());//remove the first element
System.out.println("Queue: "+queue);
System.out.println("After removing");
Iterator<String> itr1=queue.iterator();
while(itr1.hasNext()) {
System.out.println(itr1.next());	
}
}
}
