public class Palindrone1 {

    public static boolean isPalindrone(String str){
        String reversed = new StringBuilder(str).reverse().toString(); 
        
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        String str = "abba";
        boolean res = isPalindrone(str);
        if (res){
            System.out.println("Palindrone");
        }
        else{
            System.out.println("Not Palindrone");
        }
    }
}
