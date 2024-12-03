package com.xworkz.javafeatures.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.xworkz.javafeatures.dto.PersonDto;

public class PersonRunner {
public static void main(String[] args) {
	List<PersonDto>dto = new ArrayList<PersonDto>();
	dto.add(new PersonDto("Raju",30));
	dto.add(new PersonDto("Gowrish",20));
	dto.add(new PersonDto("Kamlesh",25));
	dto.add(new PersonDto("Shivu",19));
	dto.add(new PersonDto("Vinay",22));
	Map<Integer,List<PersonDto>>list = dto.stream().collect(Collectors.groupingBy(PersonDto::getAge));
	System.out.println(list);
}
}

