import java.util.*;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		while (true) { // "그만"이 입력될 때까지 반복
			System.out.print("나라 이름, 인구 >> ");
			String name = scanner.next();

			if (name.equals("그만")) {
				break;
			}

			int size = scanner.nextInt();
			Integer changeSize = Integer.valueOf(size);

			nations.put(name, changeSize);
		}

		while (true) {
			System.out.print("인구 검색 >> ");
			String country = scanner.next(); // 나라를 입력 받음
			if (country.equals("그만"))
				break;
			Integer population = nations.get(country); // key에 대한 value값 받음
			if (population != null) { // 입력받은 나라가 존재할 시
				System.out.println(country + "의 인구는 " + population);
			} else { // 입력받은 나라가 존재하지 않을 시
				System.out.println(country + " 나라는 없습니다.");
			}
		}

		scanner.close();
	}

}
