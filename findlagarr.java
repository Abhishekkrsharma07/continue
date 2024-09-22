
public class findlagarr {
    public static void main(String []args){

        int arr[]=new int[]{12,34,54,67,44,34};
        int max=arr[0];
        int i;

        for(i=0;i<=arr.length;i++){
            if(arr[i]>=max)
            max=arr[i];

        }
        
        System.out.println("The largest number of the arr is :"+ max);
    }
}
