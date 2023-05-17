package pe.upeu.edu.pe.graphQl.dto;

public record LibroRequest(
        Integer idlibro,
        String titulo,
        String descripcion,
        Integer paginas,
        String edicion,
        int idautor,
        int ideditorial

) {
}
