class TestaFuncionario{

	public static void main(String[] args) {


/*funcionarios*/

		//cria array ,posição, espaço do tipo funcionários com 3 funcionários
		Funcionario[] arrayDeFuncionario;
		arrayDeFuncionario = new Funcionario[3];


		//cria instãncia de funcionaŕios, pe é preciso criar os objetos para colocar nos espaços criado no array
		Funcionario funcionarioUm = new Funcionario();
		Funcionario funcionarioDois = new Funcionario();
		Funcionario funcionarioTres = new Funcionario();


		//Referencia cada ojeto ao seu espaço no array
		arrayDeFuncionario[0] = funcionarioUm;
		arrayDeFuncionario[1] = funcionarioDois;
		arrayDeFuncionario[2] = funcionarioTres;
/*funcionarios*/

/*empresas*/

		//Crio array para empresa
		Empresa[] arrayDeEmpresa = new Empresa[3];

		//estancio 3 empresas
		Empresa empresa1 = new Empresa();
		Empresa empresa2 = new Empresa();
		Empresa empresa3 = new Empresa();

		//Referencia as empresas criadas aos espaços no array
		arrayDeEmpresa[0] = empresa1;
		arrayDeEmpresa[1] = empresa2;
		arrayDeEmpresa[2] = empresa3;	
/*empresas*/

		
		//to falando que a variavel do tipo Empresa criada em funcionario
		//recebe a empresa do espaço 0 do meu array de empresa
		funcionarioUm.empresaOndeTrabalho = arrayDeEmpresa[0];
		funcionarioDois.empresaOndeTrabalho = arrayDeEmpresa[1];
		funcionarioTres.empresaOndeTrabalho = arrayDeEmpresa[2];

		arrayDeEmpresa[0].nome = "Google";
		arrayDeEmpresa[1].nome = "Facebook";
		arrayDeEmpresa[2].nome = "Microsoft";




		//chama método mostra dos objetos referenciado no array
		arrayDeFuncionario[0].mostra();
		arrayDeFuncionario[1].mostra();
		arrayDeFuncionario[2].mostra();
				
	
	}
}