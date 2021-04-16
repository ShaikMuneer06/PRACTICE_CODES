package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Client {
	public static void main(String[] args) {
        Employee e1 = new Employee(1001,"Ram",9999,"Ram@hcl.com");
        Employee e2 = new Employee(1002,"Raghu",10900,"Raghu@hcl.com");
        Employee e3 = new Employee(1003,"Rahul",19999,"Rahul@hcl.com");
        Employee e4 = new Employee(1004,"Nair",20000,"Nair@hcl.com");
        Employee e5 = new Employee(1005,"Likith",100000,"Likith@hcl.com");
        
        
        Department d1 = new Department(1,"Apps","Banglore");
        Department d2 = new Department(2,"Infra","Chennai");
        
        
// By using Id as key
        Map<Integer ,Department> empdepMap = new HashMap<>();
        empdepMap.put(e1.getEmpId(), d1);
        empdepMap.put(e2.getEmpId(), d1);
        empdepMap.put(e3.getEmpId(), d1);
        
        empdepMap.put(e4.getEmpId(), d2);
        empdepMap.put(e5.getEmpId(), d2);
        
       for(Map.Entry<Integer , Department> entry : empdepMap.entrySet()){
    	   System.out.println("Employee id :"+entry.getKey());
    	   Department emp = entry.getValue();
    	   emp.printDepartment();
    	   
    	   
       }
// By Using Name as Key
       Map<String ,Department> empdepMa = new HashMap<>();
       empdepMa.put(e1.getEmpName(), d1);
       empdepMa.put(e2.getEmpName(), d1);
       empdepMa.put(e3.getEmpName(), d1);
       empdepMa.put(e4.getEmpName(), d2);
       empdepMa.put(e5.getEmpName(), d2);
       
      for(Map.Entry<String , Department> entry : empdepMa.entrySet()){
   	   System.out.println("Employee Name: "+entry.getKey());
   	   Department emp = entry.getValue();
   	   emp.printDepartment();
   	   
   	   
      }
	}
}
