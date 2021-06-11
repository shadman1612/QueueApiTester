import java.util.Queue ;
import java.util.LinkedList ;
/**
    Practices using the Queue from the Java API.
 */
public class QueueApiTester
{
    public static void main(String[] args)
    {
 Queue<String> queue = new LinkedList<String>() ;
 queue.add("horse") ;
 queue.add("cat") ;
 queue.add("dog") ;
 queue.add("cow") ;
 queue.add("mouse") ;
 System.out.println(queue.remove()) ;
 System.out.println(queue.remove()) ;
 System.out.println(queue.remove()) ;
 System.out.println(queue.peek()) ;
 System.out.println("queue is empty? " + queue.isEmpty()) ;
 System.out.println(queue.remove()) ;
 System.out.println("queue is empty? " + queue.isEmpty()) ;
 System.out.println(queue.remove()) ;
 System.out.println("queue is empty? " + queue.isEmpty()) ;
 //-----------Start below here. To do: approximate lines of code = 7
 // 1. make a queue q2 that holds integers ; 
 Queue <Integer> q2 = new LinkedList<Integer>();
 //2. put in the integers from 1 to 100 that are divisible by 3 ; 
 for ( int i = 1; i < 100; i++) {
   if (i%3 == 0) q2.add(i);
 }
 //3. print the size of the queue
 System.out.println(q2.size());
 //4. while not empty ; 
 while(!q2.isEmpty()) {
     //5. remove an integer and put it in value ; 
   int value = q2.remove();
     //6-7. print the value if divisible by 9.
 if (value%9 == 0) System.out.println(value);
 }
 
 //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }
}
