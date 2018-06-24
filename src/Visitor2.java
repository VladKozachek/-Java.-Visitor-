public class Visitor2 implements Visitor {
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("Ремонтируем двигатель");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("Полируем капот");
    }

    @Override
    public void visit(CarElement carElement) {
        System.out.println("Осмотрел машину");
    }

    @Override
    public void visit(WheeElement wheeElement) {
        System.out.println("Подкачал колесо "+wheeElement.getName());
    }
}
