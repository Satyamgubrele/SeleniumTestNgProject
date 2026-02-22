package pojo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void count(ArrayList<VehicleService>ls){
        int count=0;
       for(VehicleService v:ls){
           if(v.isServiceComplete()&& v.getServiceType()=="Full Service"){
               count++;
           }
       }

    }
    public static void main(String[] args) {
        List<VehicleService> ls=new ArrayList<>();
        ls.add(new VehicleService(1, "MH12AB4589", "Rahul Sharma", "Full Service", true));
        ls.add(new VehicleService(2, "DL05XY7821", "Anita Verma", "Oil Change", false));
        ls.add(new VehicleService(3, "KA03MN9987", "Vikram Singh", "Engine Repair", true));
        ls.add(new VehicleService(4, "UP16PQ3456", "Sneha Gupta", "Water Wash", false));
        ls.add(new VehicleService(5, "RJ14ZX1122", "Arjun Mehta", "Brake Replacement", true));
        ls.add(new VehicleService(6, "TN09LK6677", "Priya Nair", "Battery Replacement", false));
        ls.add(new VehicleService(7, "GJ01BC2345", "Rohit Patel", "Tyre Change", true));
        ls.add(new VehicleService(8, "HR26DF7788", "Neha Kapoor", "AC Service", false));
        ls.add(new VehicleService(9, "PB10GH5566", "Manpreet Singh", "Clutch Repair", true));
        ls.add(new VehicleService(10, "MP04JK9900", "Amit Tiwari", "General Checkup", false));





    }
}
