package week3day2.Assignments;

public class Automation extends MultipleLanguage {

	
	public void Java() {
		System.out.println("Java");
		
	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	@Override
	public void Ruby() {
		System.out.println("Ruby");
		
	}
	
	
public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Python();
		auto.Ruby();
		auto.Java();
		auto.Selenium();
		
	}

}
