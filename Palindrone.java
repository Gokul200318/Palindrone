class Palindrone{

    public static boolean isPalindrone(String str){
        int left = 0, right = str.length()-1;
        while(left< right){
             if(str.charAt(left) != str.charAt(right)){
               return false;
            }
            left++;
            right--;
        }
        return true;
    }

    
    public static void main(String[] args) {
        String str = "aba";
        boolean res = isPalindrone(str);

        if(res){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}