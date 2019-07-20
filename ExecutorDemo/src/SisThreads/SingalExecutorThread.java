package SisThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingalExecutorThread {

	public static void main(String[] args) {
		
   ExecutorService es = Executors.newFixedThreadPool(2); //newSingleThreadExecutor();
   es.execute(new Task("1,")); //background thread 1
   es.execute(new Task("2,")); //background thread 2
   es.execute(new Task("3,")); //background thread 3
   
   // main thread
   int i= 0;
   System.out.println("Main Start");
   while(i<10) {
	   try {Thread.sleep(500);}catch(Exception e){System.out.println(e);}
   System.out.print("Main,");i++;}
   System.out.println("\nMain Completed");
   
   es.shutdown();//Stop is very important
	}
	
}
