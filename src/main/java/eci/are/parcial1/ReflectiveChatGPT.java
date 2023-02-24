package eci.are.parcial1;

import java.io.IOException;

public class ReflectiveChatGPT {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HttpServer server = HttpServer.get_instance();
        server.run(args);
    }
}
