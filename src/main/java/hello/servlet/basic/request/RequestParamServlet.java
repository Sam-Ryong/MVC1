package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;


@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("[전체 파라미터 조회] - start");
        Enumeration<String> parameterNames = request.getParameterNames();
        parameterNames.asIterator().forEachRemaining(paramName -> System.out.println(paramName + " : " + request.getParameter(paramName)));
        System.out.println("[전체 파라미터 조회] - end");

        System.out.println();
        System.out.println("[단일 파라미터 조회]");
        String name = request.getParameter("name");
        System.out.println("name = " + name);

        System.out.println();
        System.out.println("[이름이 같은 복수 파라미터 조회]");
        String[] names = request.getParameterValues("name");
        for (String s : names) {
            System.out.println("s = " + s);
            
        }

        response.getWriter().write("ok");
    }
}
