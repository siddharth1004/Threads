import java.util.ArrayList;
import java.util.List;

public class ThreadAddRem {

	public List<Integer> number = new ArrayList<Integer>();

	public static void main(String[] args) {
		ThreadAddRem tar = new ThreadAddRem();
		Thread addthread = new Thread(new AddThread(tar), "Add");
		Thread remthread = new Thread(new RemoveThread(tar), "Remove");
		addthread.start();
		remthread.start();
	}

	public synchronized void add(int element) {

		number.add(element);
		System.out.println("Added " + number);
		notify();

	}

	public synchronized void remove() {

		if (number.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			number.remove(number.size() - 1);
			System.out.println("Removing, " + number);

		}
	}

}
