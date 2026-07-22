package oops;

interface Animal {
	void sound();
}

class Dog implements Animal {
	
	public void sound() {
		System.out.println("Dog barks");
	}
}

interface Camera {
	void takePhoto();
}

interface MusicPlayer {
	void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
	
	public void takePhoto() {
		System.out.println("Taking photo");
	}
	
	public void playMusic() {
		System.out.println("Playing music");
	}
}

public class interfaceEx {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.sound();
		
		SmartPhone sp = new SmartPhone();
		sp.takePhoto();
		sp.playMusic();
		
	}



}