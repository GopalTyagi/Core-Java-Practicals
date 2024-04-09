package com.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LotteryStreamTest {
	public static void main(String[] args) {
		List<LottaryStream> l = new ArrayList<LottaryStream>();

		l.add(new LottaryStream("8989903456", "Neeraj"));
		l.add(new LottaryStream("9111388908", "anubhav"));
		l.add(new LottaryStream("9111388907", "Abhay"));
		l.add(new LottaryStream("9111388905", "gopal"));
		l.add(new LottaryStream("8989903456", "Yash"));
		l.add(new LottaryStream("9926993456", "krishna"));
		l.add(new LottaryStream("8236856765", "mangal"));
		l.add(new LottaryStream("9111388907", "aman"));
		l.add(new LottaryStream("8899785534", "ram"));
		l.add(new LottaryStream("9111388903", "adarsh"));

		l.stream()//.map(e->e.getNo())
		.map(e->e.getName())
				// .filter(e->e.length()==10) .distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(),
				e -> {   Collections.shuffle(e);
				return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

		/*
		 * l.stream().map(e-> e.getName()).distinct().collect(Collectors.
		 * collectingAndThen(Collectors.toList(), e-> {Collections.shuffle(e); return
		 * e.stream();})) .limit(3).forEach(e-> System.out.println(e));
		 */
		/*
		 * l.stream().map(e -> e.getName()).distinct().collect(Collectors.
		 * collectingAndThen(Collectors.toList(), e -> { Collections.shuffle(e); return
		 * e.stream(); })).limit(3).forEach(e -> System.out.println(e));
		 */
	}
}
