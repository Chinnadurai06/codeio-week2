public class Q3 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 2, 6, 2, 9, 6};
        int count2=0,count6=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                count2++;

            }
            else if(arr[i]==6){
                count6++;
            }
        }
        System.out.println("2appears"+count2+"times");
        System.out.println("6appears"+count6+"times");
   }
}
