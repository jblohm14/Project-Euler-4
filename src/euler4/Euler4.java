
package euler4;

public class Euler4 {
    static int pal = 0;

    public static void main(String[] args) {
        int testNum = 1001;
        
        int[] testSet = new int[999*999];
        
        for(int i = 100; i < 1000; i++){
            for(int j = 100; j < 1000; j++){
                int temp = i * j;
                if(isPal(temp)){
                    if(temp > pal){
                        pal = temp;
                    }
                }
            }
        }
        System.out.println(pal);
    }  
    
    public static boolean isPal(int n){
        boolean b = true;
        
        String temp = Integer.toString(n);
        int[] set = new int[temp.length()];
        
        for (int i = 0; i < temp.length(); i++){
            set[i] = temp.charAt(i) - '0';
        }
        
        int size = set.length;
        
        int i = 0;
        int j = size - 1;

        while(i != j && i < j){
            if(set[i] != set[j]){
                b = false;
                break;
            }
            i++;
            j--;
        }
        
        return b;
    }
}
