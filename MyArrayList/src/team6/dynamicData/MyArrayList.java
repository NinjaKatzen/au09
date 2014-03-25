package team6.dynamicData;
/**
 * Stellt die FunktionalitÃ¤t einer ArrayList ohne Collections
 * nach.
 */
public class MyArrayList {
	
	/**
	 * Speichert die Daten der "Collection"
	 */
	private Object[] data;
	
	/**
	 * 
	 * @author Tobias Perny
	 */
	public MyArrayList(){
		
	}
	
	/**
	 * 
	 * @param o
	 * @autor Tobias Perny
	 */
	public MyArrayList(Object[] o){
		
	}
	
	/**
	 * 
	 * @param size
	 * @author Tobias Perny
	 */
	public MyArrayList(int size){
		
	}
	
	/**
	 * 
	 * @param o
	 * @author Niklas Hohenwarter
	 */
	public boolean add(Object o){
		return false;
		
	}
	
	/**
	 * 
	 * @param index
	 * @param o
	 * @author Niklas Hohenwarter
	 */
	public void add(int index, Object o){
		
	}
	
	/**
	 * Mehode die den Inhalt des Object Arrays löscht
	 * 
	 * @author Inga Keilholz
	 */
	public void clear(){
		
		data = new Object[0];
		
	}
	
	/**
	 * Methode die überprüft ob ein Objekt im Array enthalten ist
	 * 
	 * @param o
	 * @return
	 * @author Inga Keilholz
	 */
	public boolean contains(Object o){
		
		for(int i=0; i<data.length; i++){
			if(data[i]==o){
				return true;
			}	
		}
		
		return false;
		
	}
	
	/**
	 * Methode die ein Objekt an einer bestimmten Stelle, dem Index, 
	 * zurück gibt
	 * 
	 * @param index
	 * @return 
	 * @author Inga Keilholz
	 */
	
	public Object get(int index){
		
			return data[index];
		
	}
	
	/**
	 * 
	 * @param o
	 * @return
	 * @author Tobias Perny
	 */
	public int indexOf(Object o){
		return 0;
		
	}
	
	/**
	 * Methode die überprüft ob das Object leer ist.
	 * 
	 * @return
	 * @author Inga Keilholz
	 */
	public boolean isEmpty(){
		
		if(data.length==0){
			return true;
		}
		
		return false;
		
	}
	
	/**
	 * Geht die gesamte gespeicherte Liste durch und sucht nach dem übergebenen Objekt. Zurückgegeben wird der Index,
	 * an dem das Objekt gespeichert ist. Sollte das Objekt mehrfach in der Liste vorkommen, so wird der letzte Index, 
	 * an dem das Objekt gefunden wurde, zurückgegeben.	 * 
	 * @param o Das Objekt, nach dem in der Liste gesucht werden soll
	 * @return Den Index, an dem das übergebene Objekt als letztes in der Liste vorkommt, oder -1, falls das Objekt nicht in
	 * der Liste vorkommt
	 * @author Selina Brinnich
	 */
	public int lastIndexOf(Object o){
		int index = -1;
		
		for(int i = 0; i < data.length; i++){
			if(o == data[i]){
				index = i;
			}
		}
		
		return index;
	}
	
	/**
	 * Löscht ein einziges Element aus der gespeicherten Liste. Dieses Element wird durch den übergebenen Index bestimmt.
	 * @param index Der Index des zu löschenden Elementes der Liste
	 * @author Selina Brinnich
	 */
	public void remove(int index){
		Object[] dataN = new Object[data.length-1];
		for(int i = 0; i < data.length; i++){
			if(i != index){
				if(i < index){
					dataN[i] = data[i];
				}else{
					dataN[i-1] = data[i];
				}
			}
		}
		
		this.data = dataN;
	}
	
	/**
	 * Löscht ein bestimmtes Objekt aus der gespeicherten Liste. Sollte dieses Objekt mehrfach in der Liste vorkommen,
	 * so werden alle entsprechenden Objekte gelöscht.
	 * @param o Das zu löschende Objekt
	 * @return true, falls das/die Objekt/e erfolgreich aus der Liste gelöscht wurde/n <br>
	 * 			false, falls das Objekt nicht gelöscht werden konnte (wenn das Objekt nicht in der gespeicherten Liste 
	 * 			vorkommt)
	 * @author Selina Brinnich
	 */
	public boolean remove(Object o){
		int z = 0;
		for(int i = 0; i < data.length; i++){
			if(o == data[i]){
				z++;
			}
		}
		
		if(z > 0){
			Object[] dataN = new Object[data.length-z];
			int indexN = 0;
			for(int i = 0; i < data.length; i++){
				if(o != data[i]){
					dataN[indexN] = data[i];
					indexN++;
				}
			}
			this.data = dataN;
			
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 
	 * @param o
	 * @return
	 * @author Niklas Hohenwarter
	 */
	public boolean removeAll(Object[] o){
		return false;
		
	}
	
	/**
	 * 
	 * @param fromIndex
	 * @param toIndex
	 * @author Niklas Hohenwarter
	 */
	public void removeRange(int fromIndex, int toIndex){
		
	}
	
	/**
	 * Löscht alle Elemente aus der Liste, mit Ausnahme von den übergebenen Objekten.
	 * @param o Ein Array von Objekten, welche in der Liste behalten werden sollen
	 * @author Selina Brinnich
	 */
	public void retainAll(Object[] o){
		int z = 0;
		for(int i = 0; i < data.length; i++){
			for(int j = 0; j < o.length; j++){
				if(data[i] == o[j]){
					j = o.length;
				}else{
					if(j == (o.length-1)){
						data[i] = null;
						z++;
					}
				}
			}
		}
		if(z > 0){
			Object[] dataN = new Object[data.length-z];
			int indexN = 0;
			for(int i = 0; i < data.length; i++){
				if(o != data[i]){
					dataN[indexN] = data[i];
					indexN++;
				}
			}
			this.data = dataN;
		}
		
	}
	
	/**
	 * 
	 * @param index
	 * @param o
	 * @return
	 * @author Tobias Perny
	 */
	public Object set(int index, Object o){
		return o;
		
	}
	
	/**
	 * Methode die zurück gibt wie lang das Object Array ist.
	 * 
	 * @return
	 * @author Inga Keilholz
	 */
	public int size(){
		
		return data.length;
		
	}
	
	/**
	 * Gibt das Array mit den Daten zurÃ¼ck.
	 * @return Daten-Attribut
	 * @author Niklas Hohenwarter
	 */
	public Object[] toArray(){
		return data;	
	}
	
}
