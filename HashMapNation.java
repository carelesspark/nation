import java.util.*;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
		while (true) { // "�׸�"�� �Էµ� ������ �ݺ�
			System.out.print("���� �̸�, �α� >> ");
			String name = scanner.next();

			if (name.equals("�׸�")) {
				break;
			}

			int size = scanner.nextInt();
			Integer changeSize = Integer.valueOf(size);

			nations.put(name, changeSize);
		}

		while (true) {
			System.out.print("�α� �˻� >> ");
			String country = scanner.next(); // ���� �Է� ����
			if (country.equals("�׸�"))
				break;
			Integer population = nations.get(country); // key�� ���� value�� ����
			if (population != null) { // �Է¹��� ���� ������ ��
				System.out.println(country + "�� �α��� " + population);
			} else { // �Է¹��� ���� �������� ���� ��
				System.out.println(country + " ����� �����ϴ�.");
			}
		}

		scanner.close();
	}

}
