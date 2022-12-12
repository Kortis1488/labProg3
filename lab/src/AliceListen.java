
public class AliceListen extends Activities{

    @Override
    protected String makeKW() {
        keyWords = "послушалсь. ";
        return keyWords;
    }   
    
    @Override
    public String toString() {
        Alice a = new Alice();
        return Way.getWay() + a.getName() + makeKW();
    }

}
