package com.zhangyihao.designpattern.chain;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

	private List<Handler> handlers = new ArrayList<>();
	private int pos = -1;
	
	public void next(Request req, Response resp, HandlerChain chain) {
		pos++;
		if(pos < handlers.size()) {
			handlers.get(pos).handleRequet(req, resp, chain);
		}
	};
	
	public void addHandler(Handler handler) {
		this.handlers.add(handler);
	}
	
	public void setPos(int pos) {
		this.pos = pos;
	}
}
