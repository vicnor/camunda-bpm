package dk.apendo.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("orderDelegate")
public class OrderDelegate implements JavaDelegate {

    private final Logger LOGGER = Logger.getLogger(OrderDelegate.class.getName());

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("Ordering a beer");
    }
}
