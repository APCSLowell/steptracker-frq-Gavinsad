import java.util.ArrayList;
public class StepTracker
{
private int totalSteps;
 private int activeDays;
 private int days;
 private int stepGoal;
 public stepTracker(int num){ 
  stepGoal=num;
  totalSteps =0;
  activeDays=0;
  days=0;                   
  }
 public void addDailySteps(int steps){
totalSteps += steps;
 days++;
 if(steps>=stepGoal){activeDays++;}
 }
 public int ActiveDays(){return activeDays;}
 public double averageSteps(){
  if(days==0){return 0;}
  return (double)totalSteps/days;}
} 
