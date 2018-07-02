package com.garlicts.framework.crawler.htmlunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.garlicts.framework.extension.Plugin;
import com.garlicts.framework.ioc.BeanContainerComponent;
import com.garlicts.framework.util.ClassUtil;

public class CrawlerPlugin implements Plugin {

	private static final Logger LOGGER = LoggerFactory.getLogger(CrawlerPlugin.class);
	
	@Override
	public void init() {
		
		WebClientPool webClientPool = new WebClientPool();
		BeanContainerComponent.setBean(webClientPool.getClass(), webClientPool);
		
		LOGGER.info("爬虫插件启动...");
		
	}

	@Override
	public void destroy() {
		
	}

}
