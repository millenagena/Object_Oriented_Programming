package lab03;

public class Tempo {
	private int hr;
	private int min;
	private int seg;
	
	public Tempo(int hr, int min, int seg) {		
		if(hr >= 0 && hr <= 23) {
			this.hr = hr;
		}else {
			this.hr = 0;
		}
		if(min >= 0 && min <= 59) {
			this.min = min;
		}else {
			this.min = 0;
		}
		if(seg >= 0 && seg <= 59) {
			this.seg = seg;
		}else {
			this.seg = 0;
		} 
	}
	
	public void mostraTempo() {
		System.out.println(String.format("%02d", this.hr) + "h " +
						   String.format("%02d", this.min) + "min " +
						   String.format("%02d", this.seg) + "seg ");
	}
	
	public void mostraTempoAmerican() {
		if(this.hr >= 1 && this.hr <= 11) {
			System.out.println(String.format("%02d", this.hr) + ":" + 
					   String.format("%02d", this.min) + ":" +
					   String.format("%02d", this.seg) + " AM");
		}else if(this.hr == 0){
			System.out.println(String.format("%02d", this.hr + 12) + ":" + 
					   String.format("%02d", this.min) + ":" +
					   String.format("%02d", this.seg) + " AM");
		}else {
			System.out.println(String.format("%02d", this.hr - 12) + ":" + 
					   String.format("%02d", this.min) + ":" +
					   String.format("%02d", this.seg) + " PM");
		}
	}
	
	public void ajustaMinuto(String op) {
		if(op.equalsIgnoreCase("i")) {
			 if(this.min < 59) {
				 this.min += 1;
			 }else{
				 this.hr += 1;
				 this.min = 0;
			 }
		}else if(op.equalsIgnoreCase("d")) {
			if(this.min > 0) {
				 this.min -= 1;
			 }else{
				 this.hr -= 1;
				 this.min = 59;
			 }
		}
	}
	
	
}
