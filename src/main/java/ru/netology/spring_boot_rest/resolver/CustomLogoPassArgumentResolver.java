package ru.netology.spring_boot_rest.resolver;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import ru.netology.spring_boot_rest.annotatin.LogoPassAnnotation;


public class CustomLogoPassArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterAnnotation(LogoPassAnnotation.class) != null;
    }

    @Override
    public Object resolveArgument(
            MethodParameter parameter,
            ModelAndViewContainer mavContainer,
            NativeWebRequest webRequest,
            WebDataBinderFactory binderFactory
    ) throws Exception {
        String user = webRequest.getParameter("user");
        String password = webRequest.getParameter("password");
        if (user != null || password != null) {
            return new ru.netology.spring_boot_rest.model.LogoPass(user, password);
        }
        return null;
    }
}