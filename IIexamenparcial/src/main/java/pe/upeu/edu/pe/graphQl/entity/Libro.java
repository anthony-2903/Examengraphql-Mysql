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
public class Libro {

    @Id
    @Column(name = "idlibro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idlibro;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "paginas")
    private Integer paginas;

    @Column(name = "edicion")
    private String edicion;

    @ManyToOne
    @JoinColumn(name="idautor", nullable=false)
    private Autor autor;

    @ManyToOne
    @JoinColumn(name="ideditorial", nullable=false)
    private Editorial editorial;

}