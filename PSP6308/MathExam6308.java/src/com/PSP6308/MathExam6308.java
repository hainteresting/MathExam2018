package com.PSP6308;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MathExam6308 {
	public static void main(String[] args)  throws Exception{
		File file = new File("cc.txt");
 		FileWriter fw = new FileWriter(file);
 		BufferedWriter bw1 = new BufferedWriter(fw);
 		bw1.write(1);
 		 Scanner s=new Scanner(System.in);
		   
	        System.out.println("������һ����������");
	        int n=s.nextInt();	       
	        System.out.println("��������"+n+"����Ŀ");
	        String [] arry =  new String[n];
	        int [] answer =new int[n];
	       
	      for (int i = 0; i < n; i++) {
	    	 
	        int x=0+(int)(Math.random()*2);
	        if(x==0) {
	        	int x1=0+(int)(Math.random()*100);
	        	int x2=0+(int)(Math.random()*100);	        	 
	        
	        	arry[i]=x1+"+"+x2+"=";
	        	answer[i]=(x1+x2);
				bw1.write(arry[i]);	
				bw1.newLine();
				System.out.println(arry[i]);
	        	}
	        else{
	        	int x1=0+(int)(Math.random()*100);
	        	int x2=0+(int)(Math.random()*100);
	        	
	        	arry[i]=x1+"-"+x2+"=";
	        	answer[i]=(x1-x2);
				bw1.write(arry[i]);	
				bw1.newLine();
				System.out.println(arry[i]);
	        }}
	      bw1.write(("-------------��׼��--------------"));
	      bw1.newLine();
	      System.out.println("-------------��׼��--------------");
	    
				
	 			
		         for (int i1 = 0; i1<n; i1++) {
					bw1.write((arry[i1]+answer[i1]));
					bw1.newLine();
					System.out.println(arry[i1]+answer[i1]);
					
		         }bw1.close();

		
		
		
	}
	        }
	

	      
	 
	   
	
	
