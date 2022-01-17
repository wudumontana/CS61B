public class LargerDemo {
    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        //System.out.println(larger(5, -10));
       int x=1;
       while(x<=5){

           for(int n =1;n<=x;n++){
               System.out.print('*');
           }
           System.out.println(' ');
           x++;

       }
    }
}
