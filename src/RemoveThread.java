
public class RemoveThread implements Runnable {
	public ThreadAddRem tar;

	public RemoveThread(ThreadAddRem tar) {
		this.tar = tar;
	}

	@Override
	public void run() {
		for (int loop = 0; loop < 10; loop++) {
			tar.remove();
		}

	}

}
