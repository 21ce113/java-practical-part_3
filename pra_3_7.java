
    interface A
    {
        public void Details();
        default void Address()
        {
            System.out.println("Address :-\n'syamal App.', Block No.- 202,\nHari Om Nagar,\nZanzarda Road,\nJunagadh - 362001.");
        }
    }
    public class pra_3_7 implements A
    {
        public void Details()
        {
            System.out.println("Details:-");
            System.out.println("Name :Rushit Rabadiya");
            System.out.println("ID No. : 21CE111");
            System.out.println("Collage name : CSPIT");
            System.out.println("Branch : Computer Engineering");
            System.out.println("Current Sem. : 3");
        }
        public static void main(String []args)
        {
            pra_3_7 p1=new pra_3_7();
            p1.Details();
            p1.Address();
        }
    }
