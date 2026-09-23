public class methods {
        //no parameter no return type
        static void display(){
            System.out.println("hello");
        }
        //parameter no return type
        static void greet(String a){
            System.out.println("hello");
        }
        //parameter and return type
        static int sum (int a,int b){
            return a+b;
        }
        //no parameter with return type
        static int display1() {
            return 10;
        }
        public static void main(String[] args) {
            display();
            greet("hello");
            System.out.println(sum(10, 20));
            System.out.println(display1());
        }
        }