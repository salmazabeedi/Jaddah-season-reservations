package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Tickets {
    
    private String date;
    private String day;
    private Visitors visitor;
    private Activities activity;
    private double total_price;
    private double price;

    
    //Tickets (date,day,visitor.get(vname-1),Activity.get(activity-1 ) );
    public Tickets(String date, String day, Visitors visitor1, Activities activity1 , double price) {
        this.date = date;
        this.day = day;
        this.visitor = new Visitors(visitor1);
        this.activity = new Activities(activity1);
        this.price = price;
    }
    
    public Tickets(){
        this.date = "";
        this.day = "";
        this.visitor = null;
        this.activity = null;
        this.price =0;
    }

   
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Visitors getVisitor() {
        return new Visitors (visitor);
    }

    public void setVisitor(Visitors visitor) {
        this.visitor = new Visitors(visitor);
    }

    public Activities getActivity() {
        return new Activities (this.activity);
    }

    public void setActivity(Activities activity) {
        this.activity = new Activities(activity);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    
   
    
    public String toString(){
        
        String text = "ticket info \n"
                + this.visitor + "\n" + this.activity + "\n day: " + this.day 
                + "\t date: " + this.date + "\n total price: " + this.price;
        return text;
    }
    
      public void write_in_file() throws IOException{
       FileWriter fwrite = new FileWriter("tickets.txt", true); 
       PrintWriter write = new PrintWriter(fwrite); 
       
       write.print(this.visitor.getVisitor_name() + "\t");
       write.print(this.activity.getActivity() + "\t");
       write.print(this.date+"\t");
       write.print(this.price +"\n");
       
   
       write.close();
    }
      
       public void display_ticket() throws FileNotFoundException{
        
        System.out.println ("visitor name \t activity \t date \t price");
        File file = new File ("tickets.txt");
        Scanner read = new Scanner(file); 
        
        while (read.hasNext()){
            String line = read.nextLine();
            
            System.out.println (line);
        }
        
        read.close();
        
    }
    
}
