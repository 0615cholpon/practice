package IbrahimMentor;
import java.util.HashMap;
import java.util.Map;

public class HashMapMan {
	public static void main(String[] args) {
		//int [] arr = {5, 2, 2, 1, 1};
		String s = "cholpon";
		
		Map<Character, Integer> map =  new HashMap<>();
		
//		
//		map.put('a', 5);
//		System.out.println(map.get('a'));
//		System.out.println(arr[0]);
		
		for(char ch: s.toCharArray()) { //iterate each char
			                            //use hashmap
			                            //if char contains skip else store them
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch) + 1);
			}
		}
		System.out.println(map);
	}

}
