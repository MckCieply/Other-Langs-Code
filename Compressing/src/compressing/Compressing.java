
package compressing;

public class Compressing {
    public static void convert(char x, int number){
        String output = "";
        for(int i=0; i<number; i++){
            output+=x;
        }
        System.out.print(output);
    }
    public static void main(String[] args) {
        String input = "aaaaaaccccb";
        int counter = 1;
        for(int i = 1; i<input.length(); i++){
            char x = input.charAt(i);
            if (x == input.charAt(i-1)){
                counter +=1;
                if(input.charAt(i+1) != x){
                    convert(x, counter);
                }
            }
            else if(x !=input.charAt(i-1) && i == input.length()-1){
                counter = 1;
                convert(x, counter);
            }
            else{
                counter = 1;
                
            }
        }
    }
    
}
