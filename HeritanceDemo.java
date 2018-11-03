package AAA_MyLibrary;

public class HeritanceDemo extends BasicSetup {

	public static void main(String[] args) {
		String status = setupSession("https://www.facebook.com","ff");
		if(status == "OK")
		{
			System.out.println("Everything is Fine");
		}
		else
		{
			//System.out.println("Error");
			System.out.println(status);
		}
	}
}
