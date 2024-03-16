public class Cognizant {
    public static void main(String[] args) {
        int num = 458125;

        int sum = summing(num);
        System.out.println(sum);
    }

    public static int summing(int num){
        if(num<10){
            return num;
        }else{
            return num%10 + summing(num/10);
        }
    }
}
