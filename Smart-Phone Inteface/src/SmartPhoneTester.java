
public class SmartPhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDialer phone1 = new Android();
		IDialer phone2 = new iPhone();
		
		phone1.call("867-5309");
		phone2.call("867-5309");
	}

}
