public class OtherMethods {
    public static int calculateFactorial(int num){
        if(num==0 || num == 1){
            return 1;
        }else{
            return num * calculateFactorial(num-1);
        }
    }
}
