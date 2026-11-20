package com.kodewala.date27.interf5;

public class MxPlayer implements IVideoProvider {
	@Override
	public void play() {
		System.out.println("MxPlayer!, Video Started");
	}

	@Override
	public void pause() {
		System.out.println("MxPlayer !!  Video pause");
	}

	@Override
	public void stop() {
		System.out.println("Video Stop");
	}

}
