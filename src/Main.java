import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<>(4);

		String v;
		v = hashMap.put("+79005551123", "Сергей");
		v = hashMap.put("+79005551123", "Алексей");
		v = hashMap.put("+79005551124", "Александр1");
		v = hashMap.put("+79005551125", "Александр2");
		v = hashMap.put("+79005551126", "Александр3");
		v = hashMap.put("+79005551127", "Александр4");
		v = hashMap.put("+79005551128", "Александр5");
		v = hashMap.put("+79005551129", "Александр6");
		v = hashMap.put("+79005551130", "Александр7");
		v = hashMap.put("+79005551131", "Александр8");
		v = hashMap.put("+79005551132", "Александр9");


		System.out.println("-".repeat(10));
		v = hashMap.remove("+79005551124");
		System.out.println(v);
		System.out.println("-".repeat(10));

		for (Map.Entry<String, String> iter : hashMap.entrySet()) {
			String key = iter.getKey();
			String value = iter.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}

	}

}
