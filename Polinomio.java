public class Polinomio {
	
	private int grado ; 
	private double [] coeficientes;
	
	public Polinomio(int g, double[] c) {
		grado=g;
		coeficientes = c;
	}
	
	//Ejercicio 1
	double evaluarMSucecivas(double x){		
		double suma=0;
		for(int i=0; i < coeficientes.length-1 ; i++){
			double multi=x;
			for(int j=0; j<grado-i-1 ;j++){
				multi*=x;
			}
			suma+= coeficientes[i]*multi;
		}
		return suma+coeficientes[coeficientes.length-1];
	}
	
	//Ejercicio 2
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
	
	//Ejercicio 5
	double evaluarPow(double x){
		double result=coeficientes[coeficientes.length -1];
		for(int i=0;i<coeficientes.length-1;i++)
			result+= coeficientes[i]*Math.pow(x, coeficientes.length -i-1);	
		return result;
	}
	
	//Ejercicio 6
	double evaluarHorner(double x) { 
        	double resultado = coeficientes[0];   
  		for (int i=1; i<coeficientes.length; i++) 
        		resultado = resultado*x + coeficientes[i]; 
        	return resultado; 
    	} 
	
	
	
	


}
