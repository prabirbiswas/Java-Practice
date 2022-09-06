class CheckEligibility extends Exception{
    public CheckEligibility(String str){
        super(str);
    }
}

public class throw2 {
    public static void validate(int age) throws CheckEligibility {
        if(age<18){
            throw new CheckEligibility("Not Eligible to Vote");
        }else{
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        try {
            validate(18);
        }catch (CheckEligibility e){
            e.printStackTrace();
            System.out.println("Rest of the Code");
        }
        System.out.println("Rest of the Code222");
    }
}
