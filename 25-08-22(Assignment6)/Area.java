package com.OOPs.java;

import java.util.Scanner;
class Area{
	double length;
	double bredth;
  public void setDim(double length,double bredth) {
	  this.length=length;
	  this.bredth=bredth;
  }
  public double getArea() {
	  return this.length*this.bredth;
  }
}