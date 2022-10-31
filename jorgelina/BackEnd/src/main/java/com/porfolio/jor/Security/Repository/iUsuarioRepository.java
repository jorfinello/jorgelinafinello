/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.jor.Security.Repository;

import com.porfolio.jor.Security.Entity.Usuario;
import java.util.Optional;
import javax.validation.constraints.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> finByNombreUsuario (String nombreUsuario);
    boolean existsByNombreUsuario (String nombreUsuario);
    boolean existsByEmail (String email);

    public Optional<Usuario> findByNombreUsuario(String nombreUsuario);

    public Optional<Email> findByEmail(String email);

}
