

public class Reverse2DArray {
    public static void main(String[] args) {

        if(args.length != 4){
            System.out.println("Please enter 4 integer numbers");
            
        }else{
            int z =0;
        int[][] arr = new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = Integer.parseInt(args[z]);
                z++;
            }
        }
        

        
       System.out.println("The Given array is : ");
         for(int i =0; i<2; i++){
            for(int j =0; j<2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         }   
         System.out.println("Reverse of the Array is : ");
        for(int i =1; i>=0; i--){
            for(int j=1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
       

    }
}
