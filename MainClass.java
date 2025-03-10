class Main {
	public static void main (String[] args) {
		Song t2 = new Song();

		t2.setArtist("MTP");
		t2.setTitle("ECNHQ");
		// System.out.println(t2.play() + "is playing...");
		t2.play(2);

		Song t3 = new Song();

		t3.setArtist("KEANE");
		t3.setTitle("Somewhere only we know");
		// System.out.println(t3.play() + "is playing...");
		t3.play(3);
	}
}
