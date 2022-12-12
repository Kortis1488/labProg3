public class AliceStop extends Activities  {
    @Override
    protected String makeKW() {
        keyWords = keyWords + "останавливаться ";
        return keyWords;
    }

    @Override
    public String toString() {
        
        return makeKW();
    }
}
