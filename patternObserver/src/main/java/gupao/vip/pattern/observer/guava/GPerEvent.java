package gupao.vip.pattern.observer.guava;


import com.google.common.eventbus.Subscribe;
import gupao.vip.pattern.observer.gperadvice.Question;

public class GPerEvent {

    private String name = "GPer生态圈";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Question question){
        System.out.println(question.getUserName() + "在" + name + "上提交了一个问题。");
    }
}
