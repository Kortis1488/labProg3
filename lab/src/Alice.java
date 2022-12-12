
public class Alice implements Charater, CharaterAdd{
    private static boolean condOfCling = false; 
    private Size size = Size.UNKNOW;
    
    public String getName(){
        return "Алиса ";
    }
    public String getTOName(){
        return "Она ";
    }
    public String getTO1Name(){
        return "ей ";
    }
    public Size getSize(){
        return size;
    }
    public static boolean getCond(){
        return condOfCling;
    }
    public void chngSize(Size s){
        size = s;
    }
    public static void trueCondOfCling(){
        condOfCling = true;
    }
    @Override
    public boolean equals(Object obj) {
        Alice alice = (Alice) obj;
        return this.size == alice.size;
    }
    @Override
    public int hashCode() {
        int i = 69;
        if(size == Size.UNKNOW){
            i+=1;
        }
        if(size == Size.BIG){
            i+=2;
        }
        if(size == Size.SMALL){
            i+=3;
        }
        if(size == Size.NORMAL){
            i+=4;
        }


        return i;
    }

}
