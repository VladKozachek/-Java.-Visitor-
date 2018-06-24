//Посетитель (Visitor)
interface Visitor {
    void visit(EngineElement engineElement);
    void visit(BodyElement bodyElement);
    void visit(CarElement carElement);
    void visit(WheeElement wheeElement);
}
