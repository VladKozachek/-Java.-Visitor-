import java.util.ArrayList;

//Автомобиль
public class CarElement implements Element {
    ArrayList<Element> elements = new ArrayList<>();

     CarElement() {
        elements.add(new WheeElement("переднее левое"));
        elements.add(new WheeElement("переднее правое"));
        elements.add(new WheeElement("заднее левое"));
        elements.add(new WheeElement("заднее правое"));
        elements.add(new BodyElement());
        elements.add(new EngineElement());
    }

    @Override
    public void accept(Visitor visitor) {
        for(Element item:elements){
            item.accept(visitor);
        }
        visitor.visit(this);
    }
}
