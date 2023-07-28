package edu.poly.shopp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


@Component
public class AdminAuthenticationInterceptor implements HandlerInterceptor {
	
	@Autowired
	private HttpSession session;
	
	@Override					// tham số đầu vào
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception { //pt đươch gọi xử lý ycầu từ ng dùng
		System.out.println("pre handle of request" + request.getRequestURI());
		if (session.getAttribute("username") != null) {// ktr user có được lưu trong ss k
			return true; // nếu có sẽ trả về 
		}
		
		session.setAttribute("redirect-uri", request.getRequestURI());
		response.sendRedirect("/alogin");
		
		return false;
	}
	
}
