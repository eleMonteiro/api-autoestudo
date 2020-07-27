package quixada.npi.springproject.service;


import java.util.List;

import quixada.npi.springproject.model.Usuario;

public interface UsuarioService {

    Usuario findByEmail(String email);

    List<Usuario> findAll();
    
    Usuario saveUser(Usuario usuario);

	Usuario findById(Integer id);

	void delete(Usuario usuario);

	List<Usuario> findByCursoId(Integer id);
    
}
