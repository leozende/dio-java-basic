package edu.leonardo.secondclass;
public class StudentBulletin {
    public static void main(String[] args) {
        withoutIndent();
        withIndent();
    }

    public static void withoutIndent (){
    int finalMedia = 6;
    if(finalMedia < 6)	
    System.out.println("DISAPPROVED"); 
    else if(finalMedia == 6)
    System.out.println("ALMOST DISAPPROVED"); 
    else
    System.out.println("APPROVED"); 
    }
    
    public static void withIndent (){
        int finalMedia = 6;
        if(finalMedia < 6)	
            System.out.println("DISAPPROVED"); 
        else if(finalMedia == 6)
            System.out.println("ALMOST DISAPPROVED"); 
        else
            System.out.println("APPROVED"); 
    }
}