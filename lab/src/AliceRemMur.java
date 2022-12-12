
public class AliceRemMur extends Activities{
    @Override
    protected String makeKW() {
        keyWords = "к счастью - хоть и не сразу,- вспомнила, что ведь в руках у нее так и остались . ";
        return keyWords;
    }
    @Override
    public String toString() {
        Alice a = new Alice();
        Mursh m = new Mursh();
        return makeKW().substring(0,30) + a.getTOName() + makeKW().substring(30,79) + m.getName() + makeKW().substring(79);
    }
}
