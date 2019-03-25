package gupao.vip.pattern.observer.gperadvice;

import com.sun.deploy.panel.WinUpdatePanel;

public class ObserverTest {

    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        Question question = new Question();
        question.setUserName("Brave");
        question.setContent("观察者设计模式适用于哪些场景？");
        gper.addObserver(tom);
        gper.publishQuestion(question);

    }
}
