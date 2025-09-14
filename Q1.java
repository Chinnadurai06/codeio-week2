public class Q1 {
    public static void main(String[] args) {
        int arr[]={5,-3,0,12,-9,0,7};
        int positive=0,negative=0,zero=0;
        for(int i:arr) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zero++;
            }
        }
            System.out.print("positive number:"+positive+" ");
            System.out.print("negative numbers:"+negative+" ");
            System.out.print("zero :"+zero+" ");

        System.out.println(" ");
    }
}
