package javaassigment10.question2;

import java.util.Scanner;

public class CDPlayer implements Playable{
	public CDPlayer() {
		start();
	}

	public void start() {
		System.out.println("Options in CD Player\n");
		System.out.println(" 1.Play \n 2.Pause \n 3.stop \n 4.Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Choice");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			play();
			start();
			break;
		case 2:
			pause();
			start();
			break;
		case 3:
			stop();
			start();
			break;
		case 4:
			System.out.println("Thank for using CD Player");
			break;
		}
	}
	
	@Override
	public void play() {
		System.out.println("Song is playing");
	}

	@Override
	public void pause() {
		System.out.println("Song is paused");
	}

	@Override
	public void stop() {
		System.out.println("Song is Stopped");
	}

}
