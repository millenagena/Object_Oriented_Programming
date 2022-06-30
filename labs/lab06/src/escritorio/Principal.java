package escritorio;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario vetFunc[] = new Funcionario[5];
		double somaSalario=0, salario=0, qntdG=0, qntdA=0, qntdV=0,
				totalG=0, totalA=0, totalV=0;
		
		vetFunc[0] = new Gerente("Janaina", "255789", 6000);
		vetFunc[1] = new Assistente("Pedro", "998564", 3000);
		vetFunc[2] = new Vendedor("Laryssa", "999999", 4000, 2000);
		vetFunc[3] = new Vendedor("Romulo", "475896", 4000, 980);
		vetFunc[4] = new Assistente("Joyce", "444777", 3000);
		
		System.out.print("===FOLHA SALARIAL===");
		for(int i=0; i < vetFunc.length; i++) {
			salario = vetFunc[i].calculaSalario();
			somaSalario += salario;

			System.out.println("==\nFuncionario " + (i+1) + "==");
			System.out.println(vetFunc[i]);
			
			if(vetFunc[i] instanceof Gerente) {
				totalG += salario;
				qntdG++;
			}
			if(vetFunc[i] instanceof Assistente) {
				totalA += salario;
				qntdA++;
			}
			if(vetFunc[i] instanceof Vendedor) {
				totalV += salario;
				qntdV++;
			}
		}
		System.out.print("\nValor total: R$" + somaSalario);
		System.out.println("\n\n==MEDIA DOS SALARIOS POR TIPO DE FUNCIONARIO==");
		System.out.println("Gerente: R$" + (totalG/qntdG));
		System.out.println("Assistente: R$" + (totalA/qntdA));
		System.out.println("Vendedor: R$" + (totalV/qntdV));
	}

}
