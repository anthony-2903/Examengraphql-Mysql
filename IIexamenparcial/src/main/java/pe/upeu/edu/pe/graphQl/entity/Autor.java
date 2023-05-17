package pe.upeu.edu.pe.graphQl.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Autor {

    @Id
    @Column(name = "idautor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idautor;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "pais")
    private String pais;

    @OneToMany(mappedBy = "autor")
    private Set<Libro> libros;
}
