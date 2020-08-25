public class DoSmthWithStrings {

    public boolean isOpeningAndClosingBracesEqual(String str){
        int opening = 0;
        int closing = 0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(') opening +=1;
            else if (str.charAt(i) ==')') closing +=1;
        }
        return opening == closing;
    }

    public String revertString1(String str){
        String newString = "";

        for (int i=str.length()-1; i>0; i--){
            newString += str.charAt(i);
 //           newString = newString.concat(str.substring(i, i));
        }
        return newString;
    }

    public String revertString2(String str){
        char[] arr = str.toCharArray();
        char ch;
        for (int i = 0; i<arr.length/2; i++){
            ch = arr[i];
            arr[i]=arr[arr.length-i];
            arr[arr.length-i]=ch;
        }
        return new String(arr);
//        return String.copyValueOf(arr);
    }

    public static void main(String[] args) {
    }
}
