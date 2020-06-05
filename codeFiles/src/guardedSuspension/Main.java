package guardedSuspension;

public class Main {
	public static void main(String[] args) {
		RequestQueue requestQueue = new RequestQueue();
		new ClientThread(requestQueue, "Alice", 3134292L).start();
		new ServerThread(requestQueue, "Bobby", 6535425L).start();
	}
}