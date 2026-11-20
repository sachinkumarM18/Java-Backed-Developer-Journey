package com.kodewala.date27.interf5;

public class Netflix implements IVideoProvider {

	@Override
	public void play() {
		System.out.println("Netflix!, Video Started");
	}

	@Override
	public void pause() {
		System.out.println("Netflix !!  Video pause");
	}

	@Override
	public void stop() {
		System.out.println("Video Stop");
	}

}
