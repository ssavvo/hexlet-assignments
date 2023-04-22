package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {
    private final String STATE_NAME = "connected";
    private TcpConnection protocol;
    private StringBuilder message = new StringBuilder();
    public Connected(TcpConnection protocol) {
        this.protocol = protocol;
    }
    @Override
    public void disconnect() {
        this.protocol.changeState(new Disconnected(this.protocol));
    }
    @Override
    public void connect() {
        System.out.println("Error");
    }
    @Override
    public void write(String str) {
        message.append(str);
    }
    @Override
    public String getCurrentState(){
        return STATE_NAME;
    }
}
// END
