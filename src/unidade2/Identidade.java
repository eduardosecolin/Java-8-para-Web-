package unidade2;

import javax.swing.JApplet;

public class Identidade extends JApplet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() {
		int mat[][] = new int[3][3];
		 for(int i = 0; i < 3; i++){
			 for(int j = 0; j < 3; j++){
				 mat[i][j] = 0;
			 }
		 }
		 for(int i = 0; i < 3; i++){
			 for(int j = 0; j < 3; j++){
				 mat[i][i] = 1;
			 }
		 }
		 for(int i = 0; i < 3; i++){
			 for(int j = 0; j < 3; j++){
				 System.out.print(mat[i][j] + " ");
			 }
			 System.out.println(" ");
		 }
		 try{
			 Thread.sleep(2000);
		 }catch(InterruptedException e){
			 System.out.println(e.getMessage());
		 }
		 System.exit(0);
	}

}
