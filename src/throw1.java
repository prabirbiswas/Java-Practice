public class throw1 {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not Eligible to Vote");
        }else{
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        try {
            validate(17);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Rest of the Code");
        }
        System.out.println("Rest of the Code222");
    }
}
