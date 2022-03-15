package udemy.interfaces.innerClasses.playlist;

import java.util.ArrayList;
import java.util.List;

public class Album {
    /*Create a program that implements a playlist of songs.

To start you off, implement the following classes:

1.  Album

    -  It has three fields, two Strings called name and artist, and an ArrayList that holds objects of type Song called songs.

    -  A constructor that accepts two Strings (name of the album and artist). It initialises the fields and instantiates songs.

    -  And three methods, they are:

        -  addSong(), has two parameters of type String (title of song), double (duration of song) and returns a boolean. Returns true if the song was added successfully or false otherwise.

        -  findSong(), has one parameter of type String (title of song) and returns a Song. Returns the Song if it exists, null if it doesn't exists.

        -  addToPlayList(), has two parameters of type int (track number of song in album) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the track number, or false otherwise.

        -  addToPlayList(), has two parameters of type String (title of song) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the name of the song, or false otherwise.

*/
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
    public boolean addSong(String title, double duration){
        return this.songs.add(new Song (title, duration));
    }

    public boolean addToPlayList (int trackNumber, List<Song> playList){
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong !=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track "+trackNumber);
        return false;
    }
    public boolean addToPlayList (String title, List<Song> playList){
        Song checkedSong = songs.findSong(title);
        if (checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song "+title+" is not in this album");
        return false;
    }

    public class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }


        public boolean add(Song song){
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;

        }

        private Song findSong (String title){
            for (int i=0; i< songs.size(); i++){
                Song checkedSong = this.songs.get(i);
                if(checkedSong.getTitle().equals(title))
                    return checkedSong;
            }
            return null;
        }

        private Song findSong (int trackNumber){
            int index = trackNumber-1;
            if ((index>=0) && (index <=this.songs.size())){
                return songs.get(index);
            }
            return null;
        }
    }

}
