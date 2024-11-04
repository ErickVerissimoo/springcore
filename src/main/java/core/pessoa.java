package core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class pessoa {
private String nome;
private int idade;
@Autowired carro meucar;
public carro getMeucar() {
	return meucar;
}
public void setMeucar(carro meucar) {
	this.meucar = meucar;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}


}
