package com.zhangyihao.designpattern.chain;

public class Request {
	
	private Level level = null;
	private String request = null;
	
	public Request(String request, Level level) {
		this.request = request;
		this.level = level;
	}
	
	public Level getLevel() {
		return level;
	}


	public String getRequest() {
		return request;
	}


	enum Level {
		Level1, Level2
	}
}
