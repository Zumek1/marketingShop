package pl.coderslab.app.pm;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import pl.coderslab.app.orders.OrderItem;

import javax.servlet.http.HttpSession;

@Service
@Transactional
@SessionAttributes
public class PmService {
    public HttpSession session(){
        ServletRequestAttributes attributes = (ServletRequestAttributes)
                RequestContextHolder.currentRequestAttributes();
        return attributes.getRequest().getSession();
    }

}