package br.com.projetoloja.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.google.gson.Gson;

@Entity
public class Pedido implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true)
	private Integer numeroPedido;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Calendar data;
	
	private String nomeProduto;
	private BigDecimal valor;
	private int quantidade;
	private Integer codCliente;
	
	public Integer getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Integer getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(Integer codCliente) {
		this.codCliente = codCliente;
	}
	
	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", data=" + data + ", nomeProduto=" + nomeProduto + ", valor="
				+ valor + ", quantidade=" + quantidade + ", codCliente=" + codCliente + "]";
	}
	
	 public String toJson() {
	        return new Gson().toJson(this);
	    }
}
