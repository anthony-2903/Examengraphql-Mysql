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
public class Editorial {

    @Id
    @Column(name = "ideditorial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ideditorial;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "pais")
    private String pais;

    @OneToMany(mappedBy = "editorial")
    private Set<Libro> libros;

}

