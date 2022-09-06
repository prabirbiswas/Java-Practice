public class try1 {
    public static void main(String[] args) {
        int j=1;
        int i=5;
        float data;
        try{
            data =i/j;
            System.out.println(data);
        }catch(Exception e){
            j=2;
            data=(float)i/(float)j;
            System.out.println(data);
        }finally {
            System.out.println("Rest of the code");
        }
        System.out.println("Rest of the code22");
    }
}
