public class max {
    public static void main(String []args){
        int a[]={12,4,37,78,90,78};

        int max=a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        System.out.println("The max value in this array is : "+max);
    }
    
}