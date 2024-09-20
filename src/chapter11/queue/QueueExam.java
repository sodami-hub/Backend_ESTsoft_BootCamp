package chapter11.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<>();

        queue.offer(new Message("sendKakaoTalk","jenny"));
        queue.offer(new Message("sendEmail","해"));
        queue.offer(new Message("sendSms","해"));


        while(!queue.isEmpty()) {
            Message msg = queue.poll();
            String cmd = msg.getCommand();
            switch(cmd) {
                case "sendKakaoTalk":
                    System.out.println(msg.getTo()+"에게"+" 카톡을 보냄" );
                    break;
                case "sendEmail":
                    System.out.println(msg.getTo()+"에게"+" 이메일을 보냄" );
                    break;
                case "sendSms" :
                    System.out.println(msg.getTo()+"에게"+" Sms를 보냄" );
                    break;
            }
        }


    }
}
