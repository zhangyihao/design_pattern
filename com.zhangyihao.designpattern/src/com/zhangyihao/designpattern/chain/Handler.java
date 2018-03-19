package com.zhangyihao.designpattern.chain;

public interface Handler {
	
	public abstract void handleRequet(Request req, Response resp, HandlerChain chain);

}
