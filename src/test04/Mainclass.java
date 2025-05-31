package test04;

public class Mainclass {

	public static void main(String[] args) {
		
	 Aphone ap = new Aphone();
	 System.out.println("A Phone"+"\n전화가능합니다");
	 ap.phone_trans_recep();
	 ap.phone_speed();
	 ap.phone_remocon();
	 System.out.println("--------------------");
	 
	 Bphone bp = new Bphone();
	 System.out.println("B Phone"+"\n전화가능합니다");
	 bp.phone_trans_recep();
	 bp.phone_speed();
	 bp.phone_remocon();
	 System.out.println("--------------------");
	 
	 Cphone cp = new Cphone();
	 System.out.println("C Phone"+"\n전화가능합니다");
	 cp.phone_trans_recep();
	 cp.phone_speed();
	 cp.phone_remocon();
	 System.out.println("--------------------");
	}

}
