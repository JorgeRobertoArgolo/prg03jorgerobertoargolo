/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe base para entidades persistentes.
 * 
 * Fornece um identificador único gerado automaticamente para as subclasses.
 * Pode ser utilizada como superclasse para outras entidades JPA.
 */
@MappedSuperclass
public class PersistenceEntity {
    // Identificador único da entidade, gerado automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter private Long id;
}