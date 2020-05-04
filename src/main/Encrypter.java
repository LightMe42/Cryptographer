package main;
public class Encrypter {
    StringBuilder encMsg = new StringBuilder();
    String msg;
    int key = 77;

    public Encrypter(String msg) {
        this.msg = msg;
    }

        public StringBuilder Encrypting (){
            for (int i = 0; i < msg.length(); i++) {
                encMsg.append((char) (msg.charAt(i) ^ key));
            }
            return encMsg;
        }

}
