package Checkstyle;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CheckstyleError.class)
public abstract class CheckstyleError_ {

	public static volatile SingularAttribute<CheckstyleError, String> severity;
	public static volatile SingularAttribute<CheckstyleError, Byte> line;
	public static volatile SingularAttribute<CheckstyleError, Byte> column;
	public static volatile SingularAttribute<CheckstyleError, String> checkSource;
	public static volatile SingularAttribute<CheckstyleError, Long> id;
	public static volatile SingularAttribute<CheckstyleError, String> message;

}

