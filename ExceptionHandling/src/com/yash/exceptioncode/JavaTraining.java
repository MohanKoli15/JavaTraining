package com.yash.exceptioncode;

public class JavaTraining {
int capacity;
public static void checkCapacity(int capacity) throws InsuffientCapacityException
{
if(capacity>40) {
	throw new InsuffientCapacityException("Insuffient Capacity Available try Again");
}
else
{
	System.out.println("Welcome to Java Training");
}

}
public static void main(String[] args) throws InsuffientCapacityException {
	checkCapacity(45);
}

	
}
