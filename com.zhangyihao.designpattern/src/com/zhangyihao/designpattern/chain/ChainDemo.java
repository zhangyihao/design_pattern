package com.zhangyihao.designpattern.chain;

import com.zhangyihao.designpattern.chain.Request.Level;

public class ChainDemo {
	public static void main(String[] args) {
		Handler h1 = new Handler1();
		Handler h2 = new Handler2();
		
		HandlerChain chain = new HandlerChain();
		chain.addHandler(h1);
		chain.addHandler(h2);
		
		Request req1 = new Request("request1", Level.Level1);
		Request req2 = new Request("request1", Level.Level2);
		
		Response resp = new Response();
		
		chain.next(req1, resp, chain);
		System.out.println(resp.getMsg());
		chain.setPos(-1);
		
		chain.next(req2, resp, chain);
		System.out.println(resp.getMsg());
	}
}
