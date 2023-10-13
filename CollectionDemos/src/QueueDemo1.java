import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PriorityQueue<Integer> numsQueue = new PriorityQueue<>();
//		
//		numsQueue.add(54);
//		numsQueue.add(4);
//		numsQueue.add(34);
//		numsQueue.add(23);
//		numsQueue.add(19);
//		numsQueue.add(76);
//		numsQueue.add(45);
//		numsQueue.add(33);
//		
//		System.out.println(numsQueue);
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
		
		queue.add(10);
		queue.add(53);
		queue.add(34);
		queue.add(54);
		queue.add(12);
		//System.out.println(queue.offer(66));
		
		System.out.println("Queue " + queue);
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(queue.remove() + " is removed");
			}
		});
		
		t1.start();
		
		try {
			queue.put(90);
			System.out.println("Queue : " + queue);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(queue);
		
	}

}
