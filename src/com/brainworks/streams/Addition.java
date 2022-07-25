package com.brainworks.streams;

import java.util.ArrayList;
import java.util.Optional;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(2);
		Optional<Integer> reduce = al.stream().reduce((m,n)->m+n);
		Optional<Integer> reduce1 = al.stream().reduce((m,n)->m*n);
		System.out.println(reduce1);

	}

}
