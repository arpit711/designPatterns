import strategyPattern.GoodsVehicle;
import strategyPattern.OffRoadVehicle;
import strategyPattern.SportsVehicle;
import strategyPattern.Vehicle;
import strategyPattern.strategy.DriveStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
* Major Benefit of doing this is that now same method implementation written inside of
* two classes can be used just by creating a Strategy object and then that object can be used to acheive that functionality
* Otherwise we will have to create duplicate method logic inside two different classes instead of single class
* */
        GoodsVehicle goodsVehicle = new GoodsVehicle();
        SportsVehicle sportsVehicle = new SportsVehicle();
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        goodsVehicle.drive();

        offRoadVehicle.drive();

        sportsVehicle.drive();
        }
}