package com.example.demo.examples;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Test;

public class DistinctSample {
	private static List<Test> init(){
		List<Test> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        	Test test = new Test();
        	test.setAge(i);
        	test.setName("test"+i);
        	list.add(test);
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<Test> list = init();
		list.stream().distinct().forEach(test->{
			System.out.println(test.getAge());
			System.out.println(test.getName());
		});
	}
}
