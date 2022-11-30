public class Main {
 
    public static void main(String[] args) {        
        Main main = new Main();
        String result = main.reverseOnlyLetters("sun-rise-in-the-morning");
        System.out.print(result);
    }
     
    
    public String reverseOnlyLetters(String str) {
        char[] array = str.toCharArray();
         
        int first = 0, second = array.length-1;
        char temp;
        boolean isStartFound = false, isEndFound = false;
        while(first < second){
             
            if((array[first]>='a' && array[first]<='z') || (array[first]>='A' && array[first]<='Z')){
                isStartFound = true;
            }else {
                first++;
            }
             
            if((array[second]>='a' && array[second]<='z') || (array[second]>='A' && array[second]<='Z')){
                isEndFound = true;
            }else {
                second--;
            }
             
            if(isStartFound && isEndFound){
                temp = array[second];
                array[second] = array[first];
                array[first] = temp;
                isStartFound = false;
                isEndFound = false;
                first++;
                second--;
            }
        }        
        return String.valueOf(array);        
    }
}

