/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwwsclient;

/**
 *
 * @author L01
 */
public class HWWSClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        
        generate.HWWebService_Service service = new generate.HWWebService_Service();
        generate.HWWebService port = service.getHWWebServicePort();
        System.out.println(port.hello("šáša Váša"));
    }
    
}
