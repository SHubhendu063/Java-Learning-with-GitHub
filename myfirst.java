class computer{
    int price=40;
    public void wellcome(){
        System.out.println("Welcome to my computer store");
    }
}


public class myfirst {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        computer c1=new computer();
        computer c2=new computer();
        c2.price=50;
        System.out.println(c1.price);//--->40
        System.out.println(c2.price);//--->50[because we have two different objects and we have changed the price of c2 object not c1 object so the price of c1 object is still 40]
        c1.wellcome();
        c2.wellcome();
    }
    
}
