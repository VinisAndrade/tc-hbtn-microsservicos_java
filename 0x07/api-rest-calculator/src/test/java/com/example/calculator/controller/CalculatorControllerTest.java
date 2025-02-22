@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void messageWelcome() throws Exception {
       RequestBuilder request = get("/calculator/welcome");
       MvcResult result = mvc.perform(request).andReturn();
       assertEquals("Bem vindo à CALCULATOR API REST.", result.getResponse().getContentAsString());
    }

    @Test
    void addNumbers() throws Exception {
         // TODO
    }

    // TODO - Implementar os demais métodos: subNumbers, divideNumbers, factorial, 
    //        calculeDayBetweenDate, integerToBinary e integerToHexadecimal
}