package pers.wh.school.fee.choice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pers.wh.school.fee.choice.entity.Student;

import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wanghui
 * @date 2018/8/31 13:28
 */
@Component
@Slf4j
public class SessionManage {
    public static final String USER_ATTR = "STUDENT";

    /** key=studentId， value=HttpSession */
    public Map<Long, HttpSession> sessionMap = new ConcurrentHashMap<>();

    public void saveSession(HttpSession session, Student student){
        removeSession(student.getId());
        session.setAttribute(USER_ATTR, student);
        sessionMap.put(student.getId(), session);
        log.debug("saveSession.{} ： studentId={}, 当前在线人数：{}",session.getId(),student.getId(), sessionMap.size());
    }

    private void removeSession(long studentId){
        HttpSession session = sessionMap.remove(studentId);
        if(session != null){
            session.removeAttribute(USER_ATTR);
            log.debug("removeSession.{} ： studentId={}", session.getId(), studentId);
        }

    }

}
