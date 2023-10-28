package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Activities {
    
    private String activity;
    private double price ;
    private String location;
//Activities act = new Activities (activity,  price, location);
    public Activities(String activity, double price, String location) {
        this.activity = activity;
        this.price = price;
        this.location = location;
    }

    public Activities() {
        this.activity = "";
        this.price = 0;
        this.location = "";
    }
    
    public Activities(Activities activity){
        this.activity = activity.activity;
        this.price = activity.price;
        this.location = activity.location;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    @Override 
    public String toString(){
        String text;
        text = "activity : "+ this.activity + "\n price : " + this.price + 
                "\n location : "+ this.location ;
        return text;     
    }


       public void write_in_file() throws IOException{
       FileWriter fwrite = new FileWriter("activities.txt",true); 
       PrintWriter write = new PrintWriter(fwrite);
       
       write.print(this.activity + "\t");
       write.print(this.price + "\t");
       write.print(this.location + "\n");
   
       write.close();
    }
    
     public void display_activities() throws FileNotFoundException{
        
        System.out.println ("activity \t price \t location");
        File file = new File ("activities.txt");
        Scanner read = new Scanner(file); 
        
        while (read.hasNext()){
            String line = read.nextLine();
            
            System.out.println (line);
        }
        
        read.close();
        
    }
    
}
