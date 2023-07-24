public class Playlist {

    public String time;
    public Song[] songs;
    public String name;
    public int songCount;
    public int count = 0;

    public Playlist(String name, int songCount) {
        this.name = name;
        songs = new Song[songCount];
        count = 0;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void addSong(Song song) {
        if (count >= songs.length) {
            System.out.println("It max capacity!!!");
            return;
        }
        songs[count] = song;
        count++;
    }

    public String showPlaylist() {
        String result = "Playlist : " + name + "\n";
        for (int i = 0; i < songs.length; i++) {
            if (i < count && songs[i] != null) {
                result += songs[i].toString() + "\n";
            } else {
                result += "Empty\n";
            }
        }
        return result;
    }

    public int totalDuration() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += songs[i].getDuration();
        }
        System.out.println("Total duration : " + total + " seconds");
        return total;
    }

    public int length() {
        int totalCount = 0;
        for (int i = 0; i < count; i++) {
            totalCount++;
        }
        System.out.println("Total song : " + totalCount);
        return totalCount;
    }

    public void removeSong(String title) {
        int indexToRemove = -1;
        for (int i = 0; i < count; i++) {
            if (songs[i].getTitle().equals(title)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            // Shift elements to the left, starting from the index to remove
            for (int i = indexToRemove; i < count - 1; i++) {
                songs[i] = songs[i + 1];
            }
            songs[count - 1] = null; // Remove the reference to the last element
            count--; // Decrement the count to reflect the removal of the song
        }
    }
}