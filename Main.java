package polinomio;

public class Main {

	public static void main(String[] args) {
	
		int i = 0;
		long inicio;
		long fin;
		
		//p1
		double [] c1 = new double [4];
		for (i = 0 ; i < c1.length; i++)
			c1[i] = i;
		Polinomio p1 = new Polinomio(i-1,c1);
		
		//p2
		double [] c2 = new double [1001];
		for (i = 0 ; i < c2.length; i++)
			c2[i] = i-10;
		Polinomio p2 = new Polinomio(i-1,c2);

/*		
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
		
		//----------P1-------------
		
		System.out.println("--------------P1--------------");
		//Ejercicio 1
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 1 : " + p1.evaluarMSucecivas(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 1 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 2
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 2 : " + p1.evaluarRecursiva(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 2 : " + (fin-inicio) + " mSeg");
			
		//Ejercicio 3
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 3 : " + p1.evaluarProgDinamica(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 3 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 4
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 4 : " + p1.evaluarMejorada(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 4 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 5
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 5 : " + p1.evaluarPow(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 5 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 6
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 6 : " + p1.evaluarHorner(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 6 : " + (fin-inicio) + " mSeg");

		//----------P2-------------
		
		System.out.println("--------------P2--------------");
		//Ejercicio 1
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 1 : " + p2.evaluarMSucecivas(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 1 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 2
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 2 : " + p2.evaluarRecursiva(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 2 : " + (fin-inicio) + " mSeg");
			
		//Ejercicio 3
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 3 : " + p2.evaluarProgDinamica(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 3 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 4
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 4 : " + p2.evaluarMejorada(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 4 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 5
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 5 : " + p2.evaluarPow(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 5 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 6
		inicio = System.currentTimeMillis();
		System.out.println("Resultado Ejercicio 6 : " + p2.evaluarHorner(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 6 : " + (fin-inicio) + " mSeg");
		
		//----------P3-------------
		
		System.out.println("--------------P3--------------");
		//Ejercicio 1
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10 ; i++)
			p2.evaluarMSucecivas(1);
		System.out.println("Resultado Ejercicio 1 : " + p2.evaluarMSucecivas(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 1 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 2
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10 ; i++)
			p2.evaluarRecursiva(1);
		System.out.println("Resultado Ejercicio 2 : " + p2.evaluarRecursiva(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 2 : " + (fin-inicio) + " mSeg");
			
		//Ejercicio 3
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10 ; i++)
			p2.evaluarProgDinamica(1);
		System.out.println("Resultado Ejercicio 3 : " + p2.evaluarProgDinamica(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 3 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 4
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10 ; i++)
			p2.evaluarMejorada(1);
		System.out.println("Resultado Ejercicio 4 : " + p2.evaluarMejorada(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 4 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 5
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10 ; i++)
			p2.evaluarPow(1);
		System.out.println("Resultado Ejercicio 5 : " + p2.evaluarPow(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 5 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 6
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10 ; i++)
			p2.evaluarHorner(1);
		System.out.println("Resultado Ejercicio 6 : " + p2.evaluarHorner(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 6 : " + (fin-inicio) + " mSeg");	
		
		//----------P4-------------
		
		System.out.println("--------------P4--------------");
		//Ejercicio 1
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100 ; i++)
			p2.evaluarMSucecivas(1);
		System.out.println("Resultado Ejercicio 1 : " + p2.evaluarMSucecivas(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 1 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 2
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100 ; i++)
			p2.evaluarRecursiva(1);
		System.out.println("Resultado Ejercicio 2 : " + p2.evaluarRecursiva(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 2 : " + (fin-inicio) + " mSeg");
			
		//Ejercicio 3
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100 ; i++)
			p2.evaluarProgDinamica(1);
		System.out.println("Resultado Ejercicio 3 : " + p2.evaluarProgDinamica(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 3 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 4
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100 ; i++)
			p2.evaluarMejorada(1);
		System.out.println("Resultado Ejercicio 4 : " + p2.evaluarMejorada(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 4 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 5
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100 ; i++)
			p2.evaluarPow(1);
		System.out.println("Resultado Ejercicio 5 : " + p2.evaluarPow(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 5 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 6
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100 ; i++)
			p2.evaluarHorner(1);
		System.out.println("Resultado Ejercicio 6 : " + p2.evaluarHorner(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 6 : " + (fin-inicio) + " mSeg");	
		
		//----------P5-------------
		
		System.out.println("--------------P5--------------");
		//Ejercicio 1
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000 ; i++)
			p2.evaluarMSucecivas(1);
		System.out.println("Resultado Ejercicio 1 : " + p2.evaluarMSucecivas(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 1 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 2
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000 ; i++)
			p2.evaluarRecursiva(1);
		System.out.println("Resultado Ejercicio 2 : " + p2.evaluarRecursiva(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 2 : " + (fin-inicio) + " mSeg");
			
		//Ejercicio 3
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000 ; i++)
			p2.evaluarProgDinamica(1);
		System.out.println("Resultado Ejercicio 3 : " + p2.evaluarProgDinamica(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 3 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 4
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000 ; i++)
			p2.evaluarMejorada(1);
		System.out.println("Resultado Ejercicio 4 : " + p2.evaluarMejorada(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 4 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 5
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000 ; i++)
			p2.evaluarPow(1);
		System.out.println("Resultado Ejercicio 5 : " + p2.evaluarPow(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 5 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 6
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000 ; i++)
			p2.evaluarHorner(1);
		System.out.println("Resultado Ejercicio 6 : " + p2.evaluarHorner(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 6 : " + (fin-inicio) + " mSeg");	
		
		//----------P6-------------
		
		System.out.println("--------------P6--------------");
		//Ejercicio 1
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10000 ; i++)
			p2.evaluarMSucecivas(1);
		System.out.println("Resultado Ejercicio 1 : " + p2.evaluarMSucecivas(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 1 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 2
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10000 ; i++)
			p2.evaluarRecursiva(1);
		System.out.println("Resultado Ejercicio 2 : " + p2.evaluarRecursiva(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 2 : " + (fin-inicio) + " mSeg");
			
		//Ejercicio 3
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10000 ; i++)
			p2.evaluarProgDinamica(1);
		System.out.println("Resultado Ejercicio 3 : " + p2.evaluarProgDinamica(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 3 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 4
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10000 ; i++)
			p2.evaluarMejorada(1);
		System.out.println("Resultado Ejercicio 4 : " + p2.evaluarMejorada(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 4 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 5
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10000 ; i++)
			p2.evaluarPow(1);
		System.out.println("Resultado Ejercicio 5 : " + p2.evaluarPow(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 5 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 6
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 10000 ; i++)
			p2.evaluarHorner(1);
		System.out.println("Resultado Ejercicio 6 : " + p2.evaluarHorner(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 6 : " + (fin-inicio) + " mSeg");	
		
		//----------P7-------------
		
		System.out.println("--------------P7--------------");
		//Ejercicio 1
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100000 ; i++)
			p2.evaluarMSucecivas(1);
		System.out.println("Resultado Ejercicio 1 : " + p2.evaluarMSucecivas(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 1 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 2
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100000 ; i++)
			p2.evaluarRecursiva(1);
		System.out.println("Resultado Ejercicio 2 : " + p2.evaluarRecursiva(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 2 : " + (fin-inicio) + " mSeg");
			
		//Ejercicio 3
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100000 ; i++)
			p2.evaluarProgDinamica(1);
		System.out.println("Resultado Ejercicio 3 : " + p2.evaluarProgDinamica(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 3 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 4
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100000 ; i++)
			p2.evaluarMejorada(1);
		System.out.println("Resultado Ejercicio 4 : " + p2.evaluarMejorada(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 4 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 5
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100000 ; i++)
			p2.evaluarPow(1);
		System.out.println("Resultado Ejercicio 5 : " + p2.evaluarPow(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 5 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 6
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 100000 ; i++)
			p2.evaluarHorner(1);
		System.out.println("Resultado Ejercicio 6 : " + p2.evaluarHorner(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 6 : " + (fin-inicio) + " mSeg");	
		
		//----------P8-------------
		
		System.out.println("--------------P8--------------");
		//Ejercicio 1
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000000 ; i++)
			p2.evaluarMSucecivas(1);
		System.out.println("Resultado Ejercicio 1 : " + p2.evaluarMSucecivas(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 1 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 2
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000000 ; i++)
			p2.evaluarRecursiva(1);
		System.out.println("Resultado Ejercicio 2 : " + p2.evaluarRecursiva(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 2 : " + (fin-inicio) + " mSeg");
			
		//Ejercicio 3
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000000 ; i++)
			p2.evaluarProgDinamica(1);
		System.out.println("Resultado Ejercicio 3 : " + p2.evaluarProgDinamica(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 3 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 4
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000000 ; i++)
			p2.evaluarMejorada(1);
		System.out.println("Resultado Ejercicio 4 : " + p2.evaluarMejorada(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 4 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 5
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000000 ; i++)
			p2.evaluarPow(1);
		System.out.println("Resultado Ejercicio 5 : " + p2.evaluarPow(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 5 : " + (fin-inicio) + " mSeg");
		
		//Ejercicio 6
		inicio = System.currentTimeMillis();
		for(i = 0 ; i < 1000000 ; i++)
			p2.evaluarHorner(1);
		System.out.println("Resultado Ejercicio 6 : " + p2.evaluarHorner(1));
		fin = System.currentTimeMillis();
		System.out.println("Tiempo Ejecucion Ejercicio 6 : " + (fin-inicio) + " mSeg");
	}

	/*
	 * P1 
	 * Resolver 1 vez polinomio grado 3
	 * 1) 2 mseg 
	 * 2) 0 mseg
	 * 3) 0 mseg
	 * 4) 0 mseg
	 * 5) 0 mseg
	 * 6) 0 mseg
	 * 
	 * P2
	 * Resolver 1 vez polinomio grado 1000
	 * 1) 2 mseg 
	 * 2) 6 mseg
	 * 3) 0 mseg
	 * 4) 0 mseg
	 * 5) 0 mseg
	 * 6) 1 mseg
	 * 
	 * P3
	 * Resolver 10 vez polinomio grado 1000
	 * 1) 8 mseg 
	 * 2) 14 mseg
	 * 3) 1 mseg
	 * 4) 0 mseg
	 * 5) 1 mseg
	 * 6) 1 mseg
	 * 
	 * P4
	 * Resolver 100 vez polinomio grado 1000
	 * 1) 60 mseg 
	 * 2) 135 mseg
	 * 3) 4 mseg
	 * 4) 2 mseg
	 * 5) 12 mseg
	 * 6) 12 mseg
	 * 
	 * P5
	 * Resolver 1000 vez polinomio grado 1000
	 * 1) 577 mseg 
	 * 2) 1137 mseg
	 * 3) 7 mseg
	 * 4) 2 mseg
	 * 5) 76 mseg
	 * 6) 4 mseg
	 * 
	 * P6
	 * Resolver 10000 vez polinomio grado 1000
	 * 1) 5621 mseg 
	 * 2) 11478 mseg
	 * 3) 102 mseg
	 * 4) 29 mseg
	 * 5) 769 mseg
	 * 6) 25 mseg
	 * 
	 * P7
	 * Resolver 100000 vez polinomio grado 1000
	 * 1) 24154 mseg 
	 * 2) 115210 mseg
	 * 3) 274 mseg
	 * 4) 74 mseg
	 * 5) 7649 mseg
	 * 6) 142 mseg
	 * 
	 * P8
	 * Resolver 1000000 vez polinomio grado 1000
	 * 1) 32237 mseg 
	 * 2) 1139261 mseg
	 * 3) 1517 mseg
	 * 4) 74 mseg
	 * 5) 76181 mseg
	 * 6) 141 mseg
	 * 
	 * 
	 * 
	 * 
	 */
	
	
}


