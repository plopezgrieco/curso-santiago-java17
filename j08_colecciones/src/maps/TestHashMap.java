package maps;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		Map<Integer, String> nums = new HashMap<Integer, String>();
		
		nums.put(1, "Uno");
		nums.put(12, "Doce");
		nums.put(124, "Ciento veinticuatro");
		
		System.out.println(nums.get(12));
		System.out.println(nums.getOrDefault(77, "No existe"));
		System.out.println("--------");
		
		//recorrer las claves
		for (Integer key : nums.keySet()) {
			System.out.println(key);
		}
		System.out.println("--------");
		
		//recorrer los valores
		for (String value : nums.values()) {
			System.out.println(value);
		}
		System.out.println("--------");
		
		for (Map.Entry<Integer, String> entry : nums.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
