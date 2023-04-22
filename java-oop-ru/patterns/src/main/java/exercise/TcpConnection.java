package exercise;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection {
    private Connection state;
    private String ipAddress;
    private int port;
    public TcpConnection(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.state = new Disconnected(this);
    }
    public void changeState(Connection newState) {
        this.state = newState;
    }
    public void disconnect() {
        this.state.disconnect();
    }
    public void connect() {
        this.state.connect();
    }
    public String getCurrentState() {
        return this.state.getCurrentState();
    }
    public void write(String str) {
        this.state.write(str);
    }
}
// END
