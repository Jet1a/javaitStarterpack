class myPlaylist {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("My Playlist", 5);

        playlist.addSong(new Song("Song 1", "Artist 1", 120));
        playlist.addSong(new Song("Song 2", "Artist 2", 130));
        playlist.addSong(new Song("Song 3", "Artist 3", 140));

        System.out.println(playlist.showPlaylist());

        playlist.totalDuration();

        playlist.length();

        playlist.removeSong("Song 2");

        System.out.println(playlist.showPlaylist());
    }
}   