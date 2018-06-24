public class Visitor1 implements Visitor {
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("Промываем двигатель");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("Рихтуем бампер");
    }

    @Override
    public void visit(CarElement carElement) {
        System.out.println("Покурил внутри машины");
    }

    @Override
    public void visit(WheeElement wheeElement) {
        System.out.println("Постучал по колессу"+wheeElement.getName());
    }
}
