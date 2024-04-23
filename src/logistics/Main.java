package logistics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		// peso total(A)
		System.out.print("Qual é o peso do chassi?:");
		double chassi = teclado.nextDouble();

		System.out.print("Qual é peso do semi reboque?: ");
		double semiReboque = teclado.nextDouble();

		System.out.print("Peso de outros equipamentos?:  ");
		double outros = teclado.nextDouble();
		// operação
		double pesoVeic = func.soma(chassi, semiReboque, outros);

		System.out.println("---------------------------------");
		System.out.println("O peso total é: " + pesoVeic);
		System.out.println("---------------------------------");

		// carga util (B)
		System.out.print("Qual é peso da carga?: ");
		double pesoCarga = teclado.nextDouble();
		// operação
		double pesoTotal = func.subtração(pesoCarga, pesoVeic);
		System.out.println("---------------------------------");
		System.out.println("O peso total é: " + pesoTotal);
		System.out.println("---------------------------------");

		// numero de viagens mensais(C)

		System.out.print("Qual é a tonelada Mensal: ");
		double pesoTone = teclado.nextDouble();
		double calculoViagemMen = func.divisão(pesoVeic, pesoTone);
		System.out.println("---------------------------------");
		System.out.println("Essa é a quantidade de viagens mensais: " + calculoViagemMen);
		// tempo total de viagem (D)

		// ida
		System.out.print("Qual distancia(km) percorrido?: ");
		double distanciaida = teclado.nextDouble();

		System.out.print("Quantos km/h percorrido?: ");
		double kmida = teclado.nextDouble();

		// volta
		System.out.print("Quantos km(distancia) percorrido na volta?: ");
		double distanciavolta = teclado.nextDouble();

		System.out.print("Quantos km/h percorrido na volta?: ");
		double kmvolta = teclado.nextDouble();

		// tempo de carga e descarga
		System.out.print("tempo de carga:");
		double tempoDecarga = teclado.nextDouble();

		System.out.print("tempo de descarga:");
		double tempoDescarga = teclado.nextDouble();

		// operação

		double tempodeIda = (func.divisão(distanciaida, kmida)) * 60;
		double tempodeVolta = func.divisão(distanciavolta, kmvolta) * 60;
		double tempoTotal = func.soma4(tempodeIda, tempodeVolta, tempoDecarga, tempoDescarga);
		System.out.println("---------------------------------");
		System.out.println("Essé tempo de viagem total:" + tempoTotal);
		System.out.println("---------------------------------");

		// tempo de operação diaria (E)

		System.out.print("Quantas horas trabalhadas no turno?: ");
		double horasTrab = teclado.nextDouble();

		// operação
		double tempoOp = horasTrab * 60;
		System.out.println("---------------------------------");
		System.out.println("Tempo operação diaria:" + tempoOp);
		System.out.println("---------------------------------");

		// Viagens diaria de um veiculo(F)
		double viagensporVeic = func.divisão(tempoOp, tempoTotal);
		System.out.println("---------------------------------");
		System.out.println("Numero de viagens de um veiculo: " + viagensporVeic);
		System.out.println("---------------------------------");

		// dias trab (G)
		System.out.print("Quantos dias Trabalhado?: ");
		double diasTrab = teclado.nextDouble();

		System.out.print("Quantos dias parados?:");
		double diasParada = teclado.nextDouble();

		// operação
		double diasTotal = func.subtração(diasTrab, diasParada);

		// viagens mensais de um veiculo(H)

		double viagensMenVeic = func.multiplicação(viagensporVeic, diasTotal);
		System.out.println("---------------------------------");
		System.out.println("Viagens Mensais do veiculo: " + viagensMenVeic);
		System.out.println("---------------------------------");

		// calculo de frota(I)
		// operação
		double frota = func.divisão(calculoViagemMen, viagensMenVeic);
		System.out.println("frota:" + frota);
		System.out.println("---------------------------------");

	}

	public class func {
		static double soma(double y, double x, double z) {
			return y + x + z;
		}

		static double subtração(double y, double x) {
			return y - x;
		}

		static double divisão(double x, double y) {
			return x / y;
		}

		static double soma4(double a, double b, double c, double d) {
			return a + b + c + d;
		}

		static double multiplicação(double x, double y) {
			return x * y;
		}

	}

}
