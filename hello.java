class Calculator {
    int num1=5;
    int num2=10;
    int add(){
        System.out.println(this);
        return num1+num2;
        
    }
}


public class hello {

    public static void main(String[] args) {
        // int b =130;
        // byte k=(byte)b;
        // double d =4.556;
        // System.out.println(b+d);
        // System.out.println(b-d);
        // System.out.println(b*d);
        // System.out.println(b/d);
        // System.out.println(k);
        Calculator c = new Calculator();
        // int num1 = 5;
        // int num2 = 10;
        // System.out.println(c.add(num1,num2));
        System.out.println(c.add());
    }
}