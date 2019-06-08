
public class Dice {
   public int numberOfDice;



public Dice (int d) {
    this.numberOfDice = d;

}

public Integer tossAndSum(){
    int countTossSum=0;
     for (int i = 0; i< numberOfDice; i++){

       countTossSum+=(int)(Math.random() * 6) + 1;
     }
   return countTossSum;
           //(numberOfDice+(int)(Math.random()*(((numberOfDice*6)-numberOfDice)+1)));

    }


}
