import jadex.bridge.service.annotation.OnStart;
import jadex.commons.future.IFuture;
import jadex.micro.annotation.Agent;
import jadex.micro.annotation.Description;

/**
 *  A simple agent for the hello world program.
 */
@Agent
@Description("This agent prints out a hello world message.")
public class HelloAgent {

    /**
     * Called when the agent is started.
     */
    @OnStart
    public IFuture<Void> executeBody() {
        System.out.println("Hello world!");
        return IFuture.DONE;
    }

}
