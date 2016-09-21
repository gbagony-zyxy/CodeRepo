package org.ruyin.code.spring.cache;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

/**
 * 	使用Spring提供的Last-Modified机制实现缓存
 * */
public class CacheController extends AbstractController implements LastModified{
	
	private long lastModified;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.getWriter().write("<a herf=''>this</a>");
		return null;
	}

	@Override
	public long getLastModified(HttpServletRequest request) {
		if(lastModified == 0L){
			lastModified = System.currentTimeMillis();
		}
		return lastModified;
	}

}
