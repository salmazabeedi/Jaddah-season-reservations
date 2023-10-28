package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Visitors {
    
    private int visitor_id ;
    private String visitor_name;
    private int age ;
    private String phone_number;
    
    public  Visitors(){
    this.visitor_id = 0;
    this.visitor_name = "";
    this.age = 0;
    this.phone_number= "";
    }
    //Visitors vis = new Visitors (id, name, age, phone) ;
    public Visitors(int visitor_id, String visitor_name, int age, String phone_number) {
        this.visitor_id = visitor_id;
        this.visitor_name = visitor_name;
        this.age = age;
        this.phone_number = phone_number;
    }
    
    public Visitors (Visitors visitor){
        this.visitor_id = visitor.visitor_id;
        this.visitor_name = visitor.visitor_name;
        this.visitor_id = visitor.visitor_id;
        this.age = visitor.age;
        this.phone_number = visitor.phone_number;
    }
    
    //set and get

    public int getVisitor_id() {
        return visitor_id;
    }

    public String getVisitor_name() {
        return visitor_name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setVisitor_id(int visitor_id) {
        this.visitor_id = visitor_id;
    }

    public void setVisitor_name(String visitor_name) {
        this.visitor_name = visitor_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
    public String toString(){
        
        String text;
        text = "visitor name : "+ this.visitor_name + "\n visitor Id : " + this.visitor_id + 
                "\n visitor age: "+ this.age +"\n phone number "+this.phone_number ;
        return text;
    }
    
   
    public void write_in_file() throws IOException{
       FileWriter fwrite = new FileWriter("visitors.txt",true); 
       PrintWriter write = new PrintWriter(fwrite);
       
       write.print(this.visitor_name + "\t");
       write.print(this.visitor_id + "\t");
       write.print(this.age + "\t");
       write.print(this.phone_number+"\n" );
      
   
       write.close();
    }
    
    public void display_visitors() throws FileNotFoundException{
        
        System.out.println ("visitors name \t visitors id \t visitors age \t phone number");
        File file = new File ("visitors.txt");
        Scanner read = new Scanner(file); 
        
        while (read.hasNext()){
            String line = read.nextLine();
            
            System.out.println (line);
        }
        
        read.close();
        
    }
    
}
