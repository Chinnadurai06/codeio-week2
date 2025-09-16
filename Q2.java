public class Q2 {
    public static void main(String[] args) {
       int arr[]={14,28,19,33,45,12};
       int first=0,second=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>first){
             second=first;
             first=arr[i];
           }
          else if(arr[i]>second && arr[i]!=first){
              second=arr[i];
           }
          }
        System.out.println("secondlargest element:"+second);
    }
}
