package registro.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import registro.usuario.service.UsuarioService;

import registro.usuario.model.Usuario;

@RestController
@RequestMapping("api/v1/usuarios")

public class UsuarioController {
	@Autowired
	public UsuarioService usuarioService;

	@GetMapping
	public List<Usuario> getusuarios() {
		return usuarioService.listarUsuarios();
	}

	@PostMapping("postusuario")
	public Usuario postUsuario(@RequestBody Usuario usuario) {
		return usuarioService.agregarUsuario(usuario);
	}

	@GetMapping("buscarid/{id}")
	public ResponseEntity<Usuario> getUsuarioId(@PathVariable Long id) {
		Usuario buscado = usuarioService.getUsuarioId(id).orElse(null);

		if (buscado == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(buscado, HttpStatus.OK);
	}

}
