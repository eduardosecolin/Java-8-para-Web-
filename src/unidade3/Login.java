package unidade3;

public class Login<T, V> {
    T obj;
    V obj1;
    
    public Login(T obj, V obj1){
    	this.obj = obj;
    	this.obj1 = obj1;
    }
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public V getObj1() {
		return obj1;
	}
	public void setObj1(V obj1) {
		this.obj1 = obj1;
	}
	
	public void showType(){
		System.out.println(this.obj.getClass().getName());
		System.out.println(this.obj1.getClass().getName());
	}
	@Override
	public String toString() {
		return "Login : Usuario = " + obj + " , Senha = " + obj1;
	}
	
    
}
