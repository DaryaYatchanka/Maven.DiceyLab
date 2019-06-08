public class Simulation {
    Dice dice;
    Bins bins;
    int numberOfTosses;


    public Simulation(int numberOfDice, int numberOfTosses){
        this.dice= new Dice(numberOfDice);
        this.bins = new Bins(numberOfDice, numberOfDice*6);
        this.numberOfTosses = numberOfTosses;
    }

    public void runSimulation(){
        for (int i = 0; i <numberOfTosses; i++) {
            int currentNumber =
                    dice.tossAndSum();
            bins.incrementBin(currentNumber);
        }
    }

    public void printResults(){
        for (int i = dice.numberOfDice; i<=dice.numberOfDice*6;i++){
           String star = " ";
           int numberOfStars = 0;
            numberOfStars=  bins.getBin(i)/1000000;
            for (int j = 0; j<numberOfStars; j ++){
                star +="*";
            }
            System.out.println(String.format("%9d %5.2f %s", bins.getBin(i), bins.getBin(i)/100000000.0, star));



        }
    }

//    public static void main(String[] args) {
//        Dice dice = new Dice(1);
//        for (int i = 0; i <100 ; i++) {
//            System.out.println( dice.tossAndSum());
//        }
 //   }
       public static void main(String[] args){
        Simulation sim = new Simulation(2,100000000);
        sim.runSimulation();
        sim.printResults();
       }



}

