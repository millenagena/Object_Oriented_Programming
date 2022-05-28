package circulo;

import java.lang.Math;

public class Ponto {
	private int x;
    private int y;
    
    public boolean ehNegativo(int num) {
    	return (num < 0);
    }
        
    public void salvaCoordenadas(int x1, int y1){  	
    	if(ehNegativo(x1)) {
    		this.x = 0;
    	}else{
    		this.x = x1;
    	}
    	if(ehNegativo(y1)) {
    		this.y = 0;
    	}else {
    		this.y = y1;
    	}      
    }
    
    public double distanciaPontos(int xp, int yp) {
    	double dist;
    	dist = Math.sqrt(Math.pow(this.x - xp, 2) + Math.pow(this.y - yp, 2));
    	
    	return dist;
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}  
}
