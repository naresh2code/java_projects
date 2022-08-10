package com.javaassessment.javaday1concepts;
import java.util.*;
import java.util.stream.Collectors;
public class Fruit {
	public static void main(String args[]) {
		List<FruitPojo> fruitpojo=new ArrayList<FruitPojo>();
		fruitpojo.add(new FruitPojo("Apple","Green",280,150));
		fruitpojo.add(new FruitPojo("Banana","Yellow",125,100));
		fruitpojo.add(new FruitPojo("Mango","Green",270,250));
		fruitpojo.add(new FruitPojo("Pineapple","Green",300,270));
		fruitpojo.add(new FruitPojo("Cherries","Brown",75,150));
		fruitpojo.add(new FruitPojo("Apple","blue",260,150));
		fruitpojo.add(new FruitPojo("Apple","red",100,150));
		
		//Display all the elements from the list
		System.out.println("--All the elements from the list--");
		for(FruitPojo fruits:fruitpojo) {
			System.out.println("Fruit Name:"+fruits.getName()+" color:"+fruits.getColor()+" weight:"+
		fruits.getWeight()+" price:"+fruits.getPrice());
		}
		
		//Sort all the fruit names in Ascending order
		System.out.println();
		System.out.println("---Sorted the all fruitnames in ascending order--");
		List < FruitPojo > fruitsSortedListbyNameAsc = fruitpojo.stream()
	            .sorted(Comparator.comparing(FruitPojo::getName)).collect(Collectors.toList()); //ascending order
		for(FruitPojo fruits:fruitsSortedListbyNameAsc) {
			System.out.println("Fruit Name:"+fruits.getName());
		}

		//Sort all the fruit names in Descending order
		System.out.println("---Sorted the all fruitnames in descending order--");
		List < FruitPojo > fruitsSortedListbyNameDesc = fruitpojo.stream()
	            .sorted(Comparator.comparing(FruitPojo::getName).reversed()).collect(Collectors.toList()); //ascending order
		for(FruitPojo fruits:fruitsSortedListbyNameDesc) {
			System.out.println("Fruit Name:"+fruits.getName());
		}
		
		//Print the all fruits whose name is apple and weight is greaterthan 250
		System.out.println();
		System.out.println("---All fruits whose name is apple and weight is greaterthan 250-");

		List<FruitPojo> listoffruits=fruitpojo.stream().filter(p->p.getName().equals("Apple") && p.getWeight()>250).collect(Collectors.toList());
		for(FruitPojo fruits:listoffruits) {
			System.out.println("Fruit Name:"+fruits.getName()+" color:"+fruits.getColor()+" weight:"+
		fruits.getWeight()+" price:"+fruits.getPrice());
		}
		
		
		//sort the all the fruits by name and price
		System.out.println();
		List < FruitPojo > fruitsSortedListbyNamePrice = fruitpojo.stream()
	            .sorted(Comparator.comparing(FruitPojo::getName).thenComparingDouble(FruitPojo::getWeight)).collect(Collectors.toList()); //ascending order
		System.out.println("---Sorted the all fruits by name and wieght in ascending order--");
		for(FruitPojo fruits:fruitsSortedListbyNamePrice ) {
			System.out.println("Fruit Name:"+fruits.getName()+"  color:"+fruits.getColor()+"  weight:"+
		fruits.getWeight()+"  price:"+fruits.getPrice());
		}
	}
}
