public class Way {
    public static String getWay(){
        if(Alice.getCond() == false){
            return "(Алиса ещё не выбралась из леса) ";
        }
        else{
            return "(Алиса выбралась из леса) ";
        }
    }
}
