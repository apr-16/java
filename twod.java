import java.util.Scanner;
class twod{
    int[][]arr;
        
    void read(){
        arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
            }
    }
        
    void print(){
        System.out.println("Array is");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
    }
     
   
        
        
            
    
    


public static void main(String[] args) {
    twod obj=new twod();
    obj.read();
    obj.print();
    


}
}

