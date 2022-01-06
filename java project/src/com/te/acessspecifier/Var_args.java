package com.te.acessspecifier;

public class Var_args {
public static int add(int...x) {
	int result=0;
	for(int i=0;i<x.length;i++)
	{
		result+=x[i];
		
	}
	return result;
	
}
	public static void main(String[] args) {
		int sum=add(1,4,5,6);
		System.out.println(sum);

	}

}
