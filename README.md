# java-olhovivo
A simple java wrapper for the SPTrans Olho Vivo API.

## Documentation

The **java-olhovivo** is a java spring boot wrapperd wrapper for the Olho Vivo API of SPTrans v2.1

To authenticate to the Olho Vivo API service you must make a previous call using the http POST method informing your access token. This call will return true when authentication succeeds and false in case of errors.

```java
public void login(String token) {
        
	String url = BASE_URL + "Login/Autenticar?token=" + token;
		
        ResponseEntity<String> forEntity = template.postForEntity(url, HttpMethod.POST, String.class);
        
        HttpHeaders headers = new HttpHeaders();
        headers.set("Cookie",forEntity.getHeaders().get("Set-Cookie").stream().collect(Collectors.joining(";")));
        this.entity = new HttpEntity<String>(headers);
		
}
```

Full documentation: http://www.sptrans.com.br/desenvolvedores/APIOlhoVivo/Documentacao.aspx
