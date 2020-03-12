class Foo{

    // FIXME-begin
    public static class builder
    {
        public builder()
        {
            this.bp1 = 1;
            this.bp2 = 2;
            this.bp3 = 3;
            this.bp4 = 4;
        }
        public Foo build()
        {
            return new Foo(this);
        }

        public builder withP1(int value)
        {
            this.bp1 = value;
            return this;
        }

        public builder withP2(int value)
        {
            this.bp2 = value;
            return this;
        }

        public builder withP3(int value)
        {
            this.bp3 = value;
            return this;
        }

        public builder withP4(int value)
        {
            this.bp4 = value;
            return this;
        }
        private int bp1;
        private int bp2;
        private int bp3;
        private int bp4;
    }
    public Foo(builder values)
    {
        this.p1 = values.bp1;
        this.p2 = values.bp2;
        this.p3 = values.bp3;
        this.p4 = values.bp4;
    }
    public static builder builder()
    {
        return new builder();
    }
    // FIXME-end

    public int getP1(){
        return p1;
    }
    public int getP2(){
        return p2;
    }
    public int getP3(){
        return p3;
    }
    public int getP4(){
        return p4;
    }

    private int p1;
    private int p2;
    private int p3;
    private int p4;
}
public class Main{

     public static void main(String []args){
        {
            Foo f = Foo.builder()
                       .build();
            System.out.println(f.getP1());
            System.out.println(f.getP2());
            System.out.println(f.getP3());
            System.out.println(f.getP4());
            System.out.println("----");
        }
        {
            Foo f = Foo.builder()
                       .withP4(8)
                       .withP1(3)
                       .build();
            System.out.println(f.getP1());
            System.out.println(f.getP2());
            System.out.println(f.getP3());
            System.out.println(f.getP4());
        }
     }
}