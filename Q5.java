public class Q5 {
    public static void main(String[] args) {
        int n=12345;
        int reverse=0;
        while(n!=0){                  //reverse digits
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        System.out.println(reverse+"");
    }
}
