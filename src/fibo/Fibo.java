package fibo;

    public class Fibo {

        public static void main(String[] args) {
        
            int n = F(8);
            System.out.println(n);
        
            for (int i = 1; i <= 20; i++) {
            System.out.print(F(i) + " ");
            }
        }
    
        public static int F(int n) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
            return F(n - 1) + F(n - 2);
              }
        }
    
    }
