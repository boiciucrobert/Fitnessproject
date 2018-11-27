package org.fasttrackit.fitness;

import org.fasttrackit.fitness.domain.Shop;
import org.fasttrackit.fitness.domain.User;
import org.fasttrackit.fitness.service.ShopService;
import org.fasttrackit.fitness.service.UserSerivce;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ttritean
 * @since 11/13/2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = FitnessProjectApplication.class, loader = SpringApplicationContextLoader.class, initializers = ConfigFileApplicationContextInitializer.class)
public class UserIntegrationTest {


    @Autowired
    private UserSerivce userService;



    @Test
    public void testSave() {


        User user =new User();
        user.setUsername("robert");
        user.setFirstName("Andrei");
        user.setLastName("Boiciuc");

        userService.saveUser(user);
    }

}
