package com.rt.cloning;

public class TestClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	Department d1=new Department(7, "HR");
	Employee e1=new Employee(1, "Ram",d1);
	Employee e2= e1.clone();
	

	System.out.println(e1);
	//Employee id: 1 Employee Name: Ram Dep Name:HR Dep Id:7
	System.out.println(e2);
	//Employee id: 1 Employee Name: Ram Dep Name:HR Dep Id:7
//	e2.setEid(3);
	e2.setEname("Shyam");
	e2.getDep().setDid(8);
	e2.getDep().setDname("Acc");
	System.out.println(e1);
	//Employee id: 1 Employee Name: Ram Dep Name:HR Dep Id:7
	System.out.println(e2);
	//Employee id: 1 Employee Name: Shyam Dep Name:Acc Dep Id:8
//new Employee().getEid();
	System.out.println(e1 instanceof Cloneable);
	//true
	System.out.println(e1.clone()!=e1);
	//true
	System.out.println(e2.getClass()==e1.getClass());
	//true
	System.out.println(e1.equals(e2));
	//true
	}

}
