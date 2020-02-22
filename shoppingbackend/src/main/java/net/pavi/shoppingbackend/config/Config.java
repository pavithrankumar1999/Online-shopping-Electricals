package net.pavi.shoppingbackend.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Config {
public static void main(String args[])
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("net.pavi.shoppingbackend.config");
	context.refresh();
	System.out.println("configuration success");
}
}
