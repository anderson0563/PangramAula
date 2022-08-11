package Principal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Panagrama {
    public boolean testar(String frase){
        frase = frase.toLowerCase();
        frase = frase.replace(" ", "");
        char[] fraseArray = frase.toCharArray();
        Arrays.sort(fraseArray);
        for(int i=0; i<fraseArray.length-1; i++){
            if(! (fraseArray[i+1]-fraseArray[i]<=1))
                return false;
        }
        return true;
    }
}
