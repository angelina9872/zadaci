
		package vezbanjee;

		public class Zadatak_1_08132019 {

			public static void main(String[] args) {

				int i = 3;//4,3,5,4,3,72,71,4,5
				int j = 5;//8,7,6,17,18,17,18,7
				int k = 4;//5,11,12,13,4,5,4,3,4
				
				
				
				j = i++ + ++k; 
				/*postincrement i preincrement; 
				vrednost i se povecava za 1 ali se ne dodeljuje stoga u formuli ostaje 3,
				a k se odmah povecava i dodeljuje tako dobija vrednost 5;*/
				
				k = i-- + --j; /* 
				postdecrement i predecrement
				vrednost i se oduzima za 1 ali se ne dodeljuje stoga u formuli ostaje 4,
				a i se odmah oduzima za 1 i dodeljuje tako dobija vrednost 4;*/
				
				i = k++ - --j; 
				/*postincrement i predecrement
				vrednost k se povecava ali se ne dodeljuje stoga u formuli ostaje 11,
				a j se odmah oduzima za 1 i dodeljuje tako dobija vrednost 6;*/
			
				j = --i + ++k; 
				/*predecrement i preincrement
				 vrednost i se smanjuje i dodeljuje, postaje 4,
				 vrednost k se povecava i dodeljuje, postaje 13*/
				 
				 
				i = ++j * i--; 
				/*preincrement i postdecrement
				vrednost j se povecava i dodeljuje,postaje 18
				vrednost i se smanjuje ali se ne dodeljuje,u formuli ostaje 4*/
				
				k=--i /	--j;
				/*predecrement i predecrement
				i se smanjuje za jedan i dodeljuje se,postaje 71 
				j se smanjuje za jedan i dodeljuje se,postaje 17*/
				
				i=++j/k--;//
				/*preincrement i postdecrement
				 vrednost j se povecava i dodeljuje,postaje 18
				 vrednost k se smanjuje ali se ne dodeljuje, ostaje 4*/
				
				 j=k++ + i++;//j=3+4=7
				 /*k se povecava sa 1 ali se ne dodeljuje, ostaje 3
				 i se povecava ali se ne dodeljuje, ostaje 4*/
				
				
			}

	}


