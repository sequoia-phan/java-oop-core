class Song {
	String title;
	String artist;

	void setTitle(String title) {
		this.title = title;
	}

	void setArtist(String artist) {
		this.artist = artist;
	}

	void  play(int times) {
		while (times > 0) {
		 System.out.println(this.title + "is playing...");
		 times -= 1;
		}
	}
}
