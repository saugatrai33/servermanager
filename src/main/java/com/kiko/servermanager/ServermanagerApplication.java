package com.kiko.servermanager;

import com.kiko.servermanager.enumeration.Status;
import com.kiko.servermanager.model.Server;
import com.kiko.servermanager.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServermanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServermanagerApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ServerRepo repo) {
        return args -> {
            repo.save(new Server(
                    1L,
                    "192.168.1.160",
                    "Ubuntu Linux",
                    "16 GB",
                    "Personal PC",
                    "http://localhost:8080/server/images/server1.png",
                    Status.SERVER_UP));

            repo.save(new Server(
                    2L,
                    "192.168.1.200",
                    "Kali Linux",
                    "32 GB",
                    "Hacking PC",
                    "http://localhost:8080/server/images/server2.png",
                    Status.SERVER_DOWN));

            repo.save(new Server(
                    3L,
                    "192.168.1.16",
                    "Windows Server",
                    "64 GB",
                    "Personal PC",
                    "http://localhost:8080/server/images/server3.png",
                    Status.SERVER_UP));

            repo.save(new Server(
                    4L,
                    "192.168.1.13",
                    "MacOS Server",
                    "32 GB",
                    "Backend Mac",
                    "http://localhost:8080/server/images/server4.png",
                    Status.SERVER_UP));
        };
    }
}
