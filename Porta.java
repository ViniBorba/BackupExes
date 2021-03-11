class Porta{

	private int portaAberta;
	private int portaFechada;
	String corPorta;
	static int portaCriada;

	Porta(){
		this.portaCriada += 1;
		this.portaAberta += 1;
		this.portaFechada +=1;
		corPorta = "Branco";
	}
	
	void setCorPorta(String cor){
		cor = this.corPorta;
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