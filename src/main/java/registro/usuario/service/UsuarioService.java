package registro.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import registro.usuario.model.Usuario;
import registro.usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	public UsuarioRepository usuarioRepository;

	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
	}

	public Usuario agregarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
