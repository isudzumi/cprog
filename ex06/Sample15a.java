public class Sample15a {
	public static void main(String[] args) {
		boolean len = args.length > 1;
		if(len) {
			System.out.println("第１引数:" + args[0]);
			System.out.println("第2引数:" + args[1]);
		}
	}
}