//package com.MyFirstProject.sample;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Component;
//
//@Component
//class superMario
//{
//	public void up()
//	{
//	System.out.println("superMario Up");	
//	}
//	public void down()
//	{
//	System.out.println("superMario down");	
//	}
//	public void right()
//	{
//		System.out.println("superMario right");	
//	}
//	public void left()
//	{
//		System.out.println("superMario left");
//	}
//}
//@Component
//class packMan
//{
//	public void up()
//	{
//	System.out.println("packMan Up");	
//	}
//	public void down()
//	{
//	System.out.println("packMan down");	
//	}
//	public void right()
//	{
//		System.out.println("packMan right");	
//	}
//	public void left()
//	{
//		System.out.println("packMan left");
//	}
//}
//@Component
//class contra
//{
//	public void up()
//	{
//	System.out.println("contra Up");	
//	}
//	public void down()
//	{
//	System.out.println("contra down");	
//	}
//	public void right()
//	{
//		System.out.println("contra right");	
//	}
//	public void left()
//	{
//		System.out.println("contra left");
//	}
//}
//@Component
//class gameRunner
//{
//	@Autowired
//	public void runGame(contra sm)
//	{
//	sm.up();
//	sm.down();
//	sm.right();
//	sm.left();
//	}
//	@Autowired
//	public void runGame(packMan sm)
//	{
//	sm.up();
//	sm.down();
//	sm.right();
//	sm.left();
//	}
//	@Autowired
//	public void runGame(superMario sm)
//	{
//	sm.up();
//	sm.down();
//	sm.right();
//	sm.left();
//	}
//}
//@SpringBootApplication
//public class SampleApplication {
//	@Autowired
//	gameRunner gr;
//	public static void main(String[] args) {
//		SpringApplication.run(SampleApplication.class,args);
//	}
//}