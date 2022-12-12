
public class AliceOut2FA extends Activities{
    @Override
    protected String makeKW() {
        keyWords = "Выбравшись на свободное место, ";
        return keyWords;
    }
    @Override
    public String toString() {
        Alice.trueCondOfCling();
        return makeKW() + Way.getWay();
    }
}
