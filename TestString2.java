class TestString2 {
 public static void main(String[] arg){
    String b="ja".concat("ck");    
    String c=b.intern();
    System.out.println(c==b);
    String x="ja".concat("ck");     
    String y=x.intern();
    System.out.println(y==x);}}﻿