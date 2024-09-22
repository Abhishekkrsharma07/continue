
//Find the dublicate value

public class finddup{
    
    public static void main(String []args){

        String arr[]={"java","yellow","pink","java","yellow"};
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]!=arr[j]){            //if ur code don't work then see the negation present in this line;

                    System.out.println("Found the duplicate item : "+arr[i]);
                }
            }
        }
    }
}