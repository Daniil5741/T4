package Study;

public class Song {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object aSong) {
        Song s =(Song) aSong;
        return getName().equals(s.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    String name;
    Song(String  a){
        name=a;
    }
}
