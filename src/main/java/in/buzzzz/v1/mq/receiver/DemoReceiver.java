package in.buzzzz.v1.mq.receiver;

import java.util.concurrent.CountDownLatch;

public class DemoReceiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("#################Received " + message + "");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        System.out.println("################### getLatch ##############");
        return latch;
    }
}
