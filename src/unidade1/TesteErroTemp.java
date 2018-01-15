package unidade1;

import java.util.Formatter;

// exerciico do final da unidade 1
public class TesteErroTemp {
	private int x;
	private static Formatter f;
	public TesteErroTemp(){
		x = 10;
	}
	public TesteErroTemp(int c, int d){
		x = c + d;
	}
	public int getX(){
		return x;
	}
	public void m1(int a){
		int p;
		try{
			p = x % a;
			if(p < 4){
				throw new DivisaoZeroException();
			}
		}catch(DivisaoZeroException e){
			x+= 5;
			return;
		}catch(Exception e){
			x+= 7;
			return;
		}finally{
			x+= 9;
		}
		return;
	}
	
	public static void main(String[] args) {
		/*
		TesteErroTemp t = new TesteErroTemp(1,2);
		t.m1(5);
		System.out.println(t.getX());
		*/
		String s = "hello123";
		f = new Formatter();
		f.format("%S", s);
		System.out.println(s);
	}

}
