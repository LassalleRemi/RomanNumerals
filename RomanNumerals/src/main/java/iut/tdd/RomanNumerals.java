package iut.tdd;

public class RomanNumerals {
	String[] r = new String[]{"I","V","X","L","C","D","M"};
	int[] n = new int[]{1,5,10,50,100,500,1000};
	
	String[] r2 = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
	int[] n2 = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
	public String convertToRoman(String arabe) {
		String m="";
		int res = Integer.parseInt(arabe);
		while(res>0){
			for(int i=n2.length-1;i>=0;i--){
				int e=res/n2[i];
				res=res-e*n2[i];
				for(int j=0;j<e;j++){
					m+=r2[i];
				}
			}
		}
		return m;
	}

	public String convertFromRoman(String roman) {
		String d=""; 
		int s=0;int i1=0;int i2=0;
		for(int i=0;i<roman.length();i++){
			String c=roman.substring(i,i+1);
			for(int x=0;x<r.length;x++){
				if (r[x].equals(c)) i1=x;
			}
			if (i+1<roman.length()){
				d=roman.substring(i+1,i+2);
				for(int y=0;y<r.length;y++){
					if (r[y].equals(d)) i2=y;
				}
			}
			if (i1<i2) s-=n[i1];
			else s+=n[i1];
		}	
		return ""+s;
	}

}
