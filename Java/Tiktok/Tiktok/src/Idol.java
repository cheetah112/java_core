import java.util.ArrayList;

public class Idol {
    private int id;
    private String name;
    private String email;
    private ArrayList<Follower> followers;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Follower> getFollowers() {
        return followers;
    }
    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    
    
}
