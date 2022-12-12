
public class AliceBranchCling extends Activities {
   @Override
   protected String makeKW() {
       keyWords = "все время цеплялись за ее новую шею, ";
       return keyWords;
   }
   @Override

   public String toString() {
       Branches b = new Branches();
       return b.getName() + makeKW();
   }
}
