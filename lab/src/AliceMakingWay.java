
public class AliceMakingWay extends Activities{
    
    @Override
    protected String makeKW() {
        keyWords = "с большим трудом пробиралась среди ";
        return keyWords;
    }

    @Override
    public String toString() {
        Alice a = new Alice();
        Tree t = new Tree();
        return a.getTOName() + makeKW()+ t.getName(); 
    }
}
