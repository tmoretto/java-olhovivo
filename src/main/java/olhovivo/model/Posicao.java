package olhovivo.model;

public class Posicao {
	
	private String hr; //Horário de referência da geração das informações 
	private LinhaLocalizada[] l; //Relação de linhas localizadas
	
	public String getHr() {
		return hr;
	}
	public void setHr(String hr) {
		this.hr = hr;
	}
	public LinhaLocalizada[] getL() {
		return l;
	}
	public void setL(LinhaLocalizada[] l) {
		this.l = l;
	}
	
}
