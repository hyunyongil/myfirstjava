package com.yong.day15.java1;

/**
 * @author yong
 * @date 2020-12-30 오후 3:02
 * @mail yongri1115@163.com
 */
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}

interface NetWork{
    public void browse();
    int x = 1;
}

class Server implements NetWork{
    @Override
    public void browse() {
        System.out.println("真是的服务器访问网络");
    }
}

class  ProxyServer implements NetWork{
    private NetWork work;
    public ProxyServer(NetWork work){
        this.work = work;
    }
    public  void check(){
        System.out.println("联网之前的检查工作");
    }
    @Override
    public void browse() {
        check();
        work.browse();
    }
}
