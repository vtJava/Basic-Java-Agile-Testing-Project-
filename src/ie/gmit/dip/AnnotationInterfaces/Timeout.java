package ie.gmit.dip.AnnotationInterfaces;

import java.util.concurrent.TimeUnit;

public @interface Timeout {

	int value();

	TimeUnit unit();

}
