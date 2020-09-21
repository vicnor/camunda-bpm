package dk.apendo.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("payDelegate")
public class PayDelegate implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(CancelOrderDelegate.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("Paying for the order");
    }
}
