package com.warlen.workshopmongo.config;

import com.warlen.workshopmongo.domain.Post;
import com.warlen.workshopmongo.domain.User;
import com.warlen.workshopmongo.repository.PostRepository;
import com.warlen.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria,alex,bob));

        Post post1= new Post(null,sdf.parse("2024/03/21"),"Partiu viagem","Vou viajar para São Paulo. Abraços!", maria);
        Post post2= new Post(null,sdf.parse("2024/08/23"),"Bom dia","Acordei feliz hoje!", maria);

        postRepository.saveAll(Arrays.asList(post1,post2));


    }
}
