package top.weidong.example.server;

import network.SServer;
import network.enums.ProcessorType;
import top.weidong.service.DefaultServer;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author dongwei
 * @date 2018/03/22
 * Time: 18:53
 */
public class EchoServer {
    public static void main(String[] args) throws IOException {
        DefaultServer server = new DefaultServer(ProcessorType.CONSOLE,null).withServer(new SServer());
        server.start();
    }
}
