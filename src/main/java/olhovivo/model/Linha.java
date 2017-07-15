package olhovivo.model;

public class Linha {
	
	private int cl; //Código identificador da linha. Este é um código identificador único de cada linha do sistema (por sentido de operação)
	private boolean lc; //Indica se uma linha opera no modo circular (sem um terminal secundário)
	private String lt; //Informa a primeira parte do letreiro numérico da linha
	private int tl; //Informa a segunda parte do letreiro numérico da linha, que indica se a linha opera nos modos: BASE (10), ATENDIMENTO (21, 23, 32, 41)
	private int sl; //Informa o sentido ao qual a linha atende, onde 1 significa Terminal Principal para Terminal Secundário e 2 para Terminal Secundário para Terminal Principal
	private String tp; //Informa o letreiro descritivo da linha no sentido Terminal Principal para Terminal Secundário
	private String ts; //Informa o letreiro descritivo da linha no sentido Terminal Secundário para Terminal Principal
	
	public int getCl() {
		return cl;
	}
	public void setCl(int cl) {
		this.cl = cl;
	}
	public boolean isLc() {
		return lc;
	}
	public void setLc(boolean lc) {
		this.lc = lc;
	}
	public String getLt() {
		return lt;
	}
	public void setLt(String lt) {
		this.lt = lt;
	}
	public int getTl() {
		return tl;
	}
	public void setTl(int tl) {
		this.tl = tl;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	
}
