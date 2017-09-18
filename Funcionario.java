class Funcionario{
	
	String nome = "joca";
	String departamento;
	double salario;
	Data dataEtraada;
	String rg;
	boolean efetivo = true;

	//Metodo para aumentar o salário VOID NÃO RETORNA, SÓ MUDA ALGO. COM PARÃMETRO
	void recebeAumento(double aumento){
		this.salario += aumento;
	}

	//Metodo para calculcar o salário anual do cara. METODO TEM return
	double calculaGanhoAnual(){
		return this.salario * 12;
	}

	//Metodo para demitir o cara. VOID SEM PARÃMETRO
	void demite (){
		this.efetivo = false;
	}

	//Metodo para readmitir o cara
	void contrata (){
		this.efetivo = true;
	}



	//esse método é perfeito!!!
	void mostra(){

		System.out.println(this.calculaGanhoAnual());

		System.out.println("Nome: "+nome);
		System.out.println("Salário: "+salario);
		System.out.println("Departamento: "+departamento);
		//System.out.println("Data de Etrada: "+dataEtraada.dia+"/"+dataEtraada.mes+"/"+dataEtraada.ano);
		System.out.println("RG: "+rg);

		if(efetivo == true){
			System.out.println("Efetivo\n");
		} 
			else{
				System.out.println("Demitido\n");
				}

		
	}
}