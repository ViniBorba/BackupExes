class BalancoTrimestral{
	public static void main(String[] args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastoTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;

		System.out.println("Gasto Trimestra: " + gastoTrimestral + "\nGasto Médio:"+ gastoTrimestral/3);
	}
}
