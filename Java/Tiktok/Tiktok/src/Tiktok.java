import java.util.ArrayList;
import java.util.Scanner;

public class Tiktok {
    private ArrayList<Idol> Idols;
    private ArrayList<Song> Songs;

    public Song addSong(Scanner sc){
        Song song = new Song();
        System.out.println("Nhap Id bai hat: ");
        song.setId(sc.nextInt());
        System.out.println("Nhap ten bai hat:");
        song.setName(sc.nextLine());
        System.out.println("Nhap ten singer:");
        song.setSinger(sc.nextLine());
        return song;

    }

}
