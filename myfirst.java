// class computer{
//     int price=40;
//     public void wellcome(){
//         System.out.println("Welcome to my computer store");
//     }
// }

// import java.util.Scanner;
public class myfirst {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // computer c1=new computer();
        // computer c2=new computer();
        // c2.price=50;
        // System.out.println(c1.price);//--->40
        // System.out.println(c2.price);//--->50[because we have two different objects and we have changed the price of c2 object not c1 object so the price of c1 object is still 40]
        // c1.wellcome();
        // c2.wellcome();

        // type-1(making array of primitive data type)
        // int nums[]={1,2,3,4,5};
        // System.out.println(nums[3]*nums[4]);//--->20[4*5=20]
        //type-2(making array using new keyword)
        // int nums2[]=new int[5];
        // nums2[0]=10;
        // System.out.println(nums2[0]);//--->10
        // Scanner sc =new Scanner(System.in);
        // int arr[][]=new int[3][4];
        // for (int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // for (int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // sc.close();
        // if we have 2 String variables  but they have same value then also they are not equal because they are different objects in memory so we have to use equals() method to check the equality of two String variables.
        String name="Rohit";
        // String name2="Rohit";
        String name2="rohit";
        if(name==name2){
            System.out.println("Both are same");
        }
        else{
            System.out.println("Both are not same");
        }
    }
    
}
