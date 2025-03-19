public class Binary {

    public static boolean isBinary(String str){
        int n = str.length();
        for (int i=0;i<n;i++){
            if (str.charAt(i)!=0 && str.charAt(i)!=1){
                return false;
            }

        }
        return true;
        
    } 
    public static void main(String[] args) {
        String str = "010101111010";
        boolean res = isBinary(str);
        if (res=true){
            System.out.println("Binary");
        }
        else{
            System.out.println("not Binary");
        }

    }
}
