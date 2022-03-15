package fundamentos;

public class GastosTrimestre {

	public static void main(String[] args) {
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastosTrimestral / 3;
		
		System.out.println("O gasto trimestral é: " + gastosTrimestral);
		System.out.println("A média de gastos trimestral é: " + mediaMensal);
		

	}

}
