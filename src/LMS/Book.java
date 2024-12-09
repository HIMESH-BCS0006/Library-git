package LMS;
import com.sun.security.jgss.GSSUtil;

import  java.util.*;
public class Book {

    private String bookName;
    private int bookNumber;
    private boolean isAvailable;

    public static void borrowingBook(int n){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter book name: ");
        String name = input.nextLine();
        System.out.println("Enter book number: ");
        int number = input.nextInt();

        for(Book i : Library.b){
            if(i.bookNumber ==  number){
                if(i.isAvailable){
                    System.out.println(n + " borrowed " + name);
                }
                if(!i.isAvailable){
                    System.out.println("This book is not available...");
                }
                i.isAvailable=false;
            }
        }
    }


    public Book(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.bookName = input.nextLine();
        System.out.println("Enter book number: ");
        this.bookNumber = input.nextInt();
        this.isAvailable = true;
    }

    public int getBookNumber(){
        return bookNumber;
    }

    public void setAvailable(){
        this.isAvailable = true;
    }



}
