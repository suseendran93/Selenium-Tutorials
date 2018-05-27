package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {
	
	
	HashMapConcept() {
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
	
		hm.put(1, "Hi!");
		hm.put(2,"Hello");
		hm.put(3,"Bonjour");
		System.out.println(hm);//Prints the whole map 
	for(Entry<Integer,String> h:hm.entrySet()) {
		
		System.out.println(h.getKey()+": "+h.getValue());	
		
	}
	
	HashMap<Integer, Employee> hm2=new HashMap<Integer,Employee>(); 
		
		Employee e1=new Employee("Susee",25,"DA");
		Employee e2=new Employee("Indran",25,"DA");
		Employee e3=new Employee("Vishnu",26,"DA");
	
		hm2.put(1, e1);
		hm2.put(2, e2);
		hm2.put(3, e3);
		
		
		for(Entry<Integer,Employee> h:hm2.entrySet()) {
			
			System.out.println(h.getKey()+": "+h.getValue());	
			
			
		}
		
}
	}
