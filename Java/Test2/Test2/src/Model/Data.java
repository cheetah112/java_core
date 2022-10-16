package Model;

import java.util.ArrayList;

public class Data {
    private ArrayList<User> data;
    
    public Data() {
    }



    @Override
    public String toString() {
        return "Data [data=" + data + "]";
    }



    public ArrayList<User> getData() {
        return data;
    }



    public void setData(ArrayList<User> data) {
        this.data = data;
    }

    

    
}
