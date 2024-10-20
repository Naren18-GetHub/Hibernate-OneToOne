package main;

import beans.Answer;
import beans.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Question q1 = new Question();
        q1.setQ_id(112);
        q1.setQuestion("What is Java");

        Answer ans1 = new Answer();
        ans1.setA_id(123);
        ans1.setAnswer("Java is PL");
        q1.setAnswer(ans1);

        Question q2 = new Question();
        q2.setQ_id(115);
        q2.setQuestion("What is Python");

        Answer ans2 = new Answer();
        ans2.setA_id(106);
        ans2.setAnswer("Java is Easy PL");
        q2.setAnswer(ans2);

        org.hibernate.cfg.Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(q1);
        session.save(q2);
        session.save(ans1);
        session.save(ans2);

        tx.commit();
    }
}
