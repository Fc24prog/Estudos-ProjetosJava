package primeirosPassos;

public class ExercicioFixacaoNelio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double prince1 = 2100.0;
		double prince2 = 650.50; // double é %f
		double measure = 53.234567;

		System.out.println("Products: ");
		System.out.println(product1 + "," + "which price is $ " + prince1);
		System.out.println(product2 + ",which price is $ " + prince2);
		System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);

		System.out.printf("medida com 8 as casas decimais: %.8f\n", measure);
		System.out.printf("medida com 4 casas decimais: %.4f:", measure);

	}

}
