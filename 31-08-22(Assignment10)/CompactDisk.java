package com.OOPs.java;


class CompactDisk extends Product{
	String Artist;
	String title;
	CompactDisk(String Artist,String title){
		super(600);
		this.Artist=Artist;
		this.title=title;
	}
	public void show2() {
	System.out.println("The Artist name is " +this.Artist);
	System.out.println("The title is " +this.title);

	}

}