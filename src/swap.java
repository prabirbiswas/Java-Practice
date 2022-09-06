public class swap {
    public static void main(String[] args) {

        //Using Without third variable
        int x=10,y=15;
        System.out.println("Before Swapping: X:"+x+" Y:"+y);
        y=x+y;
        x=y-x;
        y=y-x;
        System.out.println("After Swapping: X:"+x+" Y:"+y);

        //using third variable
        int temp,a=20,b=25;
        System.out.println("Before Swapping: a:"+a+" b:"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: a:"+a+" b:"+b);
    }
}
