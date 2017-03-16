package testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteMultiplicacao.class, TesteDivisao.class, TestaVetor.class })
public class AllTests {
}
