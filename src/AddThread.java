
public class AddThread implements Runnable {
	public ThreadAddRem tar;

	public AddThread(ThreadAddRem tar) {
		this.tar = tar;
	}

	@Override
	public void run() {
		for (int loop = 0; loop < 10; loop++) {
			tar.add(loop);
		}
	}

}
