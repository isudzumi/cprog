public class Sample18 {
	public static void main(String[] args) {
		int i = (int)(Math.random() * 10);
		int amari = i % 3;
		switch(amari) {
			case 0: System.out.println("����" + i + "��3�̔{���ł��B");
				break;
			case 1: System.out.println("����" + i + "��3�̔{��+1�ł��B");
				break;
			case 2: System.out.println("����" + i + "��3�̔{��+2�ł��B");
				break;
			default:
				break;
		}
	}
}