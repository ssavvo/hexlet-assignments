package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection{
    private final String STATE_NAME = "disconnected";
    private TcpConnection protocol;
    public Disconnected(TcpConnection protocol) {
        this.protocol = protocol;
    }
    @Override
    public void disconnect() {
        System.out.println("Error");
    }
    @Override
    public void connect() {
        this.protocol.changeState(new Connected(this.protocol));
    }
    @Override
    public void write(String str) {
        System.out.println("Error");
    }
    @Override
    public String getCurrentState(){
        return STATE_NAME;
    }
}
// END
