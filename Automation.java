package week3.day2;

public class Automation extends MultipleLanguage implements TestTool {

	public void javalang() {
		System.out.println("This is javalang method from Automation class");
	}

	public void Selenium() {
		System.out.println("This is selenium method from Automation class");
	}
	@Override
	void ruby() {
		// TODO Auto-generated method stub
		System.out.println("This is ruby method from abtract class");
	}
	
	public static void main(String[] args) {
		Automation au = new Automation();
		au.javalang();
		au.Selenium();
		au.python();
		au.ruby();
	}

}
