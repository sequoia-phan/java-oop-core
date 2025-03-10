package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    @Test
    public void titleTest() {
        Song song = new Song("another love", "tom", "5", "aaa");
        assertInstanceOf(Song.class, song);
    }
}