package com.programmer74.jtelephony;


import java.net.InetAddress;

//Client information
class ClientInfo {
    public InetAddress ip;
    public int realPort;
    public int tcpPort;
    public String nickname;
    public boolean isWaitingCall = false;
    public boolean hasAcceptedCall = false;

    public ClientInfo callingTo = null;
    public String callingToStatus = "";
    public ClientInfo beingCalledBy = null;
    public ClientInfo talkingTo = null;

    public String password = "123";

    public int ID;

    public ClientInfo (String nickname, InetAddress ip, int port)
    {
        this.nickname = nickname;
        this.ip = ip;
        this.realPort = port;
    }
}