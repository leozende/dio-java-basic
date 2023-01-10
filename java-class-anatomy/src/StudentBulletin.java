public class StudentBulletin {
    public static void main(String[] args) {
        withoutIdent();
        withIdent();
    }

    public static void withoutIdent (){
    int finalMedia = 6;
    if(finalMedia < 6)	
    System.out.println("DISAPPROVED"); 
    else if(finalMedia == 6)
    System.out.println("ALMOST DISAPPROVED"); 
    else
    System.out.println("APPROVED"); 
    }
    
    public static void withIdent (){
        int finalMedia = 6;
        if(finalMedia < 6)	
            System.out.println("DISAPPROVED"); 
        else if(finalMedia == 6)
            System.out.println("ALMOST DISAPPROVED"); 
        else
            System.out.println("APPROVED"); 
    }
}