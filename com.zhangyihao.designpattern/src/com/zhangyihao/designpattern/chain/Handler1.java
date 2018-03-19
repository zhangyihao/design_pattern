package com.zhangyihao.designpattern.chain;

import com.zhangyihao.designpattern.chain.Request.Level;

public class Handler1 implements Handler {

	@Override
	public void handleRequet(Request req, Response resp, HandlerChain chain) {
		
		if(req.getLevel() == Level.Level1) {
			resp.setMsg("handl1 agree");
		} else {
			chain.next(req, resp, chain);
		}
	}

}
