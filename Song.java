package SongOOP;

public class Song {
    public String title;
    public String artist;
    public int duration;
    public boolean isLike = false;
    public String time;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void printSong(){
        if(time!=null && isLike == true){
            System.out.println("Song [title="+title+", artist="+artist+", duration "+ time +" , isLike="+isLike+"]");
        }else if(time != null && isLike == false){
            System.out.println("Song [title="+title+", artist="+artist+", duration "+ time +" , isLike="+isLike+"]");
        }else
            System.out.println("Song [title="+title+", artist="+artist+", duration "+ duration +" , isLike="+isLike+"]");
    }
    public boolean addToFavorite(){
        if(isLike == false){
            isLike = true;
            System.out.println(title+" is liked");
            return isLike = true;
        }else 
            isLike = false;
            System.out.println(title+" is disliked");
            return isLike = false;
    }
    
    public String getFormattedDuration(){
        int min = duration/60;
        int sec = duration%60;
        System.out.println(min+" minutes "+sec+" seconds");
        return time = min+" minutes "+sec+" seconds";
    }
    public void isSameArtist(Song song){
        if(this.artist == song.artist){
            System.out.println("The same artist : "+ true);
        }else
            System.out.println("The same artist : "+ false);
    }
    public void isFavorite(){
        if(isLike==false){
            System.out.println(title+" is "+"disliked");
        }else
            System.out.println(title+" is "+"liked");
    }
}