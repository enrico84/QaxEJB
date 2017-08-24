package it.capone.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-08-24T11:18:39.806+0200")
@StaticMetamodel(Categoria.class)
public class Categoria_ {
	public static volatile SingularAttribute<Categoria, Integer> idcategoria;
	public static volatile SingularAttribute<Categoria, String> nome;
	public static volatile ListAttribute<Categoria, Domanda> domandas;
}
