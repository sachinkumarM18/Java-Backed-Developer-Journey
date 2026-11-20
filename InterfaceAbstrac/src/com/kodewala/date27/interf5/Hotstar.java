package com.kodewala.date27.interf5;

public class Hotstar implements IVideoProvider {
	@Override
	public void play() {
		System.out.println("Hotstar !, Video Started");
	}

	@Override
	public void pause() {
		System.out.println("Hotstar  !!  Video pause");
	}

	@Override
	public void stop() {
		System.out.println("Video Stop");
	}

}
