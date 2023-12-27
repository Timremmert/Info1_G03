import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

class StringverarbeitungTest {

	@ParameterizedTest
	@CsvSource( {	
	"timmi_1234, 1234",
	"t_struppi_11223344, 11223344",
	"ts_7777777, 7777777",
	"t_str_01_3245233, 3245233",
	})
	void testAnonymisiere(String s, int code) {
		
		Stringverarbeitung sv = new Stringverarbeitung();
		
		assertThat(sv.anonymisiere(s),
				is(equalTo(code)));
	}

	@Test
	void testAnonymisiereSpaces() {

		Stringverarbeitung sv = new Stringverarbeitung();

		assertThat(sv.anonymisiere("timmi_1234567 "),
				is(equalTo(1234567)));

		assertThat(sv.anonymisiere(" timmi_1234567 "),
				is(equalTo(1234567)));

		assertThat(sv.anonymisiere(" timmi_1234567"),
				is(equalTo(1234567)));

	}
	
	@ParameterizedTest
	@CsvSource( {
		"racket, x, racket",
		"program, m, progra",
		"informatik, i, nformatk",
		"hello world, \' \', helloworld"
	} )
	void testStreiche(String s, char c, String out) {

		Stringverarbeitung sv = new Stringverarbeitung();
		
		assertThat(sv.streiche(s,c),
				is(equalTo(out)));
	}

}
