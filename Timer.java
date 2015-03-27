
public class Timer {

	private static int time;

	public static int getTime() {
		return Timer.time;
	}

	public static void setTime(int time) {
		Timer.time = time;
	}
	
	public static void resetTime() {
		Timer.time = 60;
	}
	
	public static void incrementTime(){
		Timer.time++;
	}
	
	public static void decrementTime(){
		Timer.time--;
	}
}
