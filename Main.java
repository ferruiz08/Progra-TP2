public class Main {

	public static void main(String[] args) {

		/*
		double coef[]= {8,-5,9,-6,20};
		Polinomio poli = new Polinomio(4,coef);
		double res=poli.evaluarRecursiva(5);
		System.out.println(res);
		double p=Polinomio.potencia(8,9);
		System.out.println(p);
		p=Polinomio.potenciaParOImpar(8,9);
		System.out.println(p);
		res=poli.evaluarHorner(5);
		System.out.println(res);
		//Ejercicio 3
		double coef2[]= {1,1,1};
		Polinomio poli2 = new Polinomio(2,coef2);
		System.out.println("Polinomio metodo 3: " + poli.evaluarProgDinamica(5));
		System.out.println("Polinomio metodo 3: " + poli2.evaluarProgDinamica(1));
		System.out.println("Polinomio metodo 4: " + poli.evaluarMejorada(5));
		System.out.println("Polinomio metodo 4: " + poli2.evaluarMejorada(1));
		int i = 0;
		double coef3[] = new double [100000000];
		for (i = 0 ; i < coef3.length; i++)
			coef3[i] = 1;
		Polinomio poli3 = new Polinomio(i-1,coef3);
		System.out.println("Polinomio metodo 3: " + poli3.evaluarProgDinamica(1));
		
	
		double coef4[] = new double [100000000];
		for (i = 0 ; i < coef4.length; i++)
			coef4[i] = 1;
		Polinomio poli4 = new Polinomio(i-1,coef3);
		System.out.println("Polinomio metodo 4: " + poli4.evaluarMejorada(1));
		
		
		*/
		
		int i = 0;
		long inicio;
		long fin;
		
		//p1
		double [] c1 = new double [3000];
		for (i = 0 ; i < c1.length; i++)
			c1[i] = i;
		Polinomio p1 = new Polinomio(i-1,c1);
/*		
		//p2
		double [] c2 = new double [10];
		for (i = 0 ; i < c2.length; i++)
			c2[i] = i-10;
		Polinomio p2 = new Polinomio(i-1,c2);
		
		//p3
		double [] c3 = new double [100];
		for (i = 0 ; i < c3.length; i++)
			c3[i] = i;
		Polinomio p3 = new Polinomio(i-1,c3);
		
		//p4
		double [] c4 = new double [100000000];
		for (i = 0 ; i < c4.length; i++)
			c4[i] = 1;
		Polinomio p4 = new Polinomio(i-1,c4);
		
		
		//p5
		double [] c5 = new double [500000000];
		for (i = 0 ; i < c4.length; i++)
			c5[i] = 0.00001*i;
		Polinomio p5 = new Polinomio(i-1,c5);

	*/		
		
		inicio = System.currentTimeMillis();
		System.out.println(p1.evaluarRecursiva(1));
		fin = System.currentTimeMillis();
		System.out.println(fin-inicio);
		
		inicio = System.currentTimeMillis();
		System.out.println(p1.evaluarHorner(1));
		fin = System.currentTimeMillis();
		System.out.println(fin-inicio);
		
		inicio = System.currentTimeMillis();
		System.out.println(p1.evaluarProgDinamica(1));
		fin = System.currentTimeMillis();
		System.out.println(fin-inicio);
	}
}
