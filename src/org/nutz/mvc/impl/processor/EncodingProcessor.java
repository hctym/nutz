package org.nutz.mvc.impl.processor;

import org.nutz.mvc.ActionContext;

public class EncodingProcessor extends AbstractProcessor{

	private String input;

	private String output;

	public EncodingProcessor(String input, String output) {
		this.input = input;
		this.output = output;
	}

	public void process(ActionContext ac) throws Throwable {
		ac.getRequest().setCharacterEncoding(input);
		ac.getResponse().setCharacterEncoding(output);
		doNext(ac);
	}

}