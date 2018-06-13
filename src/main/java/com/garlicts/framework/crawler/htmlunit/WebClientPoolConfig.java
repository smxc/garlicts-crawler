package com.garlicts.framework.crawler.htmlunit;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class WebClientPoolConfig extends GenericObjectPoolConfig {

	public WebClientPoolConfig(){
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		setMinIdle(availableProcessors);
		setMaxTotal(availableProcessors * 2);
		setTestOnBorrow(true);
	}
	
}
