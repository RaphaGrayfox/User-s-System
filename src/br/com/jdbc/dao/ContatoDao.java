package br.com.jdbc.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import br.com.jdbc.ConnectionFactory;
import br.com.jdbc.modelo.Contato;

public class ContatoDao {
	
	private Connection connection;
	
	public ContatoDao(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Contato contato){
		String sql = "insert into data_users.usuarios" +
					"(nome,email,endereco,dataNascimento)" +
					"values (?,?,?,?)";
		try{
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
			
			stmt.setString(1,contato.getNome());
			stmt.setString(2,contato.getEmail());
			stmt.setString(3,contato.getEndereco());
			stmt.setDate(4,new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.execute();
			stmt.close();			
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	
	}
	
	public List<Contato> getLista(){
		try{
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = (PreparedStatement) this.connection.
					prepareStatement("select * from data_users.usuarios");
			ResultSet rs = stmt.executeQuery();
		
			while (rs.next()){
				 Contato contato = new Contato();
				 contato.setNome(rs.getString("nome"));
				 contato.setEmail(rs.getString("email"));
				 contato.setEndereco(rs.getString("endereco"));
				 
				 Calendar data = Calendar.getInstance();
				 data.setTime(rs.getDate("dataNascimento"));
				 contato.setDataNascimento(data);
				 
				 contatos.add(contato);
			 }
			 rs.close();
			 stmt.close();
			 return contatos;
		 
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	
}
