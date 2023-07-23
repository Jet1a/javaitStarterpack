package SongOOP;

public class SongMain {
    public static void main(String[] args) {
        Song song1 = new Song("Shape","Ed",234);
        Song song2 = new Song("Pop","Ed",278);
        Song song3 = new Song("World","Anna",280);
        song1.addToFavorite();
        song1.getFormattedDuration();
        // song1.isSameArtist(song2);
        song2.isSameArtist(song3);
        song1.isFavorite();
        song1.addToFavorite();
        song1.printSong();
        song2.getFormattedDuration();
        song2.addToFavorite();
        song2.printSong();  
        song3.getFormattedDuration();
        song3.printSong();
    }
}