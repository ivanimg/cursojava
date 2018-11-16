package es.indra.demoblog.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

@Aspect
@Configuration
public class LogAspect {

	@Before("execution(* es.indra.demoblog.service.impl.*.*(..))")
	public void antesDeLosMetodos(JoinPoint join) {

		System.out.println("Dentro del aspecto para " + join);
	}

	@Around("@annotation(es.indra.demoblog.aspects.annotation.MedidorDeTiempo)")
	public void duracionRest(ProceedingJoinPoint pjoin) throws Throwable {

		StopWatch sw = new StopWatch();
		try {
			sw.start(pjoin.getTarget() + "." + pjoin.getSignature());
			pjoin.proceed();
		} catch (Throwable e) {
			throw e;
		} finally {
			sw.stop();
			System.out.println(sw.prettyPrint());
		}
	}
}
