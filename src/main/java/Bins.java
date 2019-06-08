
public class Bins {
    int minimum;
    int maximum;
    public int[]Bin;


   public Bins(int minimum, int maximum) {
       this.minimum = minimum;
       this.maximum = maximum;
       Bin = new int[maximum - minimum + 1];
   }
   public int getBin(int binNumber){
     return Bin[binNumber-minimum];
   }
   public void incrementBin(int binNumber){
       Bin[binNumber-minimum]+=1;

   }
}
