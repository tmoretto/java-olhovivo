import olhovivo.api.OlhoVivoApi;

public class MainApp {

	public static void main(String[] args) {
		OlhoVivoApi olhovivo = new OlhoVivoApi();
		
		olhovivo.login(args[0]);
		
	}

}
