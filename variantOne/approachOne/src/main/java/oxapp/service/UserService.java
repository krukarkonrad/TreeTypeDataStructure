package oxapp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import oxapp.model.User;
import oxapp.payload.GetURL;
import oxapp.repository.UserRepository;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.Set;
import java.util.zip.InflaterInputStream;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String loadFromURL(GetURL getURL){

        try {
            URLConnection connection = new URL("https://jsonplaceholder.typicode.com/users").openConnection();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new InflaterInputStream(connection.getInputStream()));
            System.out.println(bufferedInputStream.read());
        } catch (Exception e){
            e.printStackTrace();
        }

        return "test: " + getURL.getUrl();
    }



}
