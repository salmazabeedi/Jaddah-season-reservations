package project;

import java.io.IOException ;
import java.util.ArrayList;
import java.util.Scanner;
        
        
public class NewMain {

   
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (System.in);
        //arrays 
       ArrayList<Visitors> visitor = new ArrayList < Visitors>();
       ArrayList<Activities> Activity = new ArrayList <Activities>();
       //define object from classes
       Tickets t = new Tickets ();
       Visitors v =new Visitors ();
       Activities a = new Activities ();
       int choice ;

    
while(true) {
    System.out.println("1.Add visitor");
    System.out.println("2.Add activity");
    System.out.println("3.New ticket");
    System.out.println("4.Display All visitors");
    System.out.println("5.Diplay All activities");
    System.out.println("6.Dispiay All tickets");
    System.out.println("Enter your choioe: ");
    choice = scan.nextInt();

            
                if(choice == 1){
                    int id;
                    String name;
                    int age;
                    String phone;
                    scan.nextLine ();
                    System.out.println ("Enter visitor name:") ;
                    name=scan.nextLine() ;
                    System.out.println("Enter visitor National ID number:");
                    id= scan.nextInt();                   
                    System.out.println("Enter visitor Age: ");
                    age=scan.nextInt ();
                    scan.nextLine();
                    System.out.println ("Enter visitor Phone number:");
                    phone=scan.nextLine() ;
                    if(phone.length()< 10){
                        System.out.println ("Enter a valid Phone number:");
                        phone=scan.nextLine() ;
                    }
                    Visitors vis = new Visitors (id, name, age, phone) ;
                    visitor.add (vis);
                    vis.write_in_file();
                }
                else if(choice == 2){
                    
                        String activity;
                        double price;
                        String location;
                        scan.nextLine ();
                        System.out.println("Enter activity");
                        activity = scan.nextLine();
                        System.out.println ("Enter price:");
                        price =scan.nextDouble();                    
                        System.out.println ("Enter location: ");
                        scan.nextLine ();
                        location = scan.nextLine();                    
                        Activities act = new Activities (activity,  price, location);
                        Activity.add (act);
                        act.write_in_file();
                        
                    }
                else  if(choice == 3){
                        String   date  ,day;
                        int activity , vname;
                        double price;
                        a.display_activities();
                        System.out.println("-------------------------------------");
                        v.display_visitors();
                        System.out.println("enter activity number: ");
                        activity= scan.nextInt();
                        System.out.println("enter visitor's number");
                        vname=scan.nextInt();                     
                        scan.nextLine();
                        System.out.println ("Enter the date: ") ;
                        date =scan.nextLine();
                        System.out.println ("Enter the day: ") ;
                        day =scan.nextLine();
                       System.out.println ("Enter price: ") ;
                        price =scan.nextDouble();
                        Tickets ticket;                                
                        ticket = new Tickets (date,day,visitor.get(vname-1),Activity.get(activity-1 ) ,price);
                        System.out.println ("New ticket for :");
                        System.out.println (visitor.get(vname-1)) ;
                        System.out.println("To activity :");
                        System.out.println (Activity.get(activity-1));
                        ticket.write_in_file();
                       
                    }
                else if(choice == 4){
                    v.display_visitors();
                }
                else if(choice == 5){
                        a.display_activities();
                }
                else  if(choice == 6){
                    t.display_ticket();
                }
                else{
                    System.out.println("enter valid choice: ");
                    choice = scan.nextInt();
                }




       }
}
}
    
    

