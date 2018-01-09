package unidade3;

public class NotaAluno {
   double valor;
   
   <T extends Number>NotaAluno(T obj){
	   this.valor = obj.doubleValue();
   }
   
   <T extends Number>double retornarValor(T obj){
	   return obj.doubleValue();
   }
}
