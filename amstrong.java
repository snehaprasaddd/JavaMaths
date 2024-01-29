public class amstrong {
    public static boolean isArmstrong(int dummy) {
        int count=0, result=0;
        int originalNumber=dummy;
        while(dummy!=0){
            dummy/=10;
            ++count;
        }
        dummy=originalNumber;
        while(dummy!=0){
            int remainder = dummy%10;
            result += Math.pow(remainder, count);
            dummy /= 10;
        }
        return result==originalNumber;
    }

}
