package SisThreads;

public class Task implements Runnable{
    String st;
	Task(String st){
	this.st= st;	
	}
	@Override
	public void run() {
		System.out.println(st+" Start");
		int i = 0;
		while(i<5) {
			try {Thread.sleep(500);}catch(Exception e){System.out.println(e);}
			System.out.print(st+",");
			i++;
		}
		System.out.println("...(Task"+st+") Completed");
	}
}
