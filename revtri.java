public class revtri {
    public static void main(String []args){

        int row=8;

        for(int i=0;i<row;i++){
            for(int j=2*(row-1);j>=0;j--){
                System.out.print("");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();



        }
    }
    
}
