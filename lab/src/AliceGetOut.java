
public class AliceGetOut extends Activities{
    @Override
    protected String makeKW() {
        keyWords = "и поминутно приходилось ";
        return keyWords;
    }
    @Override
    public String toString() {
        Alice a = new Alice();
        return makeKW().substring(0,2)+a.getTO1Name() + makeKW().substring(2);
    }
}
