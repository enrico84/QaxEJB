package it.capone.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-08-10T15:06:10.527+0200")
@StaticMetamodel(Categoria.class)
public class Categoria_ {
	public static volatile SingularAttribute<Categoria, Integer> idcategoria;
	public static volatile SingularAttribute<Categoria, String> nome;
	public static volatile ListAttribute<Categoria, Domanda> domandas;
}
