/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws java.lang.Exception {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		int t=0, N=0;
		
		t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			N = Integer.parseInt(br.readLine());
			int Array[] = new int[N];
			String[] a = br.readLine().split(" ");
			
			//Array = br.readLine();
			for(int i = 0; i<N; i++){
				Array[i] = Integer.parseInt(a[i]);
				
				}
			StringBuffer sb = new StringBuffer();
			for(int i=0; i<N-1; i++){
				if(Array[i+1] < Array[i] ){
					sb.append(Array[i+1] + " ");
					//System.out.println(sb);
				}
				else
					sb.append("-1" + " ");
					//System.out.print("-1" + " ");
				
				}
			sb.append("-1");	
			System.out.println(sb);	
			//sb.close();	
			//System.out.println(Arrays.toString(Array));	
			
			
			}
	}
}
