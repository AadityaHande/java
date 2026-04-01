public class charat{
    public static void main(String[] args) {
        String a= "Umbrella";
        int found=0;
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)=='e') found =1;
        if(found==1) System.err.println("Character 'e' found ");
        else System.err.println("Character 'e' not found");
    }
}