package com.ProjectoIntegrador.ProyectoIntegrador.Service;

import com.ProjectoIntegrador.ProyectoIntegrador.Model.User; // Asegúrate de que la clase User esté en el paquete correcto

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
