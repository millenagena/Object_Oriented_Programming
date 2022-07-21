package arraylist_comparable;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		double salario;
		Scanner sc = new Scanner(System.in);
		ArrayList<Empregado> empregados = new ArrayList<Empregado>();
		
		empregados.add(new Empregado("1111", 35, 1500.90));
		empregados.add(new Empregado("2222", 22, 2000));
		empregados.add(new Empregado("3333", 56, 1000));
		empregados.add(new Empregado("4444", 19, 3500));
		empregados.add(new Empregado("5555", 31, 2700));
		
		Collections.sort(empregados);
		Iterator<Empregado> it = empregados.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("\nInforme um salario: ");
		salario = sc.nextDouble();
		sc.close();
		
		for(Empregado emp: empregados) {
			if(emp.getSalario() > salario) {
				System.out.println(emp);
			}
		}		
	}

}
