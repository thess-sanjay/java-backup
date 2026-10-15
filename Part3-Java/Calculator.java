interface Calculate{
    void add();
}

public class Calculator{
    public static void main(String[] args) {

        // class A implements Calculate{
        //  @Override
        //   public void add(){
        //        System.out.println("Iam add method");
        //      }
        // }
        // Calculate ob = new A();
        // ob.add();


        Calculate c = new Calculate(){
            @Override 
            public void add(){
                System.out.println("This is add method");
            }
        };

        c.add();
    }
} 

