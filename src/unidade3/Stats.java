package unidade3;

public class Stats<T extends Number> {
   
	public T[] num;
	
	public Stats(T[] num){
		this.num = num;
	}
	
	private double media(){
		int i = 0;
		double soma = 0;
		for(i = 0; i < num.length; i++){
			soma += num[i].doubleValue();
		}
		return soma/i;		
	}
	public double getMedia(){
		return media();
	}
	public String mostrarMedia(){
		return "A media é: " + this.getMedia();
	}
}
