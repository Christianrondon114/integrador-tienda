/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.ecommerce.i.model;


// HACE POSIBLE EL MODELADO DE LA BASE DE DATOS
import jakarta.persistence.*;
import java.util.List;


/**
 *
 * @author Ronaldinho
 */
@Entity      
//Quiere decir que la clase, es una entidad que se va a usar en la base de datos
@Table(name = "usuarios") 
//creación de una tabla en la base de datos con el nombre de 'usuarios'
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    private String nombre;
    private String username;
    private String email;
    private String telefono;
    private String tipo;
    private String password;
    
    //Se mapea con 'usuario' porque en Product.java hemos creado una variable Usuario usuario
    @OneToMany(mappedBy="usuario")
    private List<Product> productos;

    @OneToMany(mappedBy="usuario") 
    private List<Orden> ordenes;
    
    public Usuario() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getProductos() {
        return productos;
    }

    public void setProductos(List<Product> productos) {
        this.productos = productos;
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }
    

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", username=" + username + ", email=" + email + ", telefono=" + telefono + ", tipo=" + tipo + ", password=" + password + '}';
    }
    
    
}
