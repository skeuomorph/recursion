public class recursionMultiply{
    public static void main(String[] args){
        System.out.println(multiply(4, 3));  
    }    
    
    public static int multiply(int a, int b){
        if(b == 0){
            return 0;
        }
        return a + multiply(a, b-1);
    }
}