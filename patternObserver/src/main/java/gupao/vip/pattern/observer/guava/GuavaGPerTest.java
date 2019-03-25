package gupao.vip.pattern.observer.guava;

import com.google.common.eventbus.EventBus;
import gupao.vip.pattern.observer.gperadvice.Question;

import java.util.HashMap;
import java.util.Map;

public class GuavaGPerTest {

    public static void main(String[] args) {

        //消息总线
        EventBus eventBus = new EventBus();
        GPerEvent gper = new GPerEvent();

        Question question = new Question();
        question.setUserName("Brave");
        question.setContent("观察者设计模式适用于哪些场景？");


        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");
        Map<GPerEvent,Question> map = new HashMap<GPerEvent,Question>();
        map.put(gper,question);

        eventBus.register(gper);
        eventBus.post(question);

        eventBus.register(tom);
        eventBus.register(mic);
        eventBus.post(map);
    }

}
