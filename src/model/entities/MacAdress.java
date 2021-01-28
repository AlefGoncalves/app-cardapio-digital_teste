package model.entities;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MacAdress {

    private String macAdress;    

    public MacAdress() {

    }    
    

    public String getMacAdress() {
        return macAdress;
    }

    public void setMacAdress() {
        try {
            InetAddress address = InetAddress.getLocalHost();
            NetworkInterface ni = NetworkInterface.getByInetAddress(address);
            byte[] mac = ni.getHardwareAddress();
            String macAddress = "";
            for (int i = 0; i < mac.length; i++) {
                macAddress += (String.format("%02X-", mac[i]));
            }
            this.macAdress = macAddress.substring(0, macAddress.length() - 1);
        } catch (UnknownHostException | SocketException e) {
            this.macAdress = null;
            e.getMessage();
        }

    }

}
