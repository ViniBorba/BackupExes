class Fatorial{
	public static void main (String[] args){

		//preciso criar uma coisa pra ++ a variavelFat
		int variavelFat=0;
		while(variavelFat <=10){
		
			int fatora = variavelFat;

			for(int i = 1; i <= variavelFat; i++){
				fatora = i * fatora;
				System.out.println(fatora);
			}
		variavelFat++;
		}

	}
}
