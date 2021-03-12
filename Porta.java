class Porta{

	private int portaAberta;
	private int portaFechada;
	private String corPorta;
	static int portaCriada;

	Porta(){
		this.portaCriada = 0;
		this.portaAberta = 0;
		this.portaFechada = 0;
		this.corPorta = "Branco";
	}
	
	void setCorPorta(String cor){
		this.corPorta = cor;
	}
	
	String getMostraCorPorta(){
		return this.corPorta;
	}
	
	//Abre fecha e fecha portas
	void abrePorta(){
		this.portaAberta = this.portaAberta + 1;
	}
	void fechaPorta(){
		this.portaFechada = this.portaFechada + 1;
		
	}

	int portasAbertas(){
		return this.portaAberta;
	}

	int portasFechadas(){
		return this.portaFechada;
	}

	int quantiaDePorta(){
		return this.portaCriada;
	}

}