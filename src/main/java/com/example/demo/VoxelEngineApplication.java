package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VoxelEngineApplication {


    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Cube Renderer";
        config.width = 800;
        config.height = 600;
        new LwjglApplication(new CubeRenderer(), config);
    }
}
