public class Main {
    public static void main(String[] args) {
     //   Element body=new BodyElement();
      //  Element engine=new EngineElement();
      //  Visitor visitor1=new Visitor1();
       // Visitor visitor2=new Visitor2();

      //  body.accept(visitor1);
      //  engine.accept(visitor1);

      //  body.accept(visitor2);
      //  engine.accept(visitor2);

        Element car=new CarElement();
        car.accept(new Visitor1());
        System.out.println();
        car.accept(new Visitor2());
    }
}
