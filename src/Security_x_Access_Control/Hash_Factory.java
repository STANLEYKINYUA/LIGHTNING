package Security_x_Access_Control;

import java.math.BigInteger;
import java.security.MessageDigest;

/** A class that is used to hash passwords and prepare hashes for Comparison */
public class Hash_Factory
{

    public Hash_Factory()
    {

    }


    public String Hash_Password(String Password_to_Hash)
    {
        String pwd = Password_to_Hash;
        String pwd_Hash="";
        try
        {
            //Get an instance of the Message Digest Class for Hashing
            MessageDigest Message_Digest = MessageDigest.getInstance("SHA-512");

            //Message digest is returned as an array of bytes
            byte[] Digested = Message_Digest.digest(pwd.getBytes());

            //Converts the byte array into Signum Representation
            BigInteger  chum = new BigInteger(1,Digested);

            //Convert Message Digest into hex values
            String Hash_Text = chum.toString(16);

            //In case Message shorter than 32 bits :: add preceding 0s
            while(Hash_Text.length() < 32)
            {
                Hash_Text = "0" + Hash_Text;
            }

            return pwd_Hash;


        }
        catch( Exception Password_Hashing_Exception)
        {
            Password_Hashing_Exception.printStackTrace();
            return null;

        }


    }









}
