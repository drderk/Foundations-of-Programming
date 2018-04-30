import java.util.Calendar;

public class Clock {

	public static void main(String[] args) {
		int time1 = Calendar.SECOND;
		int stage = 0;
		while (true) {
		switch (stage) {
		case 0:
			time1 = Calendar.SECOND;
			stage = 1;
			break;
		case 1:
			System.out.format("%1$tr", Calendar.getInstance());
			stage = 2;
			break;
		case 2:
			if (!(time1 == Calendar.SECOND)) {
				stage = 0;
			}
			else {
				stage = 2;
			}
		}
		
	}

}
}
