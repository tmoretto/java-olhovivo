# java-olhovivo
A simple java wrapper for the SPTrans Olho Vivo API.

## Documentation

The **java-olhovivo** is a java spring boot wrapperd wrapper for the Olho Vivo API of SPTrans v2.1

To authenticate to the Olho Vivo API service you must make a previous call using the http POST method informing your access token. This call will return true when authentication succeeds and false in case of errors.

```java
import olhovivo.api.OlhoVivoApi;

public class MainApp {

	public static void main(String[] args) {
		OlhoVivoApi olhovivo = new OlhoVivoApi();
		
		olhovivo.login(args[0]);
		
	}

}
```
Full documentation: http://www.sptrans.com.br/desenvolvedores/APIOlhoVivo/Documentacao.aspx
