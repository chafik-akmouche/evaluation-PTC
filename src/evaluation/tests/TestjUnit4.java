package evaluation.tests;

import java.util.ArrayList;
import org.junit.Test;
import evaluation.Partition;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestjUnit4 {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	/*
	 * test "faux"
	 * le cas où la taille max des sous-listes est supérieure à la taille de la liste initiale
	 */
	public void sublistsMaxSizeIsGreaterThanInitList() {
		ArrayList myList = new ArrayList();
		for(int i=0; i<4; ++i) myList.add(i);
		ArrayList<ArrayList> returnedList;
		returnedList = Partition.partition(myList, 5);
		Assert.assertFalse("Devrait être faux: la liste renvoyée est vide", returnedList.size() > 0);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	/*
	 * test "vrai"
	 * taille de la liste initiale = 9
	 * taille max des sous-liste = 4
	 * taille de la liste contenant les sous-liste renvoyé doit être = 3
	 * [ [1 2 3 4] [5 6 7 8] [9] ] 
	 */
	public void simpleTest() {
		ArrayList myList = new ArrayList();
		for(int i=0; i<9; ++i) myList.add(i+1);
		ArrayList<ArrayList> returnedList = new ArrayList<ArrayList>();
		returnedList = Partition.partition(myList, 4);
		Assert.assertTrue("Devrait être vrai", returnedList.size() == 3);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	/*
	 * test "faux"
	 * taille de la liste initiale = 9
	 * taille max des sous-liste = 4
	 * taille de la liste contenant les sous-liste renvoyé doit être = 3
	 * [ [1 2 3 4] [5 6 7 8] [9] ]  
	 */
	public void simpleTest2() {
		ArrayList myList = new ArrayList();
		for(int i=0; i<9; ++i) myList.add(i+1);
		ArrayList<ArrayList> returnedList = new ArrayList<ArrayList>();
		returnedList = Partition.partition(myList, 4);
		Assert.assertFalse("Devrait être faux", returnedList.size() != 3);
	}	
}
