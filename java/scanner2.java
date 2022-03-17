import java.util.Locale;

import java.util.Scanner;

    public class scanner2{

	public static void main(String[] args) {
		
		//usando scanner e lendo tudo em só codigo
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		double income;
		
		name = sc.next();
        age = sc.nextInt();
        income = sc.nextDouble();
        System.out.println("Informações de dados do usuario pesquisado: ");
        System.out.println(name);
        System.out.println(age);
        System.out.println(income);
		
		sc.close();
		
	}
	
}
