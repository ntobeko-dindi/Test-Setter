/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsetter;

public class FileCrypto implements EncryptModel{

    @Override
    public byte[] encrypt(byte[] data) {
        byte[] enc = new byte[data.length];
        
        for(int x = 0; x < data.length; x++)
        {
            enc[x] = (byte)((x % 2 == 0)? data[x] + 3 : data[x] - 1);
        }
        return enc;
    }

    @Override
    public byte[] decrypt(byte[] data) {
        byte[] enc = new byte[data.length];
        
        for(int x = 0; x < data.length; x++)
        {
            enc[x] = (byte)((x % 2 == 0)? data[x] - 3 : data[x] + 1);
        }
        return enc;
    }
}
