package com.xworkz.Comprator.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.Comprator.dto.PersonalDto;
import com.xworkz.Comprator.util.Test;

public class ListRunner {
	public static void main(String[] args) {
		
		
		
		Comparator<String> compare = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
			if(o1.equals(o2))
				return 0;
			else
				return 1;
			}
		};
		int result1 = compare.compare("Sagar","Sagar");
		System.out.println("The Result of Compare1 is: "+result1);
		
		//Lambda Expreation
		Comparator<String> compare2 = (String s1,String s2)->s1.equals(s2)? 0:1;
		int result2 = compare2.compare("Raj", "Shivu");
		System.out.println("The Result of Compare2 is: "+result2);
		
		Test compare3 = (String a1,String a2)->a1.equals(a2);
		boolean result3 = compare3.test("Sagar","Vishal");
		System.out.println("The Result of Compare3 is: "+result3);
		
		System.out.println("--------------------------");
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		Comparator<Integer> com = (Integer i1,Integer i2)->i1.compareTo(i2);
		System.out.println(list);
		Comparator<Integer> compare4 = (Integer i1,Integer i2)->i2.compareTo(i1);
		Collections.sort(list, compare4);
		System.out.println(list);
		
		System.out.println("--------------------------");
		
		List<Character> cha = new LinkedList<Character>();
		cha.add('A');
		cha.add('B');
		cha.add('C');
		cha.add('D');
		cha.add('E');
		cha.add('F');
		cha.add('G');
		cha.add('H');
		
		Comparator<Character> cha1 = (Character c1,Character c2)->c1.compareTo(c2);
		System.out.println(cha);
		Comparator<Character> cha2 = (Character c1,Character c2)->c2.compareTo(c1);
		Collections.sort(cha, cha2);
		System.out.println(cha);
		
		System.out.println("--------------------------");
		
		PersonalDto pdto = new PersonalDto();
		pdto.setName("Vishal");
		
		PersonalDto pdto2 = new PersonalDto();
		pdto2.setName("Sagar");
		
		List<PersonalDto> pdto1 = new LinkedList<PersonalDto>();
		pdto1.add(pdto);
		pdto1.add(pdto2);
		System.out.println(pdto1);
		
		Comparator<PersonalDto> str = (PersonalDto p1,PersonalDto p2)->p1.getName().compareTo(p2.getName());
		Collections.sort(pdto1, str);
		System.out.println(pdto1);
		
		System.out.println("--------------------------");
		
		List<Integer> age = new LinkedList<Integer>();
		age.add(20);
		age.add(21);
		age.add(22);
		age.add(23);
		age.add(24);
		age.add(22);
		age.add(25);
		
		Comparator<Integer> compare1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
			if(i1.equals(i2))
				return 0;
			else
				return 1;
			}
			
		};
		
		System.out.println(age);
		Comparator<Integer> ages = (Integer b1,Integer b2)->b2.compareTo(b1);
		Collections.sort(age, ages);
		System.out.println(age);
		
		
	}

}
