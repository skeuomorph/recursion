public class recursionDiv{
    public static void main(String[] args){
        System.out.println(intDiv(18, 5));
    }

    public static int intDiv(int a ,int b){
        if((a - b) < 0){
            return 0;
        }
        return 1 + intDiv(a-b, b);
    }
}