package demo;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

public class PlusTenProcessor extends SubmissionPublisher<Integer> implements Subscriber<Integer> {
    private Subscription subscription;
    
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }
    
    public void onNext(Integer item) {
        submit(item + 10);
        subscription.request(1);
    }
    
    public void onError(Throwable error) {
        error.printStackTrace();
        closeExceptionally(error);
    }
    
    public void onComplete() {
        System.out.println("PlusTenProcessor completed");
        close();
    }
}