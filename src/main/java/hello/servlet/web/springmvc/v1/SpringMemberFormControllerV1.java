package hello.servlet.web.springmvc.v1;

import hello.servlet.web.frontcontroller.ModelView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // Controller 어노테이션은 Component가 붙어있음 그래서 컴포넌트 스캔의 대상임, 그리고 매핑가능하게함.
// 혹은 @RequestMapping을 클래스 레벨에 달아도 매핑의 대상이된다. 단, @Component를 또 달아서 빈에 등록해줘야함.
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process(){
        return new ModelAndView("new-form");
    }

}
