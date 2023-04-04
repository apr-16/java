import java.util.Scanner;
class nsum{
    int[] arr;
        
    void read(){
        arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter element");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
    
            
    }
        
    void print(){
        System.out.print("Array is");
        for(int i=0;i<5;i++)
        System.out.println(arr[i]+"");
    }
     
    void search(){
        int num;
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the number for search");
        num=sc.nextInt();
        for(int i=0;i<5;i++)
            {
                if(arr[i]==num){
                    found=true;
                    break;
                
                }
            
        }
        if (found){
            System.out.print("number found");
        }
        else{
            System.out.print("number not found");
        }
           
        

        }
        
            
    
    


public static void main(String[] args) {
    nsum obj=new nsum();
    obj.read();
    obj.print();
    obj.search();


}
}

