package com.MyFirstProject.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


interface mainIneface {

	public abstract void up();

	public abstract void down();

	public abstract void right();

	public abstract void left();
}
@Component("sm")
class superMario1 implements mainIneface {
	public void up() {
		System.out.println("superMario Up");
	}

	public void down() {
		System.out.println("superMario down");
	}

	public void right() {
		System.out.println("superMario right");
	}

	public void left() {
		System.out.println("superMario left");
	}
}
@Component("pc")
class packMan1 implements mainIneface {
	public void up() {
		System.out.println("packMan Up");
	}

	public void down() {
		System.out.println("packMan down");
	}

	public void right() {
		System.out.println("packMan right");
	}

	public void left() {
		System.out.println("packMan left");
	}
}
@Component
class contra1 implements mainIneface {
	public void up() {
		System.out.println("contra Up");
	}

	public void down() {
		System.out.println("contra down");
	}

	public void right() {
		System.out.println("contra right");
	}

	public void left() {
		System.out.println("contra left");
	}
}
@Component
class gameRunner1 {
	@Autowired
	@Qualifier("pc")
	public void runGame(mainIneface MF) {
		MF.down();
		MF.up();
		MF.right();
		MF.left();
	}
}
@SpringBootApplication
public class loosliy {
@Autowired
gameRunner1 gr;
	public static void main(String[] args) {
		SpringApplication.run(loosliy.class,args);
		
	}
}
