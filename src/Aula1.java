import java.text.DecimalFormat;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Aula1 {
	public static void main(String[] args) {
		calStudentsAverage("Joãozinho", new int[] { 1, 4, 5, 10, 11, 14, 20, 21, 28, 90, 91 });
	}

	public static void calculateQuarterStatement(double month1, double month2, double month3) {
		double sum = month1 + month2 + month3;
		double average = sum / 3;

		DecimalFormat decimalFormat = new DecimalFormat("###,###,###.##");

		String formatedSum = decimalFormat.format(sum);
		String formatedAverage = decimalFormat.format(average);

		System.out.println("O gasto total do trimestre foi: R$ " + formatedSum);
		System.out.println("O médio mensal do trimestre foi: R$ " + formatedAverage);
	}

	public static void sumNumbers(int j) {
		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 1; i <= j; i++) {
			numbers.add(i);
		}

		NumberSum numberSum = new NumberSum();

		numbers.stream().forEach(item -> {
			if (item % 2 == 0) {
				numberSum.addToPairSum(item);
			} else {
				numberSum.addToOddSum(item);
			}
		});

		System.out.println("Soma dos números pares: " + numberSum.getPairSum());
		System.out.println("Soma dos números ímpares: " + numberSum.getOddSum());
	}

	private static class NumberSum {
		private int pairSum = 0;
		private int oddSum = 0;

		public void addToPairSum(int value) {
			pairSum += value;
		}

		public void addToOddSum(int value) {
			oddSum += value;
		}

		public int getPairSum() {
			return pairSum;
		}

		public int getOddSum() {
			return oddSum;
		}
	}

	public static void characterRemoval(String text) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		text = text.toLowerCase();
		text = Normalizer.normalize(text, Normalizer.Form.NFD);

		for (int i = 0; i < vowels.length; i++) {
			if (text.contains(String.valueOf(vowels[i]))) {
				text = text.replaceAll(String.valueOf(vowels[i]), "");
			}
		}
		System.out.print(text);
	}

	public static void checkPrimeNumber(int num) {
		boolean isPrime = true;

		if (num <= 2) {
			isPrime = false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.print("O número " + num + (isPrime ? " é " : " não é ") + "primo");
	}

	public static void justOneAndFour(Integer[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(args));

		boolean onlyOneAndFour = numbers.stream().collect(Collectors.toSet()).equals(Set.of(1, 4));
		System.out
				.println("A lista informada " + (onlyOneAndFour ? "" : "não ") + "contém apenas 1 e 4 como elementos.");
	}

	public static void multiplesOfTen(Integer[] numbers) {
		int currentMultiple = -1;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 10 == 0) {
				currentMultiple = numbers[i];
			} else if (currentMultiple != -1) {
				numbers[i] = currentMultiple;
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if (i < numbers.length - 1) {
				System.out.print(", ");
			}
		}
	}

	public static void calStudentsAverage(String name, int[] examNotes) {

		int sum = Arrays.stream(examNotes).sum();
		float average = sum / examNotes.length;
		System.out.println("A média do aluno " + name + " é " + average);
	}
}
