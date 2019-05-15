package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
    Car car= new Car("2019","Nissan" ,"Altima");
    repository.save(car);

    car=new Car("2016","Kia","Rio");
    repository.save(car);

    car=new Car("2020","Jaguar","XF");
    repository.save(car);
    }
}
