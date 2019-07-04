package com.luv2code.springdemo;

import java.util.List;

import javax.swing.text.html.HTMLEditorKit.InsertHTMLTextAction;

import java.util.*;
class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Trial {
	
	public static void main(String[] args) {
		Point[] points = new Point[10];
		for(int i = 0; i < 10; i++) {
			Point point = new Point(i, i);
			points[i] = point;
		}
		System.out.println(points[0].x);
	}
}
