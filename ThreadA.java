public class ThreadA {
 	public static void main(String[] args){
 			Thread11 t1 = new Thread11();
 			t1.start();
 			
 	}
 }

class Thread11 extends Thread{ 
 	public void run(){ 
 		
 			try {
 				for(int i=0;i<1000;i++){
 		 			System.out.println("ThreadA");
				Thread.sleep(1000);
 				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 	}
 	
 }
 