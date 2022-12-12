public class AliceHeight extends Activities {
    private ThreeAlice Alt = new ThreeAlice();
    
//  1(она), 2(ТОГО), 3(ЭТОГО), 4(увеличивалась), 5(уменьшалась),
//  6(ей), 7(стать в точности такой, какой она была обычно).
    
    
    @Override
    protected String makeKW() {
        keyWords = "с величайшей осторожностью стала откусывать по крошечке то от , то от кусочка и то , то , и в конце концов " + "удалось .";
        return keyWords;
    }
    @Override
    public String toString() {
        Mursh m = new Mursh();
        return makeKW().substring(0,27) + Alt.a.getTOName() + makeKW().substring(27,62) + m.getTOName() + makeKW().substring(62,70) + m.getTO1Name() + makeKW().substring(70,83) + Changes.ChngH(Alt.a,Alt.a0) + makeKW().substring(83,88) + Changes.ChngH(Alt.a0, Alt.a1) + makeKW().substring(88,107) + Alt.a.getTO1Name() + makeKW().substring(107,115) + Changes.ChngH(Alt.a1, Alt.a2) + makeKW().substring(115);
    }
 
}
