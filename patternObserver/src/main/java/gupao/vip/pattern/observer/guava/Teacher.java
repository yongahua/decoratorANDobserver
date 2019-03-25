package gupao.vip.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;
import gupao.vip.pattern.observer.gperadvice.Question;

import java.util.Map;
import java.util.Set;

public class Teacher {

    private String name;
    public Teacher(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Map<GPerEvent,Question> map){
        Set<GPerEvent> gpers = map.keySet();
        for(GPerEvent gper:gpers){
            Question question = map.get(gper);
            System.out.println("===============================");
            System.out.println(name + "老师，你好！\n" +
                    "您收到了一个来自“" + gper.getName() + "”的提问，希望您解答，问题内容如下：\n" +
                    question.getContent() + "\n" +
                    "提问者：" + question.getUserName());
        }

    }
}
