package FitnessTracker;

public class FitnessDevice implements Itackerable,IReortable,INotifiable{
    int steps;
    int calories;

    public FitnessDevice(int steps, int calories){
        this.steps = steps;
        this.calories = calories;
    }

    @Override
    public void logActivity(){
        System.out.println("----------------------");
        System.out.println("Activity is Logged ");
        System.out.println("steps : "+steps);
        System.out.println("Calories Buened : "+calories);
        System.out.println("-----------------------");

    }

    @Override
    public void generateReport(){
        System.out.println("------------------");
        System.out.println("Fitness Report");
        System.out.println("===================");
        System.out.println("Total Steps: "+ steps);
        System.out.println("Calories Burned : "+calories);
        System.out.println("--------------------");
    }

    @Override
    public void sendAlert(){
        int remaningSteps = 5000-steps;
        if(steps < 5000){
            System.out.println("You have not reeched to the Goal : "+remaningSteps+" ");
        }else{
            System.out.println("you have completed your goal of 5000 steps");
        }
    }

}
