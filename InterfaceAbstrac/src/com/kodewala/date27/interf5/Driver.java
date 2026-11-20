package com.kodewala.date27.interf5;

public class Driver {

	public static void main(String[] args) {
		providerVideo(new Netflix());
		providerVideo(new MxPlayer());
		providerVideo(new Hotstar());
	}

	private static void providerVideo(IVideoProvider provider) {
		provider.play();
		provider.pause();
		provider.stop();
	}
}
