package com.zhangyihao.designpattern.chain;

import com.zhangyihao.designpattern.chain.Request.Level;

public class Handler2 implements Handler {

	@Override
	public void handleRequet(Request req, Response resp, HandlerChain chain) {
		if(req.getLevel() == Level.Level2) {
			resp.setMsg("handl2 agree");
		} else {
			chain.next(req, resp, chain);
		}
	}

}
