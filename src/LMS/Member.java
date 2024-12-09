package LMS;
import  java.util.*;

public class Member {
    private String name;
    private int memberID;


    public Member(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name: ");
        this.name = input.nextLine();
        System.out.println("Enter ID: ");
        this.memberID = input.nextInt();

    }
    public int getMemberID(){
        return memberID;
    }
}
