package Bad;

import Bad.BadClient;

public class BadServer {

    public void reactToClient(BadClient client) {
        client.doSomething();
    }

}
