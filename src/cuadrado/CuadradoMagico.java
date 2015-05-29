package cuadrado;

public class CuadradoMagico {
	private int[][] m;
	
	public CuadradoMagico(int[][] digitos){
		this.m = digitos;
	}
	
	// Public Functions
	
	public boolean validate(){
		boolean validation = false;
		if(this.validateValues()){
			int d = sumDiagonal();
			int v = sumVert();
			int h = sumHoriz();
			if( d==v && v==h && d==h)
				validation = true;
		}
		return validation;
	}

	// Private Functions

	private boolean validateValues(){
		boolean validation = true;
		int e = 0;
		//for each element
		for(int a=0; a<m.length; a++){
			for(int b=0; b<m[0].length; b++){
			e = m[a][b];
			//exit false if out of range
			if(e > 9 || e < 1){ System.out.println("validateValues() : Valor fuera de rango 1-9");return false; };
			//check against the others
				for(int i=0; i<m.length; i++){
					for(int j=0; j<m[0].length; j++){
						if(a!=i && b!=j){
							if(m[i][j] == e){
								validation = false;
								System.out.println("validateValues() : Valor repetido");
							}
						}
					}
				}
			//----
			}//end for b
		}//end for a

		return validation;
	}
	
	
	private int sumDiagonal(){
		int result = -1;
		int d1 = 0;
		int d2 = 0;

		for(int i=0; i<m.length; i++){
			d1 += m[i][i];
		}
		for(int i= m.length-1; i >= 0; i--){
			d2 += m[i][i];
		}

		if(d1 == d2)
			result = d1;

		return result;
	}
	
	private int sumHoriz(){
		boolean equal = true;
		int[] res = new int[m.length];
		
		for(int i=0; i<m.length; i++){
			int sum = 0;
			for(int j=0; j<m.length; j++){
				sum += m[i][j];
			}
			res[i] = sum;
		}
		
		for(int i=0; i<res.length-1; i++){
			if(res[i] != res[i+1]){
				equal = false;
			}
		}
		if(!equal){res[0] = -2;};
		return res[0];
	}
	
	private int sumVert(){
		boolean equal = true;
		int[] res = new int[m.length];
		
		for(int i=0; i<m.length; i++){
			int sum = 0;
			for(int j=0; j<m.length; j++){
				sum += m[j][i];
			}
			res[i] = sum;
		}
		
		for(int i=0; i<res.length-1; i++){
			if(res[i] != res[i+1]){
				equal = false;
			}
		}
		if(!equal){res[0] = -3;};
		return res[0];
	}
}
