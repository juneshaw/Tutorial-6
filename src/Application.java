
public class Application {
	public static void main(String[] args) {
		
		int loop = 0;
		while (true) {
			if (loop >= 5) {
				break;
			}
			System.out.printf("On loop %d\n", loop);
			loop++;
		}
	}
}
