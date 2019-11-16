public class recursionModDiv{
    public static void main(String[] args){
        System.out.println(modDiv(20, 6));
    }

    public static int modDiv(int a, int b){
        if(a - b < 0){
            return a;
        }
        return modDiv(a - b, b);
    }
}