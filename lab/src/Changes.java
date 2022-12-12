public class Changes {
    public static String ChngH(Alice a1, Alice a2){
        String s = new String();
        s = "(Рост не изменился)";
        if (a1.equals(a2) == false){
            s = "(Рост изменился: ";
        
        if(a2.hashCode()-a1.hashCode()>0){
            s += "увеличился)";
        }
        else
        {
            s += "уменьшился)";
        }


        if(a2.getSize() == Size.BIG){
            s = s+" увеличивалась";
        }
        if(a2.getSize() == Size.SMALL){
            s = s+" уменьшалась";
        }
        if(a2.getSize() == Size.NORMAL){
            s = s+"стать в точности такой, какой она была обычно";
        } 
        }       
        else{
            return s;
        }
        
        

        return s;
    }
}
