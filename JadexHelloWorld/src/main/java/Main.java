import jadex.base.IPlatformConfiguration;
import jadex.base.PlatformConfigurationHandler;
import jadex.base.Starter;

public class Main {
    /**
     *  Start Jadex platform with the hello agent.
     */
    public static void main(String[] args)
    {
        IPlatformConfiguration configuration = PlatformConfigurationHandler.getDefaultNoGui();
        configuration.addComponent(HelloAgent.class);
        Starter.createPlatform(configuration).get();
    }
}
