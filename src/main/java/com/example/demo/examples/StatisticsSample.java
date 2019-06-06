package com.example.demo.examples;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

import com.example.demo.Test;

public class StatisticsSample {
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
		IntSummaryStatistics statics = list.stream().mapToInt(test->test.getAge()).summaryStatistics();
		System.out.println("总共人数：" + statics.getCount());
	    System.out.println("平均年龄：" + statics.getAverage());
	    System.out.println("最大年龄：" + statics.getMax());
	    System.out.println("最小年龄：" + statics.getMin());
	    System.out.println("年龄之和：" + statics.getSum());
	}
}
