import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Aula2 {
	public static void main(String[] args) {
		exercio5();
	}
	
	public static void exercio1( int num1, int num2 ) {
		System.out.println( num1 + num2 ); 
		System.out.println( num1 - num2 ); 
		System.out.println( num1 / num2 ); 
		System.out.println( num1 * num2 ); 
	}
	
	public static void exercio2( double num1, double num2 ) {
		if ( num1 == num2 ) {
			System.out.println( "Os números " + num1 + " e " + num2 + " são iguais." );
		} else if ( num1 > num2 ) {
			System.out.println( "O número " + num1 + " é maior que o número " + num2 );
		} else {
			System.out.println( "O número " + num2 + " é maior que o número " + num1 );
		}
	}
	
	public static void exercio3(String nome) {
		boolean res = nome.length() >= 10 && nome.contains("java") && nome.contains(" "); 
			
		System.out.print(res ? "sim" : "não");
	}
	
	public static void exercio4() {
		List<String> names = Arrays.asList("javascript", "typescript", "c++", "java", "rust", "ruby", "python", "lua", "go");
		System.out.println("Tamanho da lista de nomes: " + names.size());
		
		boolean res = names.contains("java");
		System.out.println(res ? "Tem java" : "Não tem java");
		
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		
		sortedNames.forEach(item -> System.out.println(item));
	}
	
	public static void exercio5() {
		String[] names = {"javascript", "typescript", "c++", "java", "rust", "ruby", "python", "lua", "go"};
		
		Arrays.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
