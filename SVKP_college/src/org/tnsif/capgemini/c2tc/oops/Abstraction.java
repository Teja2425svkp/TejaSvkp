package org.tnsif.capgemini.c2tc.oops;

public class Abstraction {

	public static void main(String[] args) {
		MaheshDemo obj=new RameshDemo();
		obj.calling();
		obj.AIIntegration();
		obj.SatelliteComm();
		obj.HealthMontoring();
	}

}
abstract class MaheshDemo{ //2015
	

	public void calling() //concrete method
	{
		System.out.println("calling");
	}
	
	public abstract void AIIntegration(); //abstract method
	public abstract void SatelliteComm();
	public abstract void HealthMontoring();
	
}

abstract class SureshDemo extends MaheshDemo //2016
{
	public void AIIntegration()
	{
		System.out.println("Phone is integrated with AIIntegration");
	}
	
}

class RameshDemo extends SureshDemo                 //2017
{

	@Override
	public void SatelliteComm() {
		System.out.println("Phone is integrated with SatelliteComm ");
		
	}

	@Override
	public void HealthMontoring() {
		System.out.println("Phone is integrated with HealthMontoring");
		
	}
	
	}
