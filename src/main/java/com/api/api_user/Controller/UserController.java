package com.api.api_user.Controller;

import java.util.List;


import com.api.api_user.Entity.User;
import com.api.api_user.Repository.UserRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;
@RestController
@AllArgsConstructor
@RequestMapping("/user")

public class UserController {
    
    UserRepository userRepository;
    @PostMapping(value = "inserir")
    public User saveUser(@RequestBody User user)
    {
        return userRepository.save(user);
    }
    @GetMapping(value = "listar")
    public List<User> getAllUser()
    {
        return userRepository.findAll();
    }
    @GetMapping("/obter/{id}")
    public User getUserById(@PathVariable Long id)
    {
        return userRepository.findById(id).get();
    }
    @PutMapping(value="alterar")
    public void updateUser(@RequestBody User user)
    {
        if(user.getId() > 0)
        {
            userRepository.save(user);
        }
    }
    @DeleteMapping("/deletar/{id}")
    public void deleteUser(@PathVariable Long id)
    {
        if(id>0)
        {
            userRepository.deleteById(id);
        }
    }
    


}
