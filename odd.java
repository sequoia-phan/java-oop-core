class Odd {
	public static void main(String[] args) {
		int num = 10;

		int posNum = 1;
		int negNum = -3;

		System.out.println(posNum);
		System.out.println(negNum);
		while (true) {

			posNum+=4;
			if (posNum > num) return;
			System.out.println(posNum);

			negNum-=4;
			if (Math.abs(negNum) > num) return;
			System.out.println(negNum);
		}
	}
 }
