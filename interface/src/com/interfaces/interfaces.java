package com.interfaces;

public interface interfaces {
	public abstract void one();
	default void two()
	{
		System.out.println("This is two method");
	}
}
interface three extends interfaces
{
	public abstract void four();
}

class myclass implements three
{

	@Override
	public void one() {
	System.out.println("This is one method");	
		
	}

	@Override
	public void four() {
		System.out.println("This is four method");
		
	}
	public static void main(String args[])
	{
		myclass m=new myclass();
		m.one();
		m.two();
		m.four();
	}
}
