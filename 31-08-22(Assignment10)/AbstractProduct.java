package com.OOPs.java;

abstract class AbstractProduct {
   int product_id;
   String name;
   String desc;
   AbstractProduct(int product_id,String name,String desc){
	   this.product_id=product_id;
	   this.name=name;
	   this.desc=desc;
   }
   public abstract void display();
   
}









