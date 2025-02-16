package entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int songId;
    private String songName;
    private String singer;
    private String year;

    public void setSongId(int songId){
        this.songId=songId;
    }
    public void setSongName(String songName){
        this.songName=songName;
    }
    public void setSinger(String singer){
        this.singer=singer;
    }
    public void setYear(String year){
        this.year=year;
    }

    public String getSongName(){
        return this.songName;
    }
    public String getSinger(){
        return this.singer;
    }
    public int getSongId(){
        return this.songId;
    }
    public String getYear(){
        return this.year;
    }

    @Override
    public String toString(){
        return "["+songId+", "+this.songName+", "+this.singer+", "+this.year+"]";
    }
}
