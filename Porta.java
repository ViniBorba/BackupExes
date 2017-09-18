class Porta{

	boolean janela1 = true;
	boolean janela2;
	boolean janela3;

	Porta(){
		System.out.println("10 x");
	}

	//Abre fecha janela 1
	void abreJanela(){
		this.janela1 = true;
	}
	void fechaJanela(){
		this.janela1 = false;
	}
	boolean statusDaJanela(){
		return janela1;
	}
/*
	//Abre fecha janela 2
	void abreJanela2(){
		this.janela2 = true;
	}
	void fechaJanela2(){
		this.janela2 = false;
	}
	boolean statusDaJanela2(){
		return janela2;
	}

	//Abre fecha janela 3
	void abreJanela3(){
		this.janela3 = true;
	}
	void fechaJanela3(){
		this.janela3 = false;
	}
	boolean statusDaJanela3(){
		return janela3;
	}
*/	
}