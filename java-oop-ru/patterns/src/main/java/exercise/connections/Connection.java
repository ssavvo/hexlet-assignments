package exercise.connections;

import exercise.TcpConnection;

public interface Connection {
    // BEGIN
    public void disconnect();
    public void connect();
    public String getCurrentState();
    public void write(String str);

    // END
}
