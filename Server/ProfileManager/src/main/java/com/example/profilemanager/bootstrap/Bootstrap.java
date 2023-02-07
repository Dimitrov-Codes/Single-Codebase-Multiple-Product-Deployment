package com.example.profilemanager.bootstrap;

import com.example.profilemanager.models.Burger;
import com.example.profilemanager.models.Juice;
import com.example.profilemanager.repositories.BurgerRepository;
import com.example.profilemanager.repositories.JuiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    private final BurgerRepository burgerRepository;
    private final JuiceRepository juiceRepository;

    public Bootstrap(BurgerRepository burgerRepository, JuiceRepository juiceRepository) {
        this.burgerRepository = burgerRepository;
        this.juiceRepository = juiceRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Burger chickenCheeseBurger = new Burger();
        chickenCheeseBurger.setBurgerName("Chicken Cheese Burger");
        chickenCheeseBurger.setDescription("Juicy chicken burger topped with cheddar cheese Dynamo sauce");
        chickenCheeseBurger.setPrice(230);
        burgerRepository.save(chickenCheeseBurger);
        Burger crabBurger = new Burger();
        crabBurger.setBurgerName("Crab Burger");
        crabBurger.setDescription("A german specialty!");
        crabBurger.setPrice(220);
        burgerRepository.save(crabBurger);
        Burger BarbecueBurger = new Burger();
        BarbecueBurger.setBurgerName("Barbecue Burger");
        BarbecueBurger.setDescription("American, raw, meaty");
        BarbecueBurger.setPrice(250);
        burgerRepository.save(BarbecueBurger);
        Burger fishBurger = new Burger();
        fishBurger.setBurgerName("Fish Burger");
        fishBurger.setDescription("Soft buns filled with the most delicate fish ready to be devoured");
        fishBurger.setPrice(200);
        burgerRepository.save(fishBurger);

        Juice pineappleClassic = new Juice();
        pineappleClassic.setJuiceName("PINEAPPLE CLASSIC");
        pineappleClassic.setDescription("Blended with a tinge of Lime");
        pineappleClassic.setPrice(300);
        juiceRepository.save(pineappleClassic);

        Juice bananaClassic = new Juice();
        bananaClassic.setJuiceName("BANANA CLASSIC");
        bananaClassic.setDescription("Blended with apple, chikoo, chia seeds, basil seeds, sunflower seeds, cashews and almonds");
        bananaClassic.setPrice(320);
        juiceRepository.save(bananaClassic);

        Juice bananaNutellaMagic = new Juice();
        bananaNutellaMagic.setJuiceName("BANANA NUTELLA MAGIC");
        bananaNutellaMagic.setDescription("Blended with chikoo, nutella, cashew, almonds, sunflower seeds and 10% dairy");
        bananaNutellaMagic.setPrice(350);
        juiceRepository.save(bananaNutellaMagic);

        Juice strawberryEpic = new Juice();
        strawberryEpic.setJuiceName("STRAWBERRY EPIC");
        strawberryEpic.setDescription("Blended with watermelon and basil seeds");
        strawberryEpic.setPrice(280);
        juiceRepository.save(strawberryEpic);


    }
}
/*
* {
        id: 'm1',
        name: 'Chicken Cheese Burger',
        description: 'Juicy chicken burger topped with cheddar cheese Dynamo sauce',
        price: 230,
    },
    {
        id: 'm2',
        name: 'Crab Burger',
        description: 'A german specialty!',
        price: 220,
    },
    {
        id: 'm3',
        name: 'Barbecue Burger',
        description: 'American, raw, meaty',
        price: 250,
    },
    {
        id: 'm4',
        name: 'Fish Burger',
        description: 'Soft buns filled with the most delicate fish ready to be devoured ',
        price: 200,
    },*/