package com.lojadegames.LojadeGames.security;

public class UserDetailsImpl {
	import java.util.Collection;
	import java.util.List;

	import com.springframework.security.core.GrantedAuthority;
	import com.springframework.security.core.userdetails.UserDetails;

	import com.generation.lojagames.model.Usuario;

	public class UserDetailsImpl implements UserDetails {
		private static final long serialVersionUID = 1L;

		private String userName;
		private String password;
		private List<GrantedAuthority> authorities;

		public UserDetailsImpl(Usuario usuario) {
			this.userName = usuario.getUsuario();
			this.password = usuario.getSenha();
		}

		public UserDetailsImpl() {
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return authorities;
		}

		@Override
		public String getPassword() {
			return password;
		}

		@Override
		public String getUsername() {

			return userName;
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return true;
		}
	}

}
