package basics;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {
	
	
	enum Country{
		
		India,
		Germany,
		Brazil,
		France,
		America,
		China,
		Rusia
	}
	
	
	public static void main(String args[]) {
		
		EnumSet<Country> cn= EnumSet.allOf(Country.class);
		
		System.out.println(cn);
		System.out.println("none of exmaple " + cn.noneOf(Country.class));
	
		EnumSet<Country> filterList= EnumSet.range(Country.Brazil, Country.China);
		System.out.println("range example " + filterList);
		
		EnumSet<Country> allCountry=EnumSet.allOf(Country.class);
		allCountry.add(Country.India);     		// india wouldn't be added as it is already present 
		
		Iterator<Country> it=allCountry.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	}

}
