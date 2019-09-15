public class Polinomio {
	
	private int grado ; 
	private double [] coeficientes;
	
	public Polinomio(int g, double[] c) {
		grado=g;
		coeficientes = c;
	}
	
	double evaluarRecursiva(double x) {
		return evaluarRecursivaAux(x,grado);
	}
	double evaluarRecursivaAux(double x,int grado) {
		if(grado==0)
			return coeficientes[this.grado-grado];
		return coeficientes[this.grado-grado]*potencia(x,grado) + evaluarRecursivaAux(x,grado-1);
	}
	
	public static double potencia(double x,int exp) {
		if(exp==0)
			return 1;
		return x * potencia(x,exp-1);
	}
	
	public static double potenciaParOImpar(double x,int exp) {
		if(exp==0)
			return 1;
		if(exp%2==0)
			return potenciaParOImpar(x*x,exp/2);
		else
			return x*potenciaParOImpar(x,exp-1);
	}
	
	double evaluarHorner(double x) 
    { 
        double resultado = coeficientes[0];   
   
        for (int i=1; i<coeficientes.length; i++) 
        	resultado = resultado*x + coeficientes[i]; 
   
        return resultado; 
    } 
	
	//Ejercicio 3
	public double evaluarProgDinamica (double x) {
		//guardo en res el termino independiente
		double resultado=coeficientes[this.grado],pot=1;
		//lo resuelvo de atras para adelante para ir reutilizando el calculo de la pot
		for (int i=grado-1;i>=0;i--) {
			pot*=x;
			resultado+=(pot*coeficientes[i]);
		}
		return resultado;
	}
	
	//Ejercicio 4


}
