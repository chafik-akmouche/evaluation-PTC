package evaluation;

import java.util.ArrayList;
/** 
 * @author Chafik
 */
public class Partition {

	/**
	 * Méthode permettant le découpage d'une liste en plusieurs sous-listes d'une taille maximale choisie par l'utilisateur
	 * Tous les types de listes sont acceptés (int, string, float...)
	 * 
	 * @param ArrayList: liste à diviser
	 * @param int: taille max des sous-listes
	 * @return ArrayList: liste contenant les sous-listes (liste de listes) 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList<ArrayList> partition(ArrayList myList, int size) {
		ArrayList<ArrayList> globalList = new ArrayList<ArrayList>();
		ArrayList tmp_subList = new ArrayList();
		int index = 0;		
		if (myList.size() >= size) {
			for(int i=0; i<myList.size(); i++) {
				if(index == size-1) {
					tmp_subList.add(myList.get(i));
					globalList.add(tmp_subList);
					index = 0;
					tmp_subList = new ArrayList();
				} else {
					if (i == myList.size()-1) {
						tmp_subList.add(myList.get(i));
						globalList.add(tmp_subList);
					} else {
						tmp_subList.add(myList.get(i));
						index += 1;
					}
				}
			}	
		}
		return globalList;
	}	
}
