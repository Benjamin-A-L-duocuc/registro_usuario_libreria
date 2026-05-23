package registro.usuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import registro.usuario.model.TipoUsuario;
import registro.usuario.model.Usuario;
import registro.usuario.repository.TipoUsuarioRepository;
import registro.usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	public UsuarioRepository usuarioRepository;
	@Autowired
	public TipoUsuarioRepository tipoUsuarioRepository;

	public List<Usuario> listarUsuarios() {
		return usuarioRepository.findAll();
	}

	/*
	 * public Usuario agregarUsuario(Usuario usuario) {
	 * Long idTipo = usuario.getIdTipoUsuario();
	 * if (tipoUsuarioRepository.findById(idTipo) == null) {
	 * usuario.setTipoUsuario(null);
	 * } else {
	 * TipoUsuario tipo = tipoUsuarioRepository.findById(idTipo).orElse(null);
	 * usuario.setTipoUsuario(tipo.getNombre());
	 * }
	 * 
	 * return usuarioRepository.save(usuario);
	 * }
	 */

	public Usuario agregarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Optional<Usuario> getUsuarioId(Long id) {
		return usuarioRepository.findById(id);
	}

}
