import java.util.*;

public class Unique {

    private boolean isUnique;
    public Unique(String word){
        //isUnique = false;
        //System.out.println(word);
        bruteForce(word);
        asciiSolution(word);
    }

    public boolean bruteForce(String word){
        //isUnique = true;
        for(int i = 0; i < word.length(); i ++){
            //System.out.println("-----------------------------------");
            //System.out.println(word.charAt(i));
            
            for(int j = i+1; j < word.length(); j++){
                //System.out.println("*************************");
                //System.out.println(word.charAt(j));
                if (word.charAt(i) == word.charAt(j)){
                    System.out.println("This is not a unique word");
                    return false;
                    
                }
            }
        }
        System.out.println("This is a unique word");
        return true;
    }

    public boolean asciiSolution(String word){
        if(word.length() > 128){
            return false;
        }
        boolean[] charSet = new boolean[128];
        for(int i = 0; i < word.length(); i++){
            char a = word.charAt(i);
            if(charSet[a]){
                System.out.println("Not a unique word!");
                return false;
            }
            charSet[a] = true;
        }
        System.out.println("This is a unique word");
        return true;
    }

    public static void main(String[] args){
        Unique maybeUnique = new Unique("help");
    }
    
}
