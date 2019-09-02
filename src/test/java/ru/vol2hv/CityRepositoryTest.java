package ru.vol2hv;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CityRepositoryTest {
    @Autowired
    CityRepository repository;
    @Autowired
    City city=new City();
    @Autowired
    Cat cat =new Cat();


    @Before
    public void setUp() throws Exception {
        System.out.println("Это тест");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findByName() throws Exception {
        repository.save( new City(1,"ggg","rrr"));

    }

}