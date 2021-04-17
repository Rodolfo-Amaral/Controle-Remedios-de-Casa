package entities;

public class Remedios {
	public String nomeRemedio; //nome do medicamento
	public Integer qtde; //quantidade em "estoque"
	public Integer present; //quantidade em mg ou ml etc
	public String presentTx; //definir se é ml ou mg ou etc (500(present)mg(presentTx))
	public String patologia; //patologia do medicamento (para que ele serve)
	
	public Remedios(String nomeRemedio, Integer qtde, Integer present, String presentTx, String patologia) {
		this.nomeRemedio = nomeRemedio;
		this.qtde = qtde;
		this.present = present;
		this.presentTx = presentTx;
		this.patologia = patologia;
	}
	public String getNomeRemedio() {
		return nomeRemedio;
	}
	public void setNomeRemedio(String nomeRemedio) {
		this.nomeRemedio = nomeRemedio;
	}
	public Integer getQtde() {
		return qtde;
	}
	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}
	public Integer getPresent() {
		return present;
	}
	public void setPresent(Integer present) {
		this.present = present;
	}
	public String getPresentTx() {
		return presentTx;
	}
	public void setPresentTx(String presentTx) {
		this.presentTx = presentTx;
	}
	public String getPatologia() {
		return patologia;
	}
	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}
	public String toString() {
		return "\n" + nomeRemedio + " " + present + presentTx + ": " + patologia + "\n" + "Quantidade disponível: " + qtde;
	}
	
	
}
