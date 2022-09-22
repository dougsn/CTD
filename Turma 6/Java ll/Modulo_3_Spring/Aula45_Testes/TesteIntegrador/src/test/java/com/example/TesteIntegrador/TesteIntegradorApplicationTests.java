package com.example.TesteIntegrador;

import com.example.TesteIntegrador.controller.LinguagemController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class) // Você precisa dessa anotação apenas para habilitar os recursos do Spring, Como por exemplo, @Autowired, @MocBean, durante os teste.
@WebMvcTest(LinguagemController.class) // Estou indicando de onde vai partir o meu teste.
class TesteIntegradorApplicationTests {


	@Autowired
	private MockMvc mockMvc; // Este recurso vai nos permitir que nos possamos acessar a URL.


	@Test
	void buscarTodasLinguagensAPI() throws Exception{

		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens")
				.accept(MediaType.APPLICATION_JSON)) // Estou indicando que ele ira aceitar arquivos do tipo JSON
				.andDo(MockMvcResultHandlers.print()) // Vai printar no console as informações adivindas deste comando.
				.andExpect(MockMvcResultMatchers.status().isOk()); // Aqqui eu indico o que ele espera.


	}

	@Test
	void buscarLinguagemPorTipo() throws Exception{

		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens/{tipo}", "Java")
						.accept(MediaType.APPLICATION_JSON)) // Estou indicando que ele ira aceitar arquivos do tipo JSON
				.andDo(MockMvcResultHandlers.print()) // Vai printar no console as informações adivindas deste comando.
				.andExpect(MockMvcResultMatchers.status().isOk()); // Aqqui eu indico o que ele espera.

	}

	@Test
	void buscarLinguagensNaoExistentesPorTipoAPI() throws Exception{

		mockMvc.perform(MockMvcRequestBuilders.get("/linguagens/{tipo}","Linguagem Error")
						.accept(MediaType.APPLICATION_JSON)) // Estou indicando que ele ira aceitar arquivos do tipo JSON
				.andDo(MockMvcResultHandlers.print()) // Vai printar no console as informações adivindas deste comando.
				.andExpect(MockMvcResultMatchers.status().isNotFound()); // Aqqui eu indico o que ele espera.


	}


	@Test
	void contextLoads() {
	}

}
