package LMS;
import java.util.*;
public class Library {
    private static Library library;
    static ArrayList<Member> m = new ArrayList<>();
    static ArrayList<Book> b = new ArrayList<>();

    private  Library(){}

    public static Library getInstance(){
        if(library==null){
            library = new Library();
        }
        return library;
    }

    public void menu(){
        System.out.println("1.Add a member");
        System.out.println("2.Add new Book");
        System.out.println("3.Issue book");
        System.out.println("4.Return book");
        System.out.println("5.Exit");
    }

    public static int getOption(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter option: ");
        return input.nextInt();
    }


    public  void startLibrary(){

        int op;
        do{
            menu();
            op = getOption();
            switch (op){
                case 1 : addMember();
                    break;
                case 2: addBook();
                    break;
                case 3: borrowBook();
                    break;
                case 4: returnBook();
                    break;
                case 5:
                    System.out.println("Exitting....");
                    break;
            }
        }while(op!=5);
    }

    public static void addMember(){

        m.add(new Member());
    }

    public static void addBook(){
        b.add(new Book());
    }

    public static void borrowBook(){
        if(m.isEmpty()){
            System.out.println("No members to borrow a book add a member..");
        }
        else{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter member id: ");
            int number = input.nextInt();

            for(Member i : m){
                if(number == i.getMemberID()){
                    Book.borrowingBook(number);
                }
            }

        }
    }

    public static void returnBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter book name: ");
        String name = input.nextLine();
        System.out.println("Enter book number: ");
        int number = input.nextInt();

        for(Book i : b){
            if(number == i.getBookNumber()){
                i.setAvailable();
                System.out.println("You returned the book..");
            }
            else{
                System.out.println("No matching book ......");
            }
        }

    }


    public static void main(String[] args){

        Library library = Library.getInstance();
        library.startLibrary();
    }


}
