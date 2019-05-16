import java.util.Scanner;

public class ChainHashTester {
	static Scanner sc = new Scanner(System.in);

	// ������(ȸ����ȣ+�̸�)
	static class Data {
		static final int NO = 1;
		static final int NAME = 2;

		private Integer no;
		private String name;

		// Ű ��
		Integer keyCode() {
			return no;
		}

		public String toString() {
			return name;
		}

		// ������ �Է�
		void scanData(String guide, int sw) {
			System.out.println(guide + "�� ������ �Է�>");

			if ((sw & NO) == NO) {
				System.out.print("��ȣ : ");
				no = sc.nextInt();
			}
			if ((sw & NAME) == NAME) {
				System.out.print("�̸� : ");
				name = sc.next();
			}
		}
	}

	// �޴�����
	enum Menu {
		ADD("�߰�"), REMOVE("����"), SEARCH("�˻�"), DUMP("ǥ��"), TERMINATE("����");

		private final String message;

		static Menu MenuAt(int idx) { // ������ idx�� ���� ��ȯ
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		// ������
		Menu(String string) {
			message = string;
		}

		// ����� ���ڿ��� ��ȯ
		String getMessage() {
			return message;
		}
	}

	// �޴� ����
	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m : Menu.values())
				System.out.printf("(%d) %s ", m.ordinal(), m.getMessage());
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu;
		Data data; // �߰��� ������ ����
		Data temp = new Data(); // �Է¿� ������

		ChainHash<Integer, Data> hash = new ChainHash<Integer, Data>(13);

		do {
			switch (menu = SelectMenu()) {
			case ADD:
				data = new Data();
				data.scanData("�߰�", Data.NO | Data.NAME);
				hash.add(data.keyCode(), data);
				break;

			case REMOVE:
				temp.scanData("����", Data.NO);
				hash.remove(temp.keyCode());
				break;

			case SEARCH:
				temp.scanData("�˻�", Data.NO);
				Data t = hash.search(temp.keyCode());
				if (t != null)
					System.out.println("�� Ű�� ���� �����ʹ� " + t + "�Դϴ�.");
				else
					System.out.println("�� �����Ͱ� �����ϴ�.");
				break;

			case DUMP: // ���
				hash.dump();
				break;
			}
		} while (menu != Menu.TERMINATE);

	}
}