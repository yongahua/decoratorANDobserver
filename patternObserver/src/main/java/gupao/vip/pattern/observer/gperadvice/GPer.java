package gupao.vip.pattern.observer.gperadvice;

import java.util.Observable;

/**
 * 被观察者
 */
public class GPer extends Observable{
    private String name = "GPer生态圈";
    private static GPer gper = null;
    public GPer() {
    }

    public static GPer getInstance(){
        if(gper ==null){
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
