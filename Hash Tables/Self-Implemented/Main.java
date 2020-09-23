// --== CS400 File Header Information ==--
// Name: Neil Bhutada
// Email: nbhutada@wisc.edu
// Team: MG
// TA: Mr. Harit
// Lecturer: Dr. Florian Heimeirl
// Notes to Grader: My Program worked perfectly fine on Eclipse

import java.util.NoSuchElementException;

class Test
{
	HashTableMap htm ;
	
	Test()
	{
		 htm = new HashTableMap(); //Declared a Hash Table of capacity 10
	}
	
	boolean putNonExistentKey()
	{  // This test would check if non-existent keys could be registered to the Hash Table.
		boolean success = htm.put("USA","Washington D.C.");
		if(success)
			return true;
		else 
			return false;
			
	}
	
	boolean putExistentKey()
	{ //This would check if existent keys would be inserted in the hash table.
	   boolean shouldBeFalse = htm.put("USA", "New Delhi"); // Since "9082549396" is a key that already exist, the output should be false.
	   if(!shouldBeFalse)
		   return true;
	   else
		   return false;
				 
	}
	
	boolean checkResizing()
	{
	//Lets us insert 8 elements in our hash table so that we could achieve a load factor of 0.8
		htm.put("Australia", "Canberra");
		htm.put("India", "New Delhi");
		htm.put("Srilanka", "Colombo");
		htm.put("Pakistan", "Islamabad");
		htm.put("Mexico", "Mexico City");
		htm.put("Greenland", "Nuuk");
		htm.put("England", "London");
		htm.put("Canada", "Vancouver");
		
		
		int testCapacity = htm.capacity;
		if (testCapacity == 20)//Since 10 was the original size of the Hash Table 
			return true;
		else
			return false;
	}
	
	boolean checkRemoval() //This method will check if the removal function works efficiently
	{
		int beforeRemovalSize = htm.size();
		htm.remove("Mexico");
		int afterRemovalSize = htm.size();
		if(afterRemovalSize == (beforeRemovalSize -1))
			return true;
		else
			return false;
			
	}
	
	boolean getException() throws NoSuchElementException
	{
		// This method would make sure that if an invalid key is entered for get function, it would throw an exception. 
		
		try
		{
			htm.get("China"); //A non-existent key in the hash table.
			
		}
		catch (NoSuchElementException e)
		{
			return true; //Should enter this block because NoSuchElementException will exist.
		}
		 return false;			
		
	}




}
public class Main {

	public static void main(String[] args) {
        
		Test test = new Test();
		boolean test1 = test.putNonExistentKey();
		System.out.println("The results for test1: "+test1);
		boolean test2 = test.putExistentKey();
		System.out.println("The results for test2: "+test2);
		boolean test3 = test.checkResizing();
		System.out.println("The results for test3: "+test3);
		boolean test4 = test.checkRemoval();
		System.out.println("The results for test4: "+test4);
		boolean test5 = test.getException();
		System.out.println("The results for test5: "+test5);
		
		
		
	
	}

}
