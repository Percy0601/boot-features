package io.training.boot.features.error.resolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice("io.training.boot.features.error.web")
public class MyRestControllerAdvice extends ExceptionHandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object arg2,
			Exception e) {
		log.info("===========处理异常==========={}, {}, {}, {}", request.getParameter("name"), response, arg2,
				e.getMessage());
		return super.resolveException(request, response, arg2, e);
	}

}
