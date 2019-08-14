package com.db1.db1start;

public class MinD3 {
	double n1;
	double n2;
	double n3;	
		
	public Object min() {
		if(n1 < n2 && n1 < n3) {
			return n1;
		}
		else if(n2 < n3 && n2 < n1){
			return n2;
		}
		else {
			return n3;
		}
		
	}

}
