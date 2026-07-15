package com.recursion;

public class MoveAllXToEnd {

	private static void move(String y, int i, int l,String k) {

		if (i == y.length()) {
			System.out.println(k);
			for(int g=0;g<l;g++) {
				k=k.concat("x");
				
			}
			System.out.println(k);
		return ;
			}
			
		

		if ((i < y.length()) && (y.charAt(i) == 'x')) {

			l = l + 1;
			//System.out.println(l);

		}
		else {
			k=k.concat(y.charAt(i)+"");
			
		}

		move(y,i+1,l,k);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		move("hexxxlxxxlo", 0, 0,"");
	}

}
