package Esercitazione1;

public class esercizi {

	public static void main(String[] args) {
		

	
		//esercizio1
		int [] interi = {1, 5, 3, 7, 6, 9, 3, 4};
		mergeSort(interi, interi.length);
		for (int i = 0; i < interi.length; i++)
			System.out.println(interi[i]);
		
		
		
		//es2
		
		String s1 = "Osso";
		String s2 = "Fosso";
		String s3 = "osso";
		String s4 = "Ostso";
		
		System.out.println(palindroma(s1));
		System.out.println(palindroma(s2));
		System.out.println(palindroma(s3));
		System.out.println(palindroma(s4));
		
		//es3
		
	    long alfa = 0;
	    alfa = fibonacci(50);
	    System.out.println(alfa);
	    
	    //es4
	    
	    int[][] m = new int [3] [2];
	    m[0][0] = 1;
	    m[0][1] = 5;
	    m[1][0] = 6;
	    m[1][1] = 3;
	    m[2][0] = 9;
	    m[2][1] = 7;
	    
	    int[][] mt = trasposta(m);
	    
    	for (int i=0; i<m.length; ++i) {
    		for (int j=0; j<m[i].length; ++j) 
    			System.out.print(m[i][j]+" ");
			System.out.println();
    		}
    	
    	System.out.println();
    	
    	for (int i=0; i<mt.length; ++i) {
    		for (int j=0; j<mt[i].length; ++j) 
    			System.out.print(mt[i][j]+" ");
   			System.out.println();
 
    		}
    	
    	

	}
	
	
	
	public static void mergeSort(int[] a, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);

	    merge(a, l, r, mid, n - mid);
	}
	
	public static void merge(
			  int[] a, int[] l, int[] r, int left, int right) {
			 
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			}
	
	//metodo es2
	public static boolean palindroma(String s) {
		boolean palindroma = true;
		for (int i=0; i<=s.length()/2; ++i) 
			if (Character.toLowerCase(s.charAt(i))!=(Character.toLowerCase(s.charAt(s.length()-i-1))))
				palindroma = false;
		return palindroma;
			
				
	}
	
	//metodo es3
	
    public static long fibonacci(long N)  // ho usato long altrimenti con 16 bit non riesce a rappresentare la fine della serie
    {
        long num1 = 0, num2 = 1, num3 = 0;
  
        int counter = 0;
  
        // Iterate till counter is N
        while (counter < N) {
  
            // Print the number
            System.out.print(num1 + " ");
  
            // Swap
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        return num3;
    }
    
    
    public static int[][] trasposta(int [][] m) {
    	int[][] mt = new int [m[0].length][m.length];
    	for (int i=0; i<m.length; ++i)
    		for (int j=0; j<m[i].length; ++j)
    			mt[j][i] = m[i][j];
    	return mt;
    			
    }
}
