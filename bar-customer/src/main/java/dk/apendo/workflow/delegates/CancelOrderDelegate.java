package dk.apendo.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("cancelOrderDelegate")
public class CancelOrderDelegate implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(CancelOrderDelegate.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("Cancelling order");
    }
}
